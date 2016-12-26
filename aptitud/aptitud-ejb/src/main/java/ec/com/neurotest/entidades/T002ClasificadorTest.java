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
@Table(name = "T002_CLASIFICADOR_TEST")
@NamedQueries({
    @NamedQuery(name = "T002ClasificadorTest.findAll", query = "SELECT t FROM T002ClasificadorTest t")})
public class T002ClasificadorTest implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLASIFICADORTEST")
    private BigDecimal idClasificadortest;
    @Size(max = 200)
    @Column(name = "DESCRIPCION_CLASIFICADOR")
    private String descripcionClasificador;
    @Column(name = "ID_RECURSIVO_TEST")
    private BigInteger idRecursivoTest;

    public T002ClasificadorTest() {
    }

    public T002ClasificadorTest(BigDecimal idClasificadortest) {
        this.idClasificadortest = idClasificadortest;
    }

    public BigDecimal getIdClasificadortest() {
        return idClasificadortest;
    }

    public void setIdClasificadortest(BigDecimal idClasificadortest) {
        this.idClasificadortest = idClasificadortest;
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
        hash += (idClasificadortest != null ? idClasificadortest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T002ClasificadorTest)) {
            return false;
        }
        T002ClasificadorTest other = (T002ClasificadorTest) object;
        if ((this.idClasificadortest == null && other.idClasificadortest != null) || (this.idClasificadortest != null && !this.idClasificadortest.equals(other.idClasificadortest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T002ClasificadorTest[ idClasificadortest=" + idClasificadortest + " ]";
    }
    
}
