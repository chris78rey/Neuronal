/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.facturaingreso;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V001_FACTURAINGRESO")
@NamedQueries({
    @NamedQuery(name = "V001Facturaingreso.findAll", query = "SELECT v FROM V001Facturaingreso v")})
public class V001Facturaingreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CABECERA_FACT")
    @Id
    private BigInteger idCabeceraFact;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Size(max = 100)
    @Column(name = "NUMERO_FACTURA")
    private String numeroFactura;

    @Column(name = "ID_SOLICITUD")
    private String idsolicitud;

    public V001Facturaingreso() {
    }

    public BigInteger getIdCabeceraFact() {
        return idCabeceraFact;
    }

    public void setIdCabeceraFact(BigInteger idCabeceraFact) {
        this.idCabeceraFact = idCabeceraFact;
    }

    public String getNombreOrg() {
        return nombreOrg;
    }

    public void setNombreOrg(String nombreOrg) {
        this.nombreOrg = nombreOrg;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * @return the idsolicitud
     */
    public String getIdsolicitud() {
        return idsolicitud;
    }

    /**
     * @param idsolicitud the idsolicitud to set
     */
    public void setIdsolicitud(String idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

}
