/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.itemsxorganiz;

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
@Table(name = "V000_ITEMS_X_ORGANIZ")
@NamedQueries({
    @NamedQuery(name = "V000ItemsXOrganiz.findAll", query = "SELECT v FROM V000ItemsXOrganiz v")})
public class V000ItemsXOrganiz implements Serializable {

    private static final long serialVersionUID = -4157890767539851496L;

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_IORG")
    @Id
    private BigInteger idIorg;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Size(max = 4000)
    @Column(name = "JERARQUIA")
    private String jerarquia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORG")
    private BigInteger idOrg;
    @Column(name = "ACTIVO")
    private BigInteger activo;

    public V000ItemsXOrganiz() {
    }

    public BigInteger getIdIorg() {
        return idIorg;
    }

    public void setIdIorg(BigInteger idIorg) {
        this.idIorg = idIorg;
    }

    public String getNombreOrg() {
        return nombreOrg;
    }

    public void setNombreOrg(String nombreOrg) {
        this.nombreOrg = nombreOrg;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public BigInteger getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(BigInteger idOrg) {
        this.idOrg = idOrg;
    }

    public BigInteger getActivo() {
        return activo;
    }

    public void setActivo(BigInteger activo) {
        this.activo = activo;
    }

}
