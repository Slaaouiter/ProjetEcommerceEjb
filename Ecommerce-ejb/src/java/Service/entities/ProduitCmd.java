/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Youssef
 */
@Entity
@Table(name = "produit_cmd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProduitCmd.findAll", query = "SELECT p FROM ProduitCmd p"),
    @NamedQuery(name = "ProduitCmd.findByIdCmd", query = "SELECT p FROM ProduitCmd p WHERE p.produitCmdPK.idCmd = :idCmd"),
    @NamedQuery(name = "ProduitCmd.findByIdPrd", query = "SELECT p FROM ProduitCmd p WHERE p.produitCmdPK.idPrd = :idPrd"),
    @NamedQuery(name = "ProduitCmd.findByQte", query = "SELECT p FROM ProduitCmd p WHERE p.qte = :qte")})
public class ProduitCmd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProduitCmdPK produitCmdPK;
    @Column(name = "QTE")
    private Integer qte;
    @JoinColumn(name = "id_cmd", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Commande commande;
    @JoinColumn(name = "id_prd", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produit produit;

    public ProduitCmd() {
    }

    public ProduitCmd(ProduitCmdPK produitCmdPK) {
        this.produitCmdPK = produitCmdPK;
    }

    public ProduitCmd(Integer qte, Commande commande, Produit produit) {
        this.qte = qte;
        this.commande = commande;
        this.produit = produit;
    }
    

    public ProduitCmd(int idCmd, int idPrd) {
        this.produitCmdPK = new ProduitCmdPK(idCmd, idPrd);
    }

    public ProduitCmdPK getProduitCmdPK() {
        return produitCmdPK;
    }

    public void setProduitCmdPK(ProduitCmdPK produitCmdPK) {
        this.produitCmdPK = produitCmdPK;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produitCmdPK != null ? produitCmdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduitCmd)) {
            return false;
        }
        ProduitCmd other = (ProduitCmd) object;
        if ((this.produitCmdPK == null && other.produitCmdPK != null) || (this.produitCmdPK != null && !this.produitCmdPK.equals(other.produitCmdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProduitCmd[ produitCmdPK=" + produitCmdPK + " ]";
    }
    
}
