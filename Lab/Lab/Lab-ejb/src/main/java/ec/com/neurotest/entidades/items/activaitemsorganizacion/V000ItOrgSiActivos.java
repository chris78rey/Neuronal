/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.items.activaitemsorganizacion;

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
@Table(name = "V000_IT_ORG_SI_ACTIVOS")
@NamedQueries({
    @NamedQuery(name = "V000ItOrgSiActivos.findAll", query = "SELECT v FROM V000ItOrgSiActivos v")})
public class V000ItOrgSiActivos implements Serializable {

    private static final long serialVersionUID = 2406571828085258210L;

    @Column(name = "ID_IORG")
    @Id
    private BigInteger idIorg;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Size(max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ACTIVO")
    private BigInteger activo;
    @Column(name = "ID_ORG")
    private BigInteger idorg;

    public V000ItOrgSiActivos() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getActivo() {
        return activo;
    }

    public void setActivo(BigInteger activo) {
        this.activo = activo;
    }

    /**
     * @return the idorg
     */
    public BigInteger getIdorg() {
        return idorg;
    }

    /**
     * @param idorg the idorg to set
     */
    public void setIdorg(BigInteger idorg) {
        this.idorg = idorg;
    }
    @Override
    public String toString() {
        return "V000ItOrgSiActivos{" + "idIorg=" + idIorg + '}';
    }

}
