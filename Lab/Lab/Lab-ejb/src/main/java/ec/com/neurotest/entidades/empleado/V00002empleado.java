/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.empleado;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "V000_02EMPLEADO")
@NamedQueries({
    @NamedQuery(name = "V00002empleado.findAll", query = "SELECT v FROM V00002empleado v")})
public class V00002empleado implements Serializable {

    private static final long serialVersionUID = 7162357833665256447L;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMPLEADO")
    @Id
    private BigDecimal idempleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CC")
    private String cc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 300)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Size(max = 4000)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 50)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 100)
    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "PORCENTAJE_PARTICIOA")
    private BigDecimal porcentajeParticipa;

    @Column(name = "TIPO_COLABORADOR")
    private String tipocolaborador;


    public V00002empleado() {
        this.porcentajeParticipa = new BigDecimal("0");
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public BigDecimal getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(BigDecimal idempleado) {
        this.idempleado = idempleado;
    }

    /**
     * @return the porcentajeParticipa
     */
    public BigDecimal getPorcentajeParticipa() {
        return porcentajeParticipa;
    }

    /**
     * @param porcentajeParticipa the porcentajeParticipa to set
     */
    public void setPorcentajeParticipa(BigDecimal porcentajeParticipa) {
        this.porcentajeParticipa = porcentajeParticipa;
    }

    /**
     * @return the tipocolaborador
     */
    public String getTipocolaborador() {
        return tipocolaborador;
    }

    /**
     * @param tipocolaborador the tipocolaborador to set
     */
    public void setTipocolaborador(String tipocolaborador) {
        this.tipocolaborador = tipocolaborador;
    }

}
