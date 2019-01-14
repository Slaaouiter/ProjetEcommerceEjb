/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;

import java.io.Serializable;

/**
 *
 * @author Youssef
 */
public class ProduitDomaine implements Serializable{
    int id ;
    private String libelle;
    private Double prix;
    private Integer qte;
    private String type;

    public ProduitDomaine() {
    }

    public ProduitDomaine(int id ,String libelle, Double prix, Integer qte, String type) {
        this.id=id;
        this.libelle = libelle;
        this.prix = prix;
        this.qte = qte;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
