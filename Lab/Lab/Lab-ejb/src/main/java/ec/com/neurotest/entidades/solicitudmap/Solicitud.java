/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.solicitudmap;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "T001_01SOLICITUD")
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "ID_QUIEN_FACTURA")
    private BigInteger idQuienFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PACIENTE")
    private BigInteger idPaciente;
    @Size(max = 30)
    @Column(name = "NUMERO_SOLIC")
    private String numeroSolic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
//    @Column(name = "ID_REFIERE")
//    private BigInteger idRefiere;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DESCUENTO")
    private BigInteger descuento;
    @Size(max = 400)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "SOLICITUD_ACTIVA")
    private BigInteger solicitudActiva;


    public Solicitud() {
    }

    public Solicitud(BigDecimal id) {
        this.id = id;
    }

    public Solicitud(BigDecimal id, BigInteger idPaciente, Date fechaSolicitud, BigInteger descuento, Date fechaCompleta) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.fechaSolicitud = fechaSolicitud;
        this.descuento = descuento;

    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getIdQuienFactura() {
        return idQuienFactura;
    }

    public void setIdQuienFactura(BigInteger idQuienFactura) {
        this.idQuienFactura = idQuienFactura;
    }

    public BigInteger getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(BigInteger idPaciente) {
        this.idPaciente = idPaciente;
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

//    public BigInteger getIdRefiere() {
//        return idRefiere;
//    }
//
//    public void setIdRefiere(BigInteger idRefiere) {
//        this.idRefiere = idRefiere;
//    }

    public BigInteger getDescuento() {
        return descuento;
    }

    public void setDescuento(BigInteger descuento) {
        this.descuento = descuento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigInteger getSolicitudActiva() {
        return solicitudActiva;
    }

    public void setSolicitudActiva(BigInteger solicitudActiva) {
        this.solicitudActiva = solicitudActiva;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.solicitudmap.Solicitud[ id=" + id + " ]";
    }

}
