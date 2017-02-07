/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.solicxitem;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "T001_02SOLICITUD_X_ITEM")
@NamedQueries({
    @NamedQuery(name = "SolicitudXItem.findAll", query = "SELECT s FROM SolicitudXItem s")})
public class SolicitudXItem implements Serializable {

    private static final long serialVersionUID = -5614029967427514828L;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SOLICITUD")
    private double idSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ITEM")
    private BigInteger idItem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DESCUENTO")
    private BigInteger descuento;
    @Column(name = "ID_REFIERE")
    private BigInteger idRefiere;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
    @Size(max = 4000)
    @Column(name = "ITEM")
    private String item;
    @Column(name = "SUBTOTAL")
    private Double subtotal;
    @Column(name = "IVA_ACTUAL")
    private Double ivaActual;
    @Column(name = "MONTO_IVA")
    private Double montoIva;
    @Column(name = "TOTAL_EN_FACTURA")
    private Double totalEnFactura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PORC_PARTICIPA")
    private double porcParticipa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PARTICIPACION_REFIERE")
    private double participacionRefiere;
    @Column(name = "LIQUIDO_RECIBE_LABORATORIO")
    private Double liquidoRecibeLaboratorio;
    @Size(max = 400)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ID_EMPLEADO")
    private BigInteger idEmpleado;
    @Column(name = "PACIENTE_REVISADO")
    private BigInteger pacienteRevisado;

    public SolicitudXItem() {
    }

    public SolicitudXItem(BigDecimal id) {
        this.id = id;
    }

    public SolicitudXItem(BigDecimal id, double idSolicitud, BigInteger idItem, BigInteger descuento, double porcParticipa, double participacionRefiere) {
        this.id = id;
        this.idSolicitud = idSolicitud;
        this.idItem = idItem;
        this.descuento = descuento;
        this.porcParticipa = porcParticipa;
        this.participacionRefiere = participacionRefiere;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public double getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(double idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public BigInteger getIdItem() {
        return idItem;
    }

    public void setIdItem(BigInteger idItem) {
        this.idItem = idItem;
    }

    public BigInteger getDescuento() {
        return descuento;
    }

    public void setDescuento(BigInteger descuento) {
        this.descuento = descuento;
    }

    public BigInteger getIdRefiere() {
        return idRefiere;
    }

    public void setIdRefiere(BigInteger idRefiere) {
        this.idRefiere = idRefiere;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIvaActual() {
        return ivaActual;
    }

    public void setIvaActual(Double ivaActual) {
        this.ivaActual = ivaActual;
    }

    public Double getMontoIva() {
        return montoIva;
    }

    public void setMontoIva(Double montoIva) {
        this.montoIva = montoIva;
    }

    public Double getTotalEnFactura() {
        return totalEnFactura;
    }

    public void setTotalEnFactura(Double totalEnFactura) {
        this.totalEnFactura = totalEnFactura;
    }

    public double getPorcParticipa() {
        return porcParticipa;
    }

    public void setPorcParticipa(double porcParticipa) {
        this.porcParticipa = porcParticipa;
    }

    public double getParticipacionRefiere() {
        return participacionRefiere;
    }

    public void setParticipacionRefiere(double participacionRefiere) {
        this.participacionRefiere = participacionRefiere;
    }

    public Double getLiquidoRecibeLaboratorio() {
        return liquidoRecibeLaboratorio;
    }

    public void setLiquidoRecibeLaboratorio(Double liquidoRecibeLaboratorio) {
        this.liquidoRecibeLaboratorio = liquidoRecibeLaboratorio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigInteger getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(BigInteger idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public BigInteger getPacienteRevisado() {
        return pacienteRevisado;
    }

    public void setPacienteRevisado(BigInteger pacienteRevisado) {
        this.pacienteRevisado = pacienteRevisado;
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
        if (!(object instanceof SolicitudXItem)) {
            return false;
        }
        SolicitudXItem other = (SolicitudXItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.solicxitem.SolicitudXItem[ id=" + id + " ]";
    }

}
