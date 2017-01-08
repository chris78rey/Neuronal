/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades;

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
@Table(name = "T004_01INSCRMATRICULA")
@NamedQueries({
    @NamedQuery(name = "T00401inscrmatricula.findAll", query = "SELECT t FROM T00401inscrmatricula t")})
public class T00401inscrmatricula implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSCMATRICULA")
    private BigDecimal idInscmatricula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "DESCRIP_MATRICULA")
    private String descripMatricula;
    @Column(name = "ESTADO")
    private BigInteger estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERIODO_INICIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodoInicia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERIODO_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodoFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COSTO_ACTUAL")
    private double costoActual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TIEMPO_EN_MINUTOS")
    private BigInteger tiempoEnMinutos;
    @Column(name = "TEMPORIZADO")
    private BigInteger temporizado;

    public T00401inscrmatricula() {
    }

    public T00401inscrmatricula(BigDecimal idInscmatricula) {
        this.idInscmatricula = idInscmatricula;
    }

    public T00401inscrmatricula(BigDecimal idInscmatricula, String descripMatricula, Date periodoInicia, Date periodoFin, double costoActual, BigInteger tiempoEnMinutos) {
        this.idInscmatricula = idInscmatricula;
        this.descripMatricula = descripMatricula;
        this.periodoInicia = periodoInicia;
        this.periodoFin = periodoFin;
        this.costoActual = costoActual;
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    public BigDecimal getIdInscmatricula() {
        return idInscmatricula;
    }

    public void setIdInscmatricula(BigDecimal idInscmatricula) {
        this.idInscmatricula = idInscmatricula;
    }

    public String getDescripMatricula() {
        return descripMatricula;
    }

    public void setDescripMatricula(String descripMatricula) {
        this.descripMatricula = descripMatricula;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    public Date getPeriodoInicia() {
        return periodoInicia;
    }

    public void setPeriodoInicia(Date periodoInicia) {
        this.periodoInicia = periodoInicia;
    }

    public Date getPeriodoFin() {
        return periodoFin;
    }

    public void setPeriodoFin(Date periodoFin) {
        this.periodoFin = periodoFin;
    }

    public double getCostoActual() {
        return costoActual;
    }

    public void setCostoActual(double costoActual) {
        this.costoActual = costoActual;
    }

    public BigInteger getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(BigInteger tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    public BigInteger getTemporizado() {
        return temporizado;
    }

    public void setTemporizado(BigInteger temporizado) {
        this.temporizado = temporizado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscmatricula != null ? idInscmatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00401inscrmatricula)) {
            return false;
        }
        T00401inscrmatricula other = (T00401inscrmatricula) object;
        if ((this.idInscmatricula == null && other.idInscmatricula != null) || (this.idInscmatricula != null && !this.idInscmatricula.equals(other.idInscmatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00401inscrmatricula[ idInscmatricula=" + idInscmatricula + " ]";
    }
    
}
