/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.reportesutilidades;

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
@Table(name = "V002_MESUAL_UTILIDAD")
@NamedQueries({
    @NamedQuery(name = "V002MesualUtilidad.findAll", query = "SELECT v FROM V002MesualUtilidad v")})
public class V002MesualUtilidad implements Serializable {
    @Id
    @Size(max = 100)
    @Basic(optional = false)
    @NotNull
    @Column(name = "PK")
    private String primarykey;

    private static final long serialVersionUID = 1L;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Size(max = 4000)
    @Column(name = "ITEM")
    private String item;
    @Size(max = 4)
    @Column(name = "ANIO")
    private String anio;
    @Size(max = 2)
    @Column(name = "MES")
    private String mes;
    @Size(max = 12)
    @Column(name = "TOTAL_POR_ITEM")
    private String totalPorItem;
    @Column(name = "PACIENTES_ATENDIDOS")
    private BigInteger pacientesAtendidos;

    public V002MesualUtilidad() {
    }

    public String getNombreOrg() {
        return nombreOrg;
    }

    public void setNombreOrg(String nombreOrg) {
        this.nombreOrg = nombreOrg;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTotalPorItem() {
        return totalPorItem;
    }

    public void setTotalPorItem(String totalPorItem) {
        this.totalPorItem = totalPorItem;
    }

    public BigInteger getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(BigInteger pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    /**
     * @return the primarykey
     */
    public String getPrimarykey() {
        return primarykey;
    }

    /**
     * @param primarykey the primarykey to set
     */
    public void setPrimarykey(String primarykey) {
        this.primarykey = primarykey;
    }

}
