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
@Table(name = "T004_02INSCRIPCIONUSUARIOS")
@NamedQueries({
    @NamedQuery(name = "T00402inscripcionusuarios.findAll", query = "SELECT t FROM T00402inscripcionusuarios t")})
public class T00402inscripcionusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSUSUA")
    private BigDecimal idInsusua;
    @Column(name = "HABILITA_TEST")
    private BigInteger habilitaTest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private BigInteger idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSCMATRICULA")
    private BigInteger idInscmatricula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO_INSCMATR")
    private BigInteger estadoInscmatr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_A_PAGAR")
    private double valorAPagar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
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

    public T00402inscripcionusuarios() {
    }

    public T00402inscripcionusuarios(BigDecimal idInsusua) {
        this.idInsusua = idInsusua;
    }

    public T00402inscripcionusuarios(BigDecimal idInsusua, BigInteger idUsuario, BigInteger idInscmatricula, BigInteger estadoInscmatr, double valorAPagar, Date fechaRegistro, Date periodoInicia, Date periodoFin) {
        this.idInsusua = idInsusua;
        this.idUsuario = idUsuario;
        this.idInscmatricula = idInscmatricula;
        this.estadoInscmatr = estadoInscmatr;
        this.valorAPagar = valorAPagar;
        this.fechaRegistro = fechaRegistro;
        this.periodoInicia = periodoInicia;
        this.periodoFin = periodoFin;
    }

    public BigDecimal getIdInsusua() {
        return idInsusua;
    }

    public void setIdInsusua(BigDecimal idInsusua) {
        this.idInsusua = idInsusua;
    }

    public BigInteger getHabilitaTest() {
        return habilitaTest;
    }

    public void setHabilitaTest(BigInteger habilitaTest) {
        this.habilitaTest = habilitaTest;
    }

    public BigInteger getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigInteger idUsuario) {
        this.idUsuario = idUsuario;
    }

    public BigInteger getIdInscmatricula() {
        return idInscmatricula;
    }

    public void setIdInscmatricula(BigInteger idInscmatricula) {
        this.idInscmatricula = idInscmatricula;
    }

    public BigInteger getEstadoInscmatr() {
        return estadoInscmatr;
    }

    public void setEstadoInscmatr(BigInteger estadoInscmatr) {
        this.estadoInscmatr = estadoInscmatr;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInsusua != null ? idInsusua.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00402inscripcionusuarios)) {
            return false;
        }
        T00402inscripcionusuarios other = (T00402inscripcionusuarios) object;
        if ((this.idInsusua == null && other.idInsusua != null) || (this.idInsusua != null && !this.idInsusua.equals(other.idInsusua))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00402inscripcionusuarios[ idInsusua=" + idInsusua + " ]";
    }
    
}
