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

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "T004_04TEST_X_USUARIO")
@NamedQueries({
    @NamedQuery(name = "T00404testXUsuario.findAll", query = "SELECT t FROM T00404testXUsuario t")})
public class T00404testXUsuario implements Serializable {

    private static final long serialVersionUID = -5963488923890002106L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TESTUSUARIO")
    private BigDecimal idTestusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "TIEMPO_EN_MINUTOS")
    private BigInteger tiempoEnMinutos;
    @Column(name = "TEMPORIZADO")
    private BigInteger temporizado;
    @Column(name = "FECHA_FIN_EXAMEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinExamen;

    public T00404testXUsuario() {
    }

    public T00404testXUsuario(BigDecimal idTestusuario) {
        this.idTestusuario = idTestusuario;
    }

    public T00404testXUsuario(BigDecimal idTestusuario, Date fechaIngreso) {
        this.idTestusuario = idTestusuario;
        this.fechaIngreso = fechaIngreso;
    }

    public BigDecimal getIdTestusuario() {
        return idTestusuario;
    }

    public void setIdTestusuario(BigDecimal idTestusuario) {
        this.idTestusuario = idTestusuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
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

    public Date getFechaFinExamen() {
        return fechaFinExamen;
    }

    public void setFechaFinExamen(Date fechaFinExamen) {
        this.fechaFinExamen = fechaFinExamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTestusuario != null ? idTestusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00404testXUsuario)) {
            return false;
        }
        T00404testXUsuario other = (T00404testXUsuario) object;
        if ((this.idTestusuario == null && other.idTestusuario != null) || (this.idTestusuario != null && !this.idTestusuario.equals(other.idTestusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00404testXUsuario[ idTestusuario=" + idTestusuario + " ]";
    }
    
}
