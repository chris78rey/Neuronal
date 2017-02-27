/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.reportesutilidades;

import java.io.Serializable;
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
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V002_MESUAL_DIARIO")
@NamedQueries({
    @NamedQuery(name = "V002MesualDiario.findAll", query = "SELECT v FROM V002MesualDiario v")})
public class V002MesualDiario implements Serializable {

    private static final long serialVersionUID = -2913406318443313754L;

    @Size(max = 4000)
    @Column(name = "PKEY")
    @Id
    private String pkey;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Size(max = 4000)
    @Column(name = "ITEM")
    private String item;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Size(max = 12)
    @Column(name = "TOTAL_POR_ITEM")
    private String totalPorItem;
    @Column(name = "PACIENTES_ATENDIDOS")
    private BigInteger pacientesAtendidos;

    public V002MesualDiario() {
    }

    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey;
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

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
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

}
