/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.medicorefiere;

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
@Table(name = "V000_01MEDICOREFIERE")
@NamedQueries({
    @NamedQuery(name = "V00001medicorefiere.findAll", query = "SELECT v FROM V00001medicorefiere v")})
public class V00001medicorefiere implements Serializable {

    private static final long serialVersionUID = -2131158356424564333L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private BigInteger idPersona;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigInteger id;
    @Size(max = 60)
    @Column(name = "CC")
    private String cc;
    @Size(max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 100)
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
    @Size(max = 100)
    @Column(name = "CENTROMEDICO")
    private String centromedico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PARTICIPACION")
    private double participacion;

    public V00001medicorefiere() {
    }

    public V00001medicorefiere(BigInteger id) {
        this.id = id;
    }

    public V00001medicorefiere(BigInteger id, double participacion) {
        this.id = id;
        this.participacion = participacion;
    }

    public BigInteger getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(BigInteger idPersona) {
        this.idPersona = idPersona;
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

    public String getCentromedico() {
        return centromedico;
    }

    public void setCentromedico(String centromedico) {
        this.centromedico = centromedico;
    }

    public double getParticipacion() {
        return participacion;
    }

    public void setParticipacion(double participacion) {
        this.participacion = participacion;
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
        if (!(object instanceof V00001medicorefiere)) {
            return false;
        }
        V00001medicorefiere other = (V00001medicorefiere) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.items.V00001medicorefiere[ id=" + id + " ]";
    }

}
