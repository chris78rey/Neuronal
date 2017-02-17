/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.proformas;

import java.io.Serializable;
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
@Table(name = "V000_05PROFORMA")
@NamedQueries({
    @NamedQuery(name = "V00005proforma.findAll", query = "SELECT v FROM V00005proforma v")})
public class V00005proforma implements Serializable {

    private static final long serialVersionUID = -883759682443924306L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_IORG")
    private BigInteger idIorg;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORG")
    private BigInteger idOrg;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SIN_DESCUENTO")
    private Double sinDescuento;
    @Column(name = "CON_DESCUENTO")
    private Double conDescuento;

    public V00005proforma() {
    }

    public V00005proforma(BigInteger id) {
        this.id = id;
    }

    public V00005proforma(BigInteger id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public BigInteger getIdIorg() {
        return idIorg;
    }

    public void setIdIorg(BigInteger idIorg) {
        this.idIorg = idIorg;
    }

    public BigInteger getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(BigInteger idOrg) {
        this.idOrg = idOrg;
    }

    public String getNombreOrg() {
        return nombreOrg;
    }

    public void setNombreOrg(String nombreOrg) {
        this.nombreOrg = nombreOrg;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getSinDescuento() {
        return sinDescuento;
    }

    public void setSinDescuento(Double sinDescuento) {
        this.sinDescuento = sinDescuento;
    }

    public Double getConDescuento() {
        return conDescuento;
    }

    public void setConDescuento(Double conDescuento) {
        this.conDescuento = conDescuento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof V00005proforma)) {
            return false;
        }
        V00005proforma other = (V00005proforma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.proformas.V00005proforma[ id=" + id + " ]";
    }

}
