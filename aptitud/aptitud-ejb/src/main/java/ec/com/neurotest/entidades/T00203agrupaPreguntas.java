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
@Table(name = "T002_03AGRUPA_PREGUNTAS")
@NamedQueries({
    @NamedQuery(name = "T00203agrupaPreguntas.findAll", query = "SELECT t FROM T00203agrupaPreguntas t")})
public class T00203agrupaPreguntas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGRUPA_PREGUNTAS")
    private BigDecimal idAgrupaPreguntas;
    @Column(name = "ID_AGRUPADOR")
    private BigInteger idAgrupador;
    @Column(name = "ID_PREGRESP")
    private BigInteger idPregresp;

    public T00203agrupaPreguntas() {
    }

    public T00203agrupaPreguntas(BigDecimal idAgrupaPreguntas) {
        this.idAgrupaPreguntas = idAgrupaPreguntas;
    }

    public BigDecimal getIdAgrupaPreguntas() {
        return idAgrupaPreguntas;
    }

    public void setIdAgrupaPreguntas(BigDecimal idAgrupaPreguntas) {
        this.idAgrupaPreguntas = idAgrupaPreguntas;
    }

    public BigInteger getIdAgrupador() {
        return idAgrupador;
    }

    public void setIdAgrupador(BigInteger idAgrupador) {
        this.idAgrupador = idAgrupador;
    }

    public BigInteger getIdPregresp() {
        return idPregresp;
    }

    public void setIdPregresp(BigInteger idPregresp) {
        this.idPregresp = idPregresp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgrupaPreguntas != null ? idAgrupaPreguntas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00203agrupaPreguntas)) {
            return false;
        }
        T00203agrupaPreguntas other = (T00203agrupaPreguntas) object;
        if ((this.idAgrupaPreguntas == null && other.idAgrupaPreguntas != null) || (this.idAgrupaPreguntas != null && !this.idAgrupaPreguntas.equals(other.idAgrupaPreguntas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00203agrupaPreguntas[ idAgrupaPreguntas=" + idAgrupaPreguntas + " ]";
    }
    
}
