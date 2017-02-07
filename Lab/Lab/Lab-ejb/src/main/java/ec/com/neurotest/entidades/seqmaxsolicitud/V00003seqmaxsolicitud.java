/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.neurotest.entidades.seqmaxsolicitud;

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
@Table(name = "V000_03SEQMAXSOLICITUD")
@NamedQueries({
    @NamedQuery(name = "V00003seqmaxsolicitud.findAll", query = "SELECT v FROM V00003seqmaxsolicitud v")})
public class V00003seqmaxsolicitud implements Serializable {

    private static final long serialVersionUID = 3736750373574802621L;

    @Column(name = "IDSOLICI")
    @Id
    private BigInteger idsolici;

    public V00003seqmaxsolicitud() {
    }

    public BigInteger getIdsolici() {
        return idsolici;
    }

    public void setIdsolici(BigInteger idsolici) {
        this.idsolici = idsolici;
    }

}
