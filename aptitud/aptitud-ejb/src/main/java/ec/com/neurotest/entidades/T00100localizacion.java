/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "T001_00LOCALIZACION")
@NamedQueries({
    @NamedQuery(name = "T00100localizacion.findAll", query = "SELECT t FROM T00100localizacion t")})
public class T00100localizacion implements Serializable {

    private static final long serialVersionUID = -5276676734882672576L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_LOCALIZACION")
    private BigDecimal idLocalizacion;
    @Column(name = "ID_LOCALIZACION_FK")
    private BigInteger idLocalizacionFk;
    @Size(max = 100)
    @Column(name = "CODIGO")
    private String codigo;
    @Size(max = 1000)
    @Column(name = "LOCALIZACION")
    private String localizacion;
    @Size(max = 100)
    @Column(name = "TIPO")
    private String tipo;

    public T00100localizacion() {
    }

    public T00100localizacion(BigDecimal idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public BigDecimal getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(BigDecimal idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public BigInteger getIdLocalizacionFk() {
        return idLocalizacionFk;
    }

    public void setIdLocalizacionFk(BigInteger idLocalizacionFk) {
        this.idLocalizacionFk = idLocalizacionFk;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00100localizacion)) {
            return false;
        }
        T00100localizacion other = (T00100localizacion) object;
        if ((this.idLocalizacion == null && other.idLocalizacion != null) || (this.idLocalizacion != null && !this.idLocalizacion.equals(other.idLocalizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00100localizacion[ idLocalizacion=" + idLocalizacion + " ]";
    }
    
}
