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
@Table(name = "V001_02ARBOLAGRUPADORRECUR")
@NamedQueries({
    @NamedQuery(name = "V00102arbolagrupadorrecur.findAll", query = "SELECT v FROM V00102arbolagrupadorrecur v")})
public class V00102arbolagrupadorrecur implements Serializable {

    private static final long serialVersionUID = -2906988808585682437L;

    
    @Column(name = "ID_RECURSIVO_TEST")
    private BigInteger idRecursivoTest;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGRUPADOR")
    private BigDecimal idAgrupador;
    @Column(name = "NODO_RAIZ_DEL_TEST")
    private BigInteger nodoRaizDelTest;
    @Column(name = "NIVEL")
    private BigInteger nivel;
    @Size(max = 4000)
    @Column(name = "DESCRIPCION_CLASIFICADOR")
    private String descripcionClasificador;

    public V00102arbolagrupadorrecur() {
    }

    public V00102arbolagrupadorrecur(BigDecimal idAgrupador) {
        this.idAgrupador = idAgrupador;
    }

    public BigInteger getIdRecursivoTest() {
        return idRecursivoTest;
    }

    public void setIdRecursivoTest(BigInteger idRecursivoTest) {
        this.idRecursivoTest = idRecursivoTest;
    }

    public BigDecimal getIdAgrupador() {
        return idAgrupador;
    }

    public void setIdAgrupador(BigDecimal idAgrupador) {
        this.idAgrupador = idAgrupador;
    }

    public BigInteger getNodoRaizDelTest() {
        return nodoRaizDelTest;
    }

    public void setNodoRaizDelTest(BigInteger nodoRaizDelTest) {
        this.nodoRaizDelTest = nodoRaizDelTest;
    }

    public BigInteger getNivel() {
        return nivel;
    }

    public void setNivel(BigInteger nivel) {
        this.nivel = nivel;
    }

    public String getDescripcionClasificador() {
        return descripcionClasificador;
    }

    public void setDescripcionClasificador(String descripcionClasificador) {
        this.descripcionClasificador = descripcionClasificador;
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
        if (!(object instanceof V00102arbolagrupadorrecur)) {
            return false;
        }
        V00102arbolagrupadorrecur other = (V00102arbolagrupadorrecur) object;
        if ((this.idAgrupador == null && other.idAgrupador != null) || (this.idAgrupador != null && !this.idAgrupador.equals(other.idAgrupador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.V00102arbolagrupadorrecur[ idAgrupador=" + idAgrupador + " ]";
    }
    
}
