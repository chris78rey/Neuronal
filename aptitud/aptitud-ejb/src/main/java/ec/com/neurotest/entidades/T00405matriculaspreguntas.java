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
import javax.persistence.Lob;
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
@Table(name = "T004_05MATRICULASPREGUNTAS")
@NamedQueries({
    @NamedQuery(name = "T00405matriculaspreguntas.findAll", query = "SELECT t FROM T00405matriculaspreguntas t")})
public class T00405matriculaspreguntas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MATRIC_PREG")
    private BigDecimal idMatricPreg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREGUNTA_ACTUAL")
    private BigInteger preguntaActual;
    @Column(name = "DEJAR_PENDIENTE")
    private BigInteger dejarPendiente;
    @Column(name = "PASAR_SIGUIENTE")
    private BigInteger pasarSiguiente;
    @Column(name = "REGRESAR_ANTERIOR")
    private BigInteger regresarAnterior;
    @Column(name = "CONTESTADA")
    private BigInteger contestada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TESTUSUARIO")
    private BigInteger idTestusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AGRMATR")
    private BigInteger idAgrmatr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSUSUA")
    private BigInteger idInsusua;
    @Column(name = "ORDEN_GENERAL")
    private BigInteger ordenGeneral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEN_PREGUNTA")
    private BigInteger ordenPregunta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PREGRESP")
    private BigInteger idPregresp;
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
    @Column(name = "RESP_PESO_VALOR_01")
    private Double respPesoValor01;
    @Column(name = "RESP_PESO_VALOR_02")
    private Double respPesoValor02;
    @Column(name = "RESP_PESO_VALOR_03")
    private Double respPesoValor03;
    @Column(name = "RESP_PESO_VALOR_04")
    private Double respPesoValor04;
    @Column(name = "RESP_PESO_VALOR_05")
    private Double respPesoValor05;
    @Column(name = "RESP_PESO_VALOR_06")
    private Double respPesoValor06;
    @Column(name = "RESP_PESO_VALOR_07")
    private Double respPesoValor07;
    @Column(name = "RESP_PESO_VALOR_08")
    private Double respPesoValor08;
    @Column(name = "RESP_PESO_VALOR_09")
    private Double respPesoValor09;
    @Column(name = "RESP_PESO_VALOR_10")
    private Double respPesoValor10;
    @Column(name = "RESP_SELECCIONUSUARIO_01")
    private BigInteger respSeleccionusuario01;
    @Column(name = "RESP_SELECCIONUSUARIO_02")
    private BigInteger respSeleccionusuario02;
    @Column(name = "RESP_SELECCIONUSUARIO_03")
    private BigInteger respSeleccionusuario03;
    @Column(name = "RESP_SELECCIONUSUARIO_04")
    private BigInteger respSeleccionusuario04;
    @Column(name = "RESP_SELECCIONUSUARIO_05")
    private BigInteger respSeleccionusuario05;
    @Column(name = "RESP_SELECCIONUSUARIO_06")
    private BigInteger respSeleccionusuario06;
    @Column(name = "RESP_SELECCIONUSUARIO_07")
    private BigInteger respSeleccionusuario07;
    @Column(name = "RESP_SELECCIONUSUARIO_08")
    private BigInteger respSeleccionusuario08;
    @Column(name = "RESP_SELECCIONUSUARIO_09")
    private BigInteger respSeleccionusuario09;
    @Column(name = "RESP_SELECCIONUSUARIO_10")
    private BigInteger respSeleccionusuario10;
    @Column(name = "PREGUNTA_ACTIVA_01")
    private BigInteger preguntaActiva01;
    @Column(name = "PREGUNTA_ACTIVA_02")
    private BigInteger preguntaActiva02;
    @Column(name = "PREGUNTA_ACTIVA_03")
    private BigInteger preguntaActiva03;
    @Column(name = "PREGUNTA_ACTIVA_04")
    private BigInteger preguntaActiva04;
    @Column(name = "PREGUNTA_ACTIVA_05")
    private BigInteger preguntaActiva05;
    @Column(name = "PREGUNTA_ACTIVA_06")
    private BigInteger preguntaActiva06;
    @Column(name = "PREGUNTA_ACTIVA_07")
    private BigInteger preguntaActiva07;
    @Column(name = "PREGUNTA_ACTIVA_08")
    private BigInteger preguntaActiva08;
    @Column(name = "PREGUNTA_ACTIVA_09")
    private BigInteger preguntaActiva09;
    @Column(name = "PREGUNTA_ACTIVA_10")
    private BigInteger preguntaActiva10;
    @Lob
    @Column(name = "IMAGEN_PREGUNTA")
    private Serializable imagenPregunta;
    @Lob
    @Column(name = "IMEGEN_RESP_01")
    private Serializable imegenResp01;
    @Lob
    @Column(name = "IMEGEN_RESP_02")
    private Serializable imegenResp02;
    @Lob
    @Column(name = "IMEGEN_RESP_03")
    private Serializable imegenResp03;
    @Lob
    @Column(name = "IMEGEN_RESP_04")
    private Serializable imegenResp04;
    @Lob
    @Column(name = "IMEGEN_RESP_05")
    private Serializable imegenResp05;
    @Lob
    @Column(name = "IMEGEN_RESP_06")
    private Serializable imegenResp06;
    @Lob
    @Column(name = "IMEGEN_RESP_07")
    private Serializable imegenResp07;
    @Lob
    @Column(name = "IMEGEN_RESP_08")
    private Serializable imegenResp08;
    @Lob
    @Column(name = "IMEGEN_RESP_09")
    private Serializable imegenResp09;
    @Lob
    @Column(name = "IMEGEN_RESP_10")
    private Serializable imegenResp10;
    @Column(name = "RADIOBOTON")
    private BigInteger radioboton;

    public T00405matriculaspreguntas() {
    }

    public T00405matriculaspreguntas(BigDecimal idMatricPreg) {
        this.idMatricPreg = idMatricPreg;
    }

    public T00405matriculaspreguntas(BigDecimal idMatricPreg, BigInteger preguntaActual, BigInteger idTestusuario, BigInteger idAgrmatr, BigInteger idInsusua, BigInteger ordenPregunta, BigInteger idPregresp) {
        this.idMatricPreg = idMatricPreg;
        this.preguntaActual = preguntaActual;
        this.idTestusuario = idTestusuario;
        this.idAgrmatr = idAgrmatr;
        this.idInsusua = idInsusua;
        this.ordenPregunta = ordenPregunta;
        this.idPregresp = idPregresp;
    }

    public BigDecimal getIdMatricPreg() {
        return idMatricPreg;
    }

    public void setIdMatricPreg(BigDecimal idMatricPreg) {
        this.idMatricPreg = idMatricPreg;
    }

    public BigInteger getPreguntaActual() {
        return preguntaActual;
    }

    public void setPreguntaActual(BigInteger preguntaActual) {
        this.preguntaActual = preguntaActual;
    }

    public BigInteger getDejarPendiente() {
        return dejarPendiente;
    }

    public void setDejarPendiente(BigInteger dejarPendiente) {
        this.dejarPendiente = dejarPendiente;
    }

    public BigInteger getPasarSiguiente() {
        return pasarSiguiente;
    }

    public void setPasarSiguiente(BigInteger pasarSiguiente) {
        this.pasarSiguiente = pasarSiguiente;
    }

    public BigInteger getRegresarAnterior() {
        return regresarAnterior;
    }

    public void setRegresarAnterior(BigInteger regresarAnterior) {
        this.regresarAnterior = regresarAnterior;
    }

    public BigInteger getContestada() {
        return contestada;
    }

    public void setContestada(BigInteger contestada) {
        this.contestada = contestada;
    }

    public BigInteger getIdTestusuario() {
        return idTestusuario;
    }

    public void setIdTestusuario(BigInteger idTestusuario) {
        this.idTestusuario = idTestusuario;
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

    public BigInteger getOrdenGeneral() {
        return ordenGeneral;
    }

    public void setOrdenGeneral(BigInteger ordenGeneral) {
        this.ordenGeneral = ordenGeneral;
    }

    public BigInteger getOrdenPregunta() {
        return ordenPregunta;
    }

    public void setOrdenPregunta(BigInteger ordenPregunta) {
        this.ordenPregunta = ordenPregunta;
    }

    public BigInteger getIdPregresp() {
        return idPregresp;
    }

    public void setIdPregresp(BigInteger idPregresp) {
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

    public Double getRespPesoValor01() {
        return respPesoValor01;
    }

    public void setRespPesoValor01(Double respPesoValor01) {
        this.respPesoValor01 = respPesoValor01;
    }

    public Double getRespPesoValor02() {
        return respPesoValor02;
    }

    public void setRespPesoValor02(Double respPesoValor02) {
        this.respPesoValor02 = respPesoValor02;
    }

    public Double getRespPesoValor03() {
        return respPesoValor03;
    }

    public void setRespPesoValor03(Double respPesoValor03) {
        this.respPesoValor03 = respPesoValor03;
    }

    public Double getRespPesoValor04() {
        return respPesoValor04;
    }

    public void setRespPesoValor04(Double respPesoValor04) {
        this.respPesoValor04 = respPesoValor04;
    }

    public Double getRespPesoValor05() {
        return respPesoValor05;
    }

    public void setRespPesoValor05(Double respPesoValor05) {
        this.respPesoValor05 = respPesoValor05;
    }

    public Double getRespPesoValor06() {
        return respPesoValor06;
    }

    public void setRespPesoValor06(Double respPesoValor06) {
        this.respPesoValor06 = respPesoValor06;
    }

    public Double getRespPesoValor07() {
        return respPesoValor07;
    }

    public void setRespPesoValor07(Double respPesoValor07) {
        this.respPesoValor07 = respPesoValor07;
    }

    public Double getRespPesoValor08() {
        return respPesoValor08;
    }

    public void setRespPesoValor08(Double respPesoValor08) {
        this.respPesoValor08 = respPesoValor08;
    }

    public Double getRespPesoValor09() {
        return respPesoValor09;
    }

    public void setRespPesoValor09(Double respPesoValor09) {
        this.respPesoValor09 = respPesoValor09;
    }

    public Double getRespPesoValor10() {
        return respPesoValor10;
    }

    public void setRespPesoValor10(Double respPesoValor10) {
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

    public Serializable getImagenPregunta() {
        return imagenPregunta;
    }

    public void setImagenPregunta(Serializable imagenPregunta) {
        this.imagenPregunta = imagenPregunta;
    }

    public Serializable getImegenResp01() {
        return imegenResp01;
    }

    public void setImegenResp01(Serializable imegenResp01) {
        this.imegenResp01 = imegenResp01;
    }

    public Serializable getImegenResp02() {
        return imegenResp02;
    }

    public void setImegenResp02(Serializable imegenResp02) {
        this.imegenResp02 = imegenResp02;
    }

    public Serializable getImegenResp03() {
        return imegenResp03;
    }

    public void setImegenResp03(Serializable imegenResp03) {
        this.imegenResp03 = imegenResp03;
    }

    public Serializable getImegenResp04() {
        return imegenResp04;
    }

    public void setImegenResp04(Serializable imegenResp04) {
        this.imegenResp04 = imegenResp04;
    }

    public Serializable getImegenResp05() {
        return imegenResp05;
    }

    public void setImegenResp05(Serializable imegenResp05) {
        this.imegenResp05 = imegenResp05;
    }

    public Serializable getImegenResp06() {
        return imegenResp06;
    }

    public void setImegenResp06(Serializable imegenResp06) {
        this.imegenResp06 = imegenResp06;
    }

    public Serializable getImegenResp07() {
        return imegenResp07;
    }

    public void setImegenResp07(Serializable imegenResp07) {
        this.imegenResp07 = imegenResp07;
    }

    public Serializable getImegenResp08() {
        return imegenResp08;
    }

    public void setImegenResp08(Serializable imegenResp08) {
        this.imegenResp08 = imegenResp08;
    }

    public Serializable getImegenResp09() {
        return imegenResp09;
    }

    public void setImegenResp09(Serializable imegenResp09) {
        this.imegenResp09 = imegenResp09;
    }

    public Serializable getImegenResp10() {
        return imegenResp10;
    }

    public void setImegenResp10(Serializable imegenResp10) {
        this.imegenResp10 = imegenResp10;
    }

    public BigInteger getRadioboton() {
        return radioboton;
    }

    public void setRadioboton(BigInteger radioboton) {
        this.radioboton = radioboton;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMatricPreg != null ? idMatricPreg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T00405matriculaspreguntas)) {
            return false;
        }
        T00405matriculaspreguntas other = (T00405matriculaspreguntas) object;
        if ((this.idMatricPreg == null && other.idMatricPreg != null) || (this.idMatricPreg != null && !this.idMatricPreg.equals(other.idMatricPreg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.neurotest.entidades.T00405matriculaspreguntas[ idMatricPreg=" + idMatricPreg + " ]";
    }
    
}
