/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.generafactura;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V001_GENERA_FACTURA")
@NamedQueries({
    @NamedQuery(name = "V001GeneraFactura.findAll", query = "SELECT v FROM V001GeneraFactura v")})
public class V001GeneraFactura implements Serializable {

    private static final long serialVersionUID = -8269335845828660395L;

    @Size(max = 88)
    @Column(name = "PK")
    @Id
    private String pk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CC_PAGA")
    private String ccPaga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE_PAGA")
    private String nombrePaga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APELL_PAGA")
    private String apellPaga;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORG")
    private BigInteger idOrg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOLIC")
    private BigInteger idsolic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CED_PACIENTE")
    private String cedPaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE_PACIENTE")
    private String nombrePaciente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APELLIDO_PACIENTE")
    private String apellidoPaciente;

    @Column(name = "NUMERO_FACTURA")
    private String nofact;

    public V001GeneraFactura() {
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getCcPaga() {
        return ccPaga;
    }

    public void setCcPaga(String ccPaga) {
        this.ccPaga = ccPaga;
    }

    public String getNombrePaga() {
        return nombrePaga;
    }

    public void setNombrePaga(String nombrePaga) {
        this.nombrePaga = nombrePaga;
    }

    public String getApellPaga() {
        return apellPaga;
    }

    public void setApellPaga(String apellPaga) {
        this.apellPaga = apellPaga;
    }

    public String getNombreOrg() {
        return nombreOrg;
    }

    public void setNombreOrg(String nombreOrg) {
        this.nombreOrg = nombreOrg;
    }

    public BigInteger getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(BigInteger idOrg) {
        this.idOrg = idOrg;
    }

    public BigInteger getIdsolic() {
        return idsolic;
    }

    public void setIdsolic(BigInteger idsolic) {
        this.idsolic = idsolic;
    }

    public String getCedPaciente() {
        return cedPaciente;
    }

    public void setCedPaciente(String cedPaciente) {
        this.cedPaciente = cedPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    /**
     * @return the nofact
     */
    public String getNofact() {
        return nofact;
    }

    /**
     * @param nofact the nofact to set
     */
    public void setNofact(String nofact) {
        this.nofact = nofact;
    }

}
