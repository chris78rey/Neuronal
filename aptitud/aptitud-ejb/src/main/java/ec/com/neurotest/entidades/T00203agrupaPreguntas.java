/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @JoinColumn(name = "ID_PREGRESP", referencedColumnName = "ID_PREGRESP")
    @ManyToOne(fetch = FetchType.LAZY)
    private T00202preguntasYRespuestas t00202preguntasYRespuestas;
    @JoinColumn(name = "ID_AGRUPADOR", referencedColumnName = "ID_AGRUPADOR")
    @ManyToOne(fetch = FetchType.LAZY)
    private T00201agrupador t00201agrupador;

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

    public T00202preguntasYRespuestas getT00202preguntasYRespuestas() {
        return t00202preguntasYRespuestas;
    }

    public void setT00202preguntasYRespuestas(T00202preguntasYRespuestas t00202preguntasYRespuestas) {
        this.t00202preguntasYRespuestas = t00202preguntasYRespuestas;
    }

    public T00201agrupador getT00201agrupador() {
        return t00201agrupador;
    }

    public void setT00201agrupador(T00201agrupador t00201agrupador) {
        this.t00201agrupador = t00201agrupador;
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
