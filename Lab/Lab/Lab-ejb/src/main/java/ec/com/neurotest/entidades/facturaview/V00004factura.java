/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.facturaview;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V000_04FACTURA")
@NamedQueries({
    @NamedQuery(name = "V00004factura.findAll", query = "SELECT v FROM V00004factura v")})
public class V00004factura implements Serializable {

    private static final long serialVersionUID = 4020861097530894568L;

    @Column(name = "SOLXITEMID")
    @Id
    private BigInteger solxitemid;
    @Column(name = "ID")
    private BigInteger id;
    @Size(max = 60)
    @Column(name = "CC")
    private String cc;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 100)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 300)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Size(max = 4000)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 50)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 100)
    @Column(name = "CELULAR")
    private String celular;
    @Size(max = 30)
    @Column(name = "NUMERO_SOLIC")
    private String numeroSolic;
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Column(name = "DESCUENTO")
    private BigInteger descuento;
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
    @Size(max = 4000)
    @Column(name = "ITEM")
    private String item;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUBTOTAL")
    private Double subtotal;
    @Column(name = "IVA_ACTUAL")
    private Double ivaActual;
    @Column(name = "MONTO_IVA")
    private Double montoIva;
    @Column(name = "TOTAL_EN_FACTURA")
    private Double totalEnFactura;
    @Column(name = "PORC_PARTICIPA")
    private Double porcParticipa;
    @Column(name = "PARTICIPACION_REFIERE")
    private Double participacionRefiere;
    @Column(name = "LIQUIDO_RECIBE_LABORATORIO")
    private Double liquidoRecibeLaboratorio;
    @Size(max = 400)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Size(max = 201)
    @Column(name = "NOMBRE_DEL_QUE_ATIENDE")
    private String nombreDelQueAtiende;
    @Column(name = "SUBTOTAL_FACTURA")
    private BigInteger subtotalFactura;
    @Column(name = "MONTO_IVA__FACTURA")
    private BigInteger montoIvaFactura;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "PORC_PARTICIPA_FACTURA")
    private BigInteger porcParticipaFactura;
    @Column(name = "PARTICIPACION_REFIERE_TOTAL")
    private BigInteger participacionRefiereTotal;
    @Column(name = "LIQUIDO_RECIBE")
    private BigInteger liquidoRecibe;

    public V00004factura() {
    }

    public BigInteger getSolxitemid() {
        return solxitemid;
    }

    public void setSolxitemid(BigInteger solxitemid) {
        this.solxitemid = solxitemid;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroSolic() {
        return numeroSolic;
    }

    public void setNumeroSolic(String numeroSolic) {
        this.numeroSolic = numeroSolic;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public BigInteger getDescuento() {
        return descuento;
    }

    public void setDescuento(BigInteger descuento) {
        this.descuento = descuento;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIvaActual() {
        return ivaActual;
    }

    public void setIvaActual(Double ivaActual) {
        this.ivaActual = ivaActual;
    }

    public Double getMontoIva() {
        return montoIva;
    }

    public void setMontoIva(Double montoIva) {
        this.montoIva = montoIva;
    }

    public Double getTotalEnFactura() {
        return totalEnFactura;
    }

    public void setTotalEnFactura(Double totalEnFactura) {
        this.totalEnFactura = totalEnFactura;
    }

    public Double getPorcParticipa() {
        return porcParticipa;
    }

    public void setPorcParticipa(Double porcParticipa) {
        this.porcParticipa = porcParticipa;
    }

    public Double getParticipacionRefiere() {
        return participacionRefiere;
    }

    public void setParticipacionRefiere(Double participacionRefiere) {
        this.participacionRefiere = participacionRefiere;
    }

    public Double getLiquidoRecibeLaboratorio() {
        return liquidoRecibeLaboratorio;
    }

    public void setLiquidoRecibeLaboratorio(Double liquidoRecibeLaboratorio) {
        this.liquidoRecibeLaboratorio = liquidoRecibeLaboratorio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNombreDelQueAtiende() {
        return nombreDelQueAtiende;
    }

    public void setNombreDelQueAtiende(String nombreDelQueAtiende) {
        this.nombreDelQueAtiende = nombreDelQueAtiende;
    }

    public BigInteger getSubtotalFactura() {
        return subtotalFactura;
    }

    public void setSubtotalFactura(BigInteger subtotalFactura) {
        this.subtotalFactura = subtotalFactura;
    }

    public BigInteger getMontoIvaFactura() {
        return montoIvaFactura;
    }

    public void setMontoIvaFactura(BigInteger montoIvaFactura) {
        this.montoIvaFactura = montoIvaFactura;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigInteger getPorcParticipaFactura() {
        return porcParticipaFactura;
    }

    public void setPorcParticipaFactura(BigInteger porcParticipaFactura) {
        this.porcParticipaFactura = porcParticipaFactura;
    }

    public BigInteger getParticipacionRefiereTotal() {
        return participacionRefiereTotal;
    }

    public void setParticipacionRefiereTotal(BigInteger participacionRefiereTotal) {
        this.participacionRefiereTotal = participacionRefiereTotal;
    }

    public BigInteger getLiquidoRecibe() {
        return liquidoRecibe;
    }

    public void setLiquidoRecibe(BigInteger liquidoRecibe) {
        this.liquidoRecibe = liquidoRecibe;
    }

}
