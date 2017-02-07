/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.organizacion;

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
@Table(name = "T000_00ORGANIZACION")
@NamedQueries({
    @NamedQuery(name = "Organizacion.findAll", query = "SELECT o FROM Organizacion o")})
public class Organizacion implements Serializable {

    private static final long serialVersionUID = -8061191485741660038L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORG")
    private BigDecimal idOrg;
    @Size(max = 200)
    @Column(name = "NOMBRE_ORG")
    private String nombreOrg;
    @Size(max = 100)
    @Column(name = "RUC")
    private String ruc;

    public Organizacion() {
    }

    public Organizacion(BigDecimal idOrg) {
        this.idOrg = idOrg;
    }

    public BigDecimal getIdOrg() {
        return idOrg;
    }

    public void setIdOrg(BigDecimal idOrg) {
        this.idOrg = idOrg;
    }

    public String getNombreOrg() {
        return nombreOrg;
    }

    public void setNombreOrg(String nombreOrg) {
        this.nombreOrg = nombreOrg;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrg != null ? idOrg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Organizacion)) {
            return false;
        }
        Organizacion other = (Organizacion) object;
        if ((this.idOrg == null && other.idOrg != null) || (this.idOrg != null && !this.idOrg.equals(other.idOrg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.organizacion.Organizacion[ idOrg=" + idOrg + " ]";
    }

}
