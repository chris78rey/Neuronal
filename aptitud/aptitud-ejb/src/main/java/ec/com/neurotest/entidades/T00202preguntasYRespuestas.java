/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author crrb
 */
@Entity
@Table(name = "T002_02PREGUNTAS_Y_RESPUESTAS")
@NamedQueries({
    @NamedQuery(name = "T00202preguntasYRespuestas.findAll", query = "SELECT t FROM T00202preguntasYRespuestas t")})
public class T00202preguntasYRespuestas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PREGRESP")
    private BigDecimal idPregresp;
    @Size(max = 4000)
    @Column(name = "PREGUNTA")
    private String pregunta;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_01")
    private String repPosible01;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_02")
    private String repPosible02;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_03")
    private String repPosible03;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_04")
    private String repPosible04;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_05")
    private String repPosible05;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_06")
    private String repPosible06;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_07")
    private String repPosible07;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_08")
    private String repPosible08;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_09")
    private String repPosible09;
    @Size(max = 4000)
    @Column(name = "REP_POSIBLE_10")
    private String repPosible10;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_01")
    private double respPesoValor01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_02")
    private double respPesoValor02;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_03")
    private double respPesoValor03;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_04")
    private double respPesoValor04;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_05")
    private double respPesoValor05;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_06")
    private double respPesoValor06;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_07")
    private double respPesoValor07;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_08")
    private double respPesoValor08;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_09")
    private double respPesoValor09;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_PESO_VALOR_10")
    private double respPesoValor10;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_01")
    private BigInteger respSeleccionusuario01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_02")
    private BigInteger respSeleccionusuario02;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_03")
    private BigInteger respSeleccionusuario03;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_04")
    private BigInteger respSeleccionusuario04;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_05")
    private BigInteger respSeleccionusuario05;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_06")
    private BigInteger respSeleccionusuario06;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_07")
    private BigInteger respSeleccionusuario07;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_08")
    private BigInteger respSeleccionusuario08;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESP_SELECCIONUSUARIO_09")
    private BigInteger respSeleccionusuario09;
    @Column(name = "RESP_SELECCIONUSUARIO_10")
    private BigInteger respSeleccionusuario10;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_01")
    private BigInteger preguntaActiva01;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_02")
    private BigInteger preguntaActiva02;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_03")
    private BigInteger preguntaActiva03;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_04")
    private BigInteger preguntaActiva04;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_05")
    private BigInteger preguntaActiva05;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_06")
    private BigInteger preguntaActiva06;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_07")
    private BigInteger preguntaActiva07;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_08")
    private BigInteger preguntaActiva08;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_09")
    private BigInteger preguntaActiva09;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTIVA_10")
    private BigInteger preguntaActiva10;
    @OneToMany(mappedBy = "t00202preguntasYRespuestas", fetch = FetchType.LAZY)
    private Collection<T00203agrupaPreguntas> t00203agrupaPreguntasCollection;

    public T00202preguntasYRespuestas() {
    }

    public T00202preguntasYRespuestas(BigDecimal idPregresp) {
        this.idPregresp = idPregresp;
    }

    public T00202preguntasYRespuestas(BigDecimal idPregresp, double respPesoValor01, double respPesoValor02, double respPesoValor03, double respPesoValor04, double respPesoValor05, double respPesoValor06, double respPesoValor07, double respPesoValor08, double respPesoValor09, double respPesoValor10, BigInteger respSeleccionusuario01, BigInteger respSeleccionusuario02, BigInteger respSeleccionusuario03, BigInteger respSeleccionusuario04, BigInteger respSeleccionusuario05, BigInteger respSeleccionusuario06, BigInteger respSeleccionusuario07, BigInteger respSeleccionusuario08, BigInteger respSeleccionusuario09, BigInteger preguntaActiva01, BigInteger preguntaActiva02, BigInteger preguntaActiva03, BigInteger preguntaActiva04, BigInteger preguntaActiva05, BigInteger preguntaActiva06, BigInteger preguntaActiva07, BigInteger preguntaActiva08, BigInteger preguntaActiva09, BigInteger preguntaActiva10) {
        this.idPregresp = idPregresp;
        this.respPesoValor01 = respPesoValor01;
        this.respPesoValor02 = respPesoValor02;
        this.respPesoValor03 = respPesoValor03;
        this.respPesoValor04 = respPesoValor04;
        this.respPesoValor05 = respPesoValor05;
        this.respPesoValor06 = respPesoValor06;
        this.respPesoValor07 = respPesoValor07;
        this.respPesoValor08 = respPesoValor08;
        this.respPesoValor09 = respPesoValor09;
        this.respPesoValor10 = respPesoValor10;
        this.respSeleccionusuario01 = respSeleccionusuario01;
        this.respSeleccionusuario02 = respSeleccionusuario02;
        this.respSeleccionusuario03 = respSeleccionusuario03;
        this.respSeleccionusuario04 = respSeleccionusuario04;
        this.respSeleccionusuario05 = respSeleccionusuario05;
        this.respSeleccionusuario06 = respSeleccionusuario06;
        this.respSeleccionusuario07 = respSeleccionusuario07;
        this.respSeleccionusuario08 = respSeleccionusuario08;
        this.respSeleccionusuario09 = respSeleccionusuario09;
        this.preguntaActiva01 = preguntaActiva01;
        this.preguntaActiva02 = preguntaActiva02;
        this.preguntaActiva03 = preguntaActiva03;
        this.preguntaActiva04 = preguntaActiva04;
        this.preguntaActiva05 = preguntaActiva05;
        this.preguntaActiva06 = preguntaActiva06;
        this.preguntaActiva07 = preguntaActiva07;
        this.preguntaActiva08 = preguntaActiva08;
        this.preguntaActiva09 = preguntaActiva09;
        this.preguntaActiva10 = preguntaActiva10;
    }

    public BigDecimal getIdPregresp() {
        return idPregresp;
    }

    public void setIdPregresp(BigDecimal idPregresp) {
        this.idPregresp = idPregresp;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRepPosible01() {
        return repPosible01;
    }

    public void setRepPosible01(String repPosible01) {
        this.repPosible01 = repPosible01;
    }

    public String getRepPosible02() {
        return repPosible02;
    }

    public void setRepPosible02(String repPosible02) {
        this.repPosible02 = repPosible02;
    }

    public String getRepPosible03() {
        return repPosible03;
    }

    public void setRepPosible03(String repPosible03) {
        this.repPosible03 = repPosible03;
    }

    public String getRepPosible04() {
        return repPosible04;
    }

    public void setRepPosible04(String repPosible04) {
        this.repPosible04 = repPosible04;
    }

    public String getRepPosible05() {
        return repPosible05;
    }

    public void setRepPosible05(String repPosible05) {
        this.repPosible05 = repPosible05;
    }

    public String getRepPosible06() {
        return repPosible06;
    }

    public void setRepPosible06(String repPosible06) {
        this.repPosible06 = repPosible06;
    }

    public String getRepPosible07() {
        return repPosible07;
    }

    public void setRepPosible07(String repPosible07) {
        this.repPosible07 = repPosible07;
    }

    public String getRepPosible08() {
        return repPosible08;
    }

    public void setRepPosible08(String repPosible08) {
        this.repPosible08 = repPosible08;
    }

    public String getRepPosible09() {
        return repPosible09;
    }

    public void setRepPosible09(String repPosible09) {
        this.repPosible09 = repPosible09;
    }

    public String getRepPosible10() {
        return repPosible10;
    }

    public void setRepPosible10(String repPosible10) {
        this.repPosible10 = repPosible10;
    }

    public double getRespPesoValor01() {
        return respPesoValor01;
    }

    public void setRespPesoValor01(double respPesoValor01) {
        this.respPesoValor01 = respPesoValor01;
    }

    public double getRespPesoValor02() {
        return respPesoValor02;
    }

    public void setRespPesoValor02(double respPesoValor02) {
        this.respPesoValor02 = respPesoValor02;
    }

    public double getRespPesoValor03() {
        return respPesoValor03;
    }

    public void setRespPesoValor03(double respPesoValor03) {
        this.respPesoValor03 = respPesoValor03;
    }

    public double getRespPesoValor04() {
        return respPesoValor04;
    }

    public void setRespPesoValor04(double respPesoValor04) {
        this.respPesoValor04 = respPesoValor04;
    }

    public double getRespPesoValor05() {
        return respPesoValor05;
    }

    public void setRespPesoValor05(double respPesoValor05) {
        this.respPesoValor05 = respPesoValor05;
    }

    public double getRespPesoValor06() {
        return respPesoValor06;
    }

    public void setRespPesoValor06(double respPesoValor06) {
        this.respPesoValor06 = respPesoValor06;
    }

    public double getRespPesoValor07() {
        return respPesoValor07;
    }

    public void setRespPesoValor07(double respPesoValor07) {
        this.respPesoValor07 = respPesoValor07;
    }

    public double getRespPesoValor08() {
        return respPesoValor08;
    }

    public void setRespPesoValor08(double respPesoValor08) {
        this.respPesoValor08 = respPesoValor08;
    }

    public double getRespPesoValor09() {
        return respPesoValor09;
    }

    public void setRespPesoValor09(double respPesoValor09) {
        this.respPesoValor09 = respPesoValor09;
    }

    public double getRespPesoValor10() {
        return respPesoValor10;
    }

    public void setRespPesoValor10(double respPesoValor10) {
        this.respPesoValor10 = respPesoValor10;
    }

    public BigInteger getRespSeleccionusuario01() {
        return respSeleccionusuario01;
    }

    public void setRespSeleccionusuario01(BigInteger respSeleccionusuario01) {
        this.respSeleccionusuario01 = respSeleccionusuario01;
    }

    public BigInteger getRespSeleccionusuario02() {
        return respSeleccionusuario02;
    }

    public void setRespSeleccionusuario02(BigInteger respSeleccionusuario02) {
        this.respSeleccionusuario02 = respSeleccionusuario02;
    }

    public BigInteger getRespSeleccionusuario03() {
        return respSeleccionusuario03;
    }

    public void setRespSeleccionusuario03(BigInteger respSeleccionusuario03) {
        this.respSeleccionusuario03 = respSeleccionusuario03;
    }

    public BigInteger getRespSeleccionusuario04() {
        return respSeleccionusuario04;
    }

    public void setRespSeleccionusuario04(BigInteger respSeleccionusuario04) {
        this.respSeleccionusuario04 = respSeleccionusuario04;
    }

    public BigInteger getRespSeleccionusuario05() {
        return respSeleccionusuario05;
    }

    public void setRespSeleccionusuario05(BigInteger respSeleccionusuario05) {
        this.respSeleccionusuario05 = respSeleccionusuario05;
    }

    public BigInteger getRespSeleccionusuario06() {
        return respSeleccionusuario06;
    }

    public void setRespSeleccionusuario06(BigInteger respSeleccionusuario06) {
        this.respSeleccionusuario06 = respSeleccionusuario06;
    }

    public BigInteger getRespSeleccionusuario07() {
        return respSeleccionusuario07;
    }

    public void setRespSeleccionusuario07(BigInteger respSeleccionusuario07) {
        this.respSeleccionusuario07 = respSeleccionusuario07;
    }

    public BigInteger getRespSeleccionusuario08() {
        return respSeleccionusuario08;
    }

    public void setRespSeleccionusuario08(BigInteger respSeleccionusuario08) {
        this.respSeleccionusuario08 = respSeleccionusuario08;
    }

    public BigInteger getRespSeleccionusuario09() {
        return respSeleccionusuario09;
    }

    public void setRespSeleccionusuario09(BigInteger respSeleccionusuario09) {
        this.respSeleccionusuario09 = respSeleccionusuario09;
    }

    public BigInteger getRespSeleccionusuario10() {
        return respSeleccionusuario10;
    }

    public void setRespSeleccionusuario10(BigInteger respSeleccionusuario10) {
        this.respSeleccionusuario10 = respSeleccionusuario10;
    }

    public BigInteger getPreguntaActiva01() {
        return preguntaActiva01;
    }

    public void setPreguntaActiva01(BigInteger preguntaActiva01) {
        this.preguntaActiva01 = preguntaActiva01;
    }

    public BigInteger getPreguntaActiva02() {
        return preguntaActiva02;
    }

    public void setPreguntaActiva02(BigInteger preguntaActiva02) {
        this.preguntaActiva02 = preguntaActiva02;
    }

    public BigInteger getPreguntaActiva03() {
        return preguntaActiva03;
    }

    public void setPreguntaActiva03(BigInteger preguntaActiva03) {
        this.preguntaActiva03 = preguntaActiva03;
    }

    public BigInteger getPreguntaActiva04() {
        return preguntaActiva04;
    }

    public void setPreguntaActiva04(BigInteger preguntaActiva04) {
        this.preguntaActiva04 = preguntaActiva04;
    }

    public BigInteger getPreguntaActiva05() {
        return preguntaActiva05;
    }

    public void setPreguntaActiva05(BigInteger preguntaActiva05) {
        this.preguntaActiva05 = preguntaActiva05;
    }

    public BigInteger getPreguntaActiva06() {
        return preguntaActiva06;
    }

    public void setPreguntaActiva06(BigInteger preguntaActiva06) {
        this.preguntaActiva06 = preguntaActiva06;
    }

    public BigInteger getPreguntaActiva07() {
        return preguntaActiva07;
    }

    public void setPreguntaActiva07(BigInteger preguntaActiva07) {
        this.preguntaActiva07 = preguntaActiva07;
    }

    public BigInteger getPreguntaActiva08() {
        return preguntaActiva08;
    }

    public void setPreguntaActiva08(BigInteger preguntaActiva08) {
        this.preguntaActiva08 = preguntaActiva08;
    }

    public BigInteger getPreguntaActiva09() {
        return preguntaActiva09;
    }

    public void setPreguntaActiva09(BigInteger preguntaActiva09) {
        this.preguntaActiva09 = preguntaActiva09;
    }

    public BigInteger getPreguntaActiva10() {
        return preguntaActiva10;
    }

    public void setPreguntaActiva10(BigInteger preguntaActiva10) {
        this.preguntaActiva10 = preguntaActiva10;
    }

    public Collection<T00203agrupaPreguntas> getT00203agrupaPreguntasCollection() {
        return t00203agrupaPreguntasCollection;
    }

    public void setT00203agrupaPreguntasCollection(Collection<T00203agrupaPreguntas> t00203agrupaPreguntasCollection) {
        this.t00203agrupaPreguntasCollection = t00203agrupaPreguntasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPregresp != null ? idPregresp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00202preguntasYRespuestas)) {
            return false;
        }
        T00202preguntasYRespuestas other = (T00202preguntasYRespuestas) object;
        if ((this.idPregresp == null && other.idPregresp != null) || (this.idPregresp != null && !this.idPregresp.equals(other.idPregresp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00202preguntasYRespuestas[ idPregresp=" + idPregresp + " ]";
    }
    
}
