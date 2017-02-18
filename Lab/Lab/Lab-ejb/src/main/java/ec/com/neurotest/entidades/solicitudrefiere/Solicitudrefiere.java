/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.solicitudrefiere;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "T001_02REFIERE_X_SOLIC")
@NamedQueries({
    @NamedQuery(name = "Solicitudrefiere.findAll", query = "SELECT s FROM Solicitudrefiere s")})
public class Solicitudrefiere implements Serializable {

    private static final long serialVersionUID = -1919924577820870371L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COL_X_EXAM")
    private BigDecimal idColXExam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SOLICITUD")
    private BigInteger idSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMPLEADO")
    private BigInteger idEmpleado;
    @Column(name = "VALOR_DEUDA_AL_QUE_REFIERE")
    private Double valorDeudaAlQueRefiere;

    public Solicitudrefiere() {
    }

    public Solicitudrefiere(BigDecimal idColXExam) {
        this.idColXExam = idColXExam;
    }

    public Solicitudrefiere(BigDecimal idColXExam, BigInteger idSolicitud, BigInteger idEmpleado) {
        this.idColXExam = idColXExam;
        this.idSolicitud = idSolicitud;
        this.idEmpleado = idEmpleado;
    }

    public BigDecimal getIdColXExam() {
        return idColXExam;
    }

    public void setIdColXExam(BigDecimal idColXExam) {
        this.idColXExam = idColXExam;
    }

    public BigInteger getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(BigInteger idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public BigInteger getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(BigInteger idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getValorDeudaAlQueRefiere() {
        return valorDeudaAlQueRefiere;
    }

    public void setValorDeudaAlQueRefiere(Double valorDeudaAlQueRefiere) {
        this.valorDeudaAlQueRefiere = valorDeudaAlQueRefiere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idColXExam != null ? idColXExam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitudrefiere)) {
            return false;
        }
        Solicitudrefiere other = (Solicitudrefiere) object;
        if ((this.idColXExam == null && other.idColXExam != null) || (this.idColXExam != null && !this.idColXExam.equals(other.idColXExam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.solicitudrefiere.Solicitudrefiere[ idColXExam=" + idColXExam + " ]";
    }

}
