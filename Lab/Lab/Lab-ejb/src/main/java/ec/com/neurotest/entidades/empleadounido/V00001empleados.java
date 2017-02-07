/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.empleadounido;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V000_01EMPLEADOS")
@NamedQueries({
    @NamedQuery(name = "V00001empleados.findAll", query = "SELECT v FROM V00001empleados v")})
public class V00001empleados implements Serializable {

    private static final long serialVersionUID = 4405984264174396661L;

    @Column(name = "ID_EMPLEADO")
    @Id
    private BigInteger idempleado;

    @Size(max = 201)
    @Column(name = "NOMBRE")
    private String nombre;

    public V00001empleados() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
