/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.reciberefiere;

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
@Table(name = "V002_GENERA_MENSUAL_REFIERE")
@NamedQueries({
    @NamedQuery(name = "V002GeneraMensualRefiere.findAll", query = "SELECT v FROM V002GeneraMensualRefiere v")})
public class V002GeneraMensualRefiere implements Serializable {

    private static final long serialVersionUID = -6504082044321709761L;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_COL_X_EXAM")
    @Id
    private BigInteger idColXExam;
    @Size(max = 4)
    @Column(name = "ANIO")
    private String anio;
    @Size(max = 2)
    @Column(name = "MES")
    private String mes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CC")
    private String cc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_DEUDA_AL_QUE_REFIERE")
    private double valorDeudaAlQueRefiere;
    @Column(name = "ID_EMPLEADO")
    private BigInteger idempleado;

    public V002GeneraMensualRefiere() {
    }

    public BigInteger getIdColXExam() {
        return idColXExam;
    }

    public void setIdColXExam(BigInteger idColXExam) {
        this.idColXExam = idColXExam;
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

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorDeudaAlQueRefiere() {
        return valorDeudaAlQueRefiere;
    }

    public void setValorDeudaAlQueRefiere(double valorDeudaAlQueRefiere) {
        this.valorDeudaAlQueRefiere = valorDeudaAlQueRefiere;
    }

    /**
     * @return the idempleado
     */
    public BigInteger getIdempleado() {
        return idempleado;
    }

    /**
     * @param idempleado the idempleado to set
     */
    public void setIdempleado(BigInteger idempleado) {
        this.idempleado = idempleado;
    }

}
