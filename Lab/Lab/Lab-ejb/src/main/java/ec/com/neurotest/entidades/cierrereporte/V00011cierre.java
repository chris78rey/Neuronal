/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.cierrereporte;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "V000_11CIERRE")
@NamedQueries({
    @NamedQuery(name = "V00011cierre.findAll", query = "SELECT v FROM V00011cierre v")})
public class V00011cierre implements Serializable {

    private static final long serialVersionUID = 8862657006387470578L;

    @Size(max = 18)
    @Column(name = "RID")
    @Id
    private String rid;
    @Size(max = 4000)
    @Column(name = "ITEM")
    private String item;
    @Column(name = "SUBTOTAL")
    private BigDecimal subtotal;
    @Column(name = "MONTO_IVA")
    private BigDecimal montoIva;
    @Column(name = "TOTAL_EN_FACTURA")
    private BigDecimal totalEnFactura;
    @Column(name = "PARTICIPACION_REFIERE")
    private BigDecimal participacionRefiere;
    @Column(name = "LIQUIDO_RECIBE_LABORATORIO")
    private BigDecimal liquidoRecibeLaboratorio;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "TIPO")
    private BigDecimal tipo;

    public V00011cierre() {
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getMontoIva() {
        return montoIva;
    }

    public void setMontoIva(BigDecimal montoIva) {
        this.montoIva = montoIva;
    }

    public BigDecimal getTotalEnFactura() {
        return totalEnFactura;
    }

    public void setTotalEnFactura(BigDecimal totalEnFactura) {
        this.totalEnFactura = totalEnFactura;
    }

    public BigDecimal getParticipacionRefiere() {
        return participacionRefiere;
    }

    public void setParticipacionRefiere(BigDecimal participacionRefiere) {
        this.participacionRefiere = participacionRefiere;
    }

    public BigDecimal getLiquidoRecibeLaboratorio() {
        return liquidoRecibeLaboratorio;
    }

    public void setLiquidoRecibeLaboratorio(BigDecimal liquidoRecibeLaboratorio) {
        this.liquidoRecibeLaboratorio = liquidoRecibeLaboratorio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTipo() {
        return tipo;
    }

    public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
    }

}
