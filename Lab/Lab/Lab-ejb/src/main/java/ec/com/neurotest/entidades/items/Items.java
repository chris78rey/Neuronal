/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.items;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V000_ITEMS")
public class Items implements Serializable {

    private static final long serialVersionUID = -40279178961904405L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "NIVEL")
    private BigInteger nivel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 4000)
    @Column(name = "JERARQUIA")
    private String jerarquia;
    @Column(name = "SIN_DESCUENTO")
    private Double sinDescuento;
    @Column(name = "CON_DESCUENTO")
    private Double conDescuento;
    @Column(name = "ACTIVO")
    private BigInteger activo;
    @Column(name = "IDFK")
    private BigDecimal idfk;


    public Items() {
    }

    public Items(BigDecimal id) {
        this.id = id;
    }

    public Items(BigDecimal id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getNivel() {
        return nivel;
    }

    public void setNivel(BigInteger nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
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

    public BigInteger getActivo() {
        return activo;
    }

    public void setActivo(BigInteger activo) {
        this.activo = activo;
    }

    /**
     * @return the idfk
     */
    public BigDecimal getIdfk() {
        return idfk;
    }

    /**
     * @param idfk the idfk to set
     */
    public void setIdfk(BigDecimal idfk) {
        this.idfk = idfk;
    }


}
