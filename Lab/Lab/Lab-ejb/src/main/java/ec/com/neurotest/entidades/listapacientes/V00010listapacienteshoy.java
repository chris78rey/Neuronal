/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.listapacientes;

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
@Table(name = "V000_10LISTAPACIENTESHOY")
@NamedQueries({
    @NamedQuery(name = "V00010listapacienteshoy.findAll", query = "SELECT v FROM V00010listapacienteshoy v")})
public class V00010listapacienteshoy implements Serializable {

    private static final long serialVersionUID = -4227415642203511619L;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @Id
    private BigInteger id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EMPLEADO")
    private BigInteger idEmpleado;
    @Size(max = 201)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 4000)
    @Column(name = "ITEM")
    private String item;
    @Size(max = 201)
    @Column(name = "PACIENTE")
    private String paciente;

    public V00010listapacienteshoy() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(BigInteger idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

}
