/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V001_03MATRICULASACTIVASUSER")
@NamedQueries({
    @NamedQuery(name = "V00103matriculasactivasuser.findAll", query = "SELECT v FROM V00103matriculasactivasuser v")})
public class V00103matriculasactivasuser implements Serializable {

    private static final long serialVersionUID = -2283528193323644170L;

 
    @Column(name = "ID_AGRMATR")
    @Id
    private BigInteger idAgrmatr;
    @Column(name = "ID_INSUSUA")
    private BigInteger idInsusua;
    @Column(name = "TIEMPO_EN_MINUTOS")
    private BigInteger tiempoEnMinutos;
    @Column(name = "TEMPORIZADO")
    private BigInteger temporizado;

    public V00103matriculasactivasuser() {
    }

    public BigInteger getIdAgrmatr() {
        return idAgrmatr;
    }

    public void setIdAgrmatr(BigInteger idAgrmatr) {
        this.idAgrmatr = idAgrmatr;
    }

    public BigInteger getIdInsusua() {
        return idInsusua;
    }

    public void setIdInsusua(BigInteger idInsusua) {
        this.idInsusua = idInsusua;
    }

    public BigInteger getTiempoEnMinutos() {
        return tiempoEnMinutos;
    }

    public void setTiempoEnMinutos(BigInteger tiempoEnMinutos) {
        this.tiempoEnMinutos = tiempoEnMinutos;
    }

    public BigInteger getTemporizado() {
        return temporizado;
    }

    public void setTemporizado(BigInteger temporizado) {
        this.temporizado = temporizado;
    }
    
}
