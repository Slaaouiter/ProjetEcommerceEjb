/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;

import java.io.Serializable;


/**
 *
 * @author Shadowniic
 */
public class Personne implements Serializable{
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String email;
    private String adresse;
    private String telephone;
    private String role;
    //Constructeurs
    public Personne() {
     }
    public Personne(String nom,String prenom, String username, String password, String email, String adresse, String telephone,String role) {
        this.nom = nom;
        this.prenom=prenom;
        this.username = username;
        this.password = password;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        this.role=role;
    }
    //Getters & Setters
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

   

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
    
    
    
}
