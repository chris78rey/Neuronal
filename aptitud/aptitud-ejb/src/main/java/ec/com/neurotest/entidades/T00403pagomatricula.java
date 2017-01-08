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
@Table(name = "T004_03PAGOMATRICULA")
@NamedQueries({
    @NamedQuery(name = "T00403pagomatricula.findAll", query = "SELECT t FROM T00403pagomatricula t")})
public class T00403pagomatricula implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PAGOMATRI")
    private BigDecimal idPagomatri;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSUSUA")
    private BigInteger idInsusua;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAGO_PARCIAL")
    private double pagoParcial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Column(name = "PAGO_REAL")
    private BigInteger pagoReal;

    public T00403pagomatricula() {
    }

    public T00403pagomatricula(BigDecimal idPagomatri) {
        this.idPagomatri = idPagomatri;
    }

    public T00403pagomatricula(BigDecimal idPagomatri, BigInteger idInsusua, double pagoParcial, Date fechaPago) {
        this.idPagomatri = idPagomatri;
        this.idInsusua = idInsusua;
        this.pagoParcial = pagoParcial;
        this.fechaPago = fechaPago;
    }

    public BigDecimal getIdPagomatri() {
        return idPagomatri;
    }

    public void setIdPagomatri(BigDecimal idPagomatri) {
        this.idPagomatri = idPagomatri;
    }

    public BigInteger getIdInsusua() {
        return idInsusua;
    }

    public void setIdInsusua(BigInteger idInsusua) {
        this.idInsusua = idInsusua;
    }

    public double getPagoParcial() {
        return pagoParcial;
    }

    public void setPagoParcial(double pagoParcial) {
        this.pagoParcial = pagoParcial;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigInteger getPagoReal() {
        return pagoReal;
    }

    public void setPagoReal(BigInteger pagoReal) {
        this.pagoReal = pagoReal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPagomatri != null ? idPagomatri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00403pagomatricula)) {
            return false;
        }
        T00403pagomatricula other = (T00403pagomatricula) object;
        if ((this.idPagomatri == null && other.idPagomatri != null) || (this.idPagomatri != null && !this.idPagomatri.equals(other.idPagomatri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00403pagomatricula[ idPagomatri=" + idPagomatri + " ]";
    }
    
}
