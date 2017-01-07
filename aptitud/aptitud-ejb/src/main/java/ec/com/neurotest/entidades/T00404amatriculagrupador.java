/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades;

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
@Table(name = "T004_04AMATRICULAGRUPADOR")
@NamedQueries({
    @NamedQuery(name = "T00404amatriculagrupador.findAll", query = "SELECT t FROM T00404amatriculagrupador t")})
public class T00404amatriculagrupador implements Serializable {

    private static final long serialVersionUID = -7192514986862400321L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGRMATR")
    private BigDecimal idAgrmatr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSCMATRICULA")
    private BigInteger idInscmatricula;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGRUPADOR")
    private BigInteger idAgrupador;

    public T00404amatriculagrupador() {
    }

    public T00404amatriculagrupador(BigDecimal idAgrmatr) {
        this.idAgrmatr = idAgrmatr;
    }

    public T00404amatriculagrupador(BigDecimal idAgrmatr, BigInteger idInscmatricula, BigInteger idAgrupador) {
        this.idAgrmatr = idAgrmatr;
        this.idInscmatricula = idInscmatricula;
        this.idAgrupador = idAgrupador;
    }

    public BigDecimal getIdAgrmatr() {
        return idAgrmatr;
    }

    public void setIdAgrmatr(BigDecimal idAgrmatr) {
        this.idAgrmatr = idAgrmatr;
    }

    public BigInteger getIdInscmatricula() {
        return idInscmatricula;
    }

    public void setIdInscmatricula(BigInteger idInscmatricula) {
        this.idInscmatricula = idInscmatricula;
    }

    public BigInteger getIdAgrupador() {
        return idAgrupador;
    }

    public void setIdAgrupador(BigInteger idAgrupador) {
        this.idAgrupador = idAgrupador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgrmatr != null ? idAgrmatr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00404amatriculagrupador)) {
            return false;
        }
        T00404amatriculagrupador other = (T00404amatriculagrupador) object;
        if ((this.idAgrmatr == null && other.idAgrmatr != null) || (this.idAgrmatr != null && !this.idAgrmatr.equals(other.idAgrmatr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00404amatriculagrupador[ idAgrmatr=" + idAgrmatr + " ]";
    }
    
}
