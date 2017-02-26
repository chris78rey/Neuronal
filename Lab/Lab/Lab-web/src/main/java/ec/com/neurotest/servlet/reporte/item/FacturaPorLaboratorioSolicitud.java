/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.servlet.reporte.item;

import ec.com.neurotest.entidades.generafactura.V001GeneraFactura;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author crrb
 */
@WebServlet(name = "FacturaPorLaboratorioSolicitud", urlPatterns = {"/fact"})
public class FacturaPorLaboratorioSolicitud extends HttpServlet {

    private static final long serialVersionUID = -8115250299848806687L;
    @Resource(name = "labs")
    transient private DataSource labs;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws net.sf.jasperreports.engine.JRException
     * @throws java.sql.SQLException
     */
    private V001GeneraFactura registroSeleccionado;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, JRException, SQLException {
        ServletContext servletContext = request.getSession().getServletContext();
        HttpSession session = request.getSession();

        response.setContentType("text/html;charset=UTF-8");
        HashMap hashMap = new HashMap();
        //aca se coloca los parámetros del reporte
        try {
            registroSeleccionado = (V001GeneraFactura) session.getAttribute("registroSeleccionado");

        } catch (Exception e) {
            hashMap.put("p1_org", "0");
            hashMap.put("p2_soli", "0");

        }

        try {
            hashMap.put("p1_org", registroSeleccionado.getIdOrg().toString());
            hashMap.put("p2_soli", registroSeleccionado.getIdsolic().toString());

        } catch (Exception e) {
            hashMap.put("p1_org", "0");
            hashMap.put("p2_soli", "0");

        }

        Connection connection = null;
        byte[] bytes = null;
        try {

            //se obtiene la conexion a la base de datos
            connection = labs.getConnection();
            //dentro de la carpeta WEB-INF se debe colocar los reportes, 
            //en este caso se coloca los .jrxml no el .jasper
            String jrxmlPath = servletContext.getRealPath("/WEB-INF/report/");
            // directories where the report files are 
            String reportfile = "reportsolicitud.jrxml";
            ///home/crrb/NetBeansProjects/test/Lab/Lab/Lab-web/src/main/webapp/WEB-INF/report/FACTURA.jrxml
            String jrxmlfile = jrxmlPath + "/" + reportfile;
            JasperReport jasperReport = null;
            try {
                //InputStream is = this.getClass().getClassLoader().getResourceAsStream("/WEB-INF/report/"+jrxmlfile);
                //is.close();
                jasperReport = JasperCompileManager.compileReport(jrxmlfile);

            } catch (Exception e) {
                System.out.println("e = " + e.getLocalizedMessage());
            }

            //se envia los parametros en este caso el compilado, el hashmap con los param del reporte y la conexión 
            //a la base de datos
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hashMap, connection);
            //se almacena la impresión en un arreglo de bytes    
            bytes = JasperExportManager.exportReportToPdf(jasperPrint);

            try {
                session.removeAttribute("registroSeleccionado");

            } catch (Exception e) {
            }

        } catch (JRException | SQLException e) {
            System.out.println("e = " + e.getLocalizedMessage());

        } finally {
            //se cierra la conexion

            connection.close();
        }

        response.setHeader("Content-disposition", "inline;filename=morningShift.pdf;");
        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);

        response.getOutputStream().write(bytes);
        response.flushBuffer();

    }
    private static final Logger LOG = Logger.getLogger(Items.class.getName());

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (JRException | SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (JRException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
