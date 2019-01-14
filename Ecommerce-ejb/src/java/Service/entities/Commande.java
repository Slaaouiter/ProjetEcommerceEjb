/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Youssef
 */
@Entity
@Table(name = "commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
    @NamedQuery(name = "Commande.findById", query = "SELECT c FROM Commande c WHERE c.id = :id"),
    @NamedQuery(name = "Commande.findByDateCmd", query = "SELECT c FROM Commande c WHERE c.dateCmd = :dateCmd")})
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_cmd")
    @Temporal(TemporalType.DATE)
    private Date dateCmd;
    @JoinColumn(name = "id_clt", referencedColumnName = "id")
    @ManyToOne
    private Person idClt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande")
    private Collection<ProduitCmd> produitCmdCollection;

    public Commande() {
    }

    public Commande(Integer id) {
        this.id = id;
    }

    public Commande(Integer id, Date dateCmd, Person idClt) {
        this.id = id;
        this.dateCmd = dateCmd;
        this.idClt = idClt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    public Person getIdClt() {
        return idClt;
    }

    public void setIdClt(Person idClt) {
        this.idClt = idClt;
    }

    @XmlTransient
    public Collection<ProduitCmd> getProduitCmdCollection() {
        return produitCmdCollection;
    }

    public void setProduitCmdCollection(Collection<ProduitCmd> produitCmdCollection) {
        this.produitCmdCollection = produitCmdCollection;
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Commande[ id=" + id + " ]";
    }
    
}
