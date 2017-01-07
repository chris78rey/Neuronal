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
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "T002_01AGRUPADOR")
@NamedQueries({
    @NamedQuery(name = "T00201agrupador.findAll", query = "SELECT t FROM T00201agrupador t")})
public class T00201agrupador implements Serializable {

    private static final long serialVersionUID = 2111398140578222879L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGRUPADOR")
    private BigDecimal idAgrupador;
    @Size(max = 200)
    @Column(name = "DESCRIPCION_CLASIFICADOR")
    private String descripcionClasificador;
    @Column(name = "ID_RECURSIVO_TEST")
    private BigInteger idRecursivoTest;

    public T00201agrupador() {
    }

    public T00201agrupador(BigDecimal idAgrupador) {
        this.idAgrupador = idAgrupador;
    }

    public BigDecimal getIdAgrupador() {
        return idAgrupador;
    }

    public void setIdAgrupador(BigDecimal idAgrupador) {
        this.idAgrupador = idAgrupador;
    }

    public String getDescripcionClasificador() {
        return descripcionClasificador;
    }

    public void setDescripcionClasificador(String descripcionClasificador) {
        this.descripcionClasificador = descripcionClasificador;
    }

    public BigInteger getIdRecursivoTest() {
        return idRecursivoTest;
    }

    public void setIdRecursivoTest(BigInteger idRecursivoTest) {
        this.idRecursivoTest = idRecursivoTest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgrupador != null ? idAgrupador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00201agrupador)) {
            return false;
        }
        T00201agrupador other = (T00201agrupador) object;
        if ((this.idAgrupador == null && other.idAgrupador != null) || (this.idAgrupador != null && !this.idAgrupador.equals(other.idAgrupador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00201agrupador[ idAgrupador=" + idAgrupador + " ]";
    }
    
}
