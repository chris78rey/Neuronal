/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.registroitems;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "V000_03REGISTRO_ITEMS")
@NamedQueries({
    @NamedQuery(name = "RegistroItems.findAll", query = "SELECT r FROM RegistroItems r")})
public class RegistroItems implements Serializable {

    private static final long serialVersionUID = 9030844582717799074L;

    @Column(name = "ID_SOLXITEM")
    @Id
    private BigInteger idSolxitem;
    @Column(name = "ID")
    private BigInteger id;
    @Size(max = 30)
    @Column(name = "NUMERO_SOLIC")
    private String numeroSolic;
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Column(name = "DESCUENTO")
    private BigInteger descuento;
    @Column(name = "SOLICITUD_ACTIVA")
    private BigInteger solicitudActiva;
    @Column(name = "DESCUENTO_DET")
    private BigInteger descuentoDet;
    @Column(name = "ID_REFIERE_DET")
    private BigInteger idRefiereDet;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
    @Size(max = 4000)
    @Column(name = "ITEM")
    private String item;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SUBTOTAL")
    private Double subtotal;
    @Column(name = "IVA_ACTUAL")
    private Double ivaActual;
    @Column(name = "MONTO_IVA")
    private Double montoIva;
    @Column(name = "TOTAL_EN_FACTURA")
    private Double totalEnFactura;
    @Column(name = "PORC_PARTICIPA")
    private Double porcParticipa;
    @Column(name = "PARTICIPACION_REFIERE")
    private Double participacionRefiere;
    @Column(name = "LIQUIDO_RECIBE_LABORATORIO")
    private Double liquidoRecibeLaboratorio;
    @Size(max = 400)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "PACIENTE_REVISADO")
    private BigInteger pacienteRevisado;

    public RegistroItems() {
    }

    public BigInteger getIdSolxitem() {
        return idSolxitem;
    }

    public void setIdSolxitem(BigInteger idSolxitem) {
        this.idSolxitem = idSolxitem;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNumeroSolic() {
        return numeroSolic;
    }

    public void setNumeroSolic(String numeroSolic) {
        this.numeroSolic = numeroSolic;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public BigInteger getDescuento() {
        return descuento;
    }

    public void setDescuento(BigInteger descuento) {
        this.descuento = descuento;
    }

    public BigInteger getSolicitudActiva() {
        return solicitudActiva;
    }

    public void setSolicitudActiva(BigInteger solicitudActiva) {
        this.solicitudActiva = solicitudActiva;
    }

    public BigInteger getDescuentoDet() {
        return descuentoDet;
    }

    public void setDescuentoDet(BigInteger descuentoDet) {
        this.descuentoDet = descuentoDet;
    }

    public BigInteger getIdRefiereDet() {
        return idRefiereDet;
    }

    public void setIdRefiereDet(BigInteger idRefiereDet) {
        this.idRefiereDet = idRefiereDet;
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

    public Double getPorcParticipa() {
        return porcParticipa;
    }

    public void setPorcParticipa(Double porcParticipa) {
        this.porcParticipa = porcParticipa;
    }

    public Double getParticipacionRefiere() {
        return participacionRefiere;
    }

    public void setParticipacionRefiere(Double participacionRefiere) {
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

    public BigInteger getPacienteRevisado() {
        return pacienteRevisado;
    }

    public void setPacienteRevisado(BigInteger pacienteRevisado) {
        this.pacienteRevisado = pacienteRevisado;
    }

}
