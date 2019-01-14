/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;

import Service.entities.Produit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Youssef
 */
public class ConvertProduit {
        public static Produit Convert(ProduitDomaine p){
        return new Produit(p.getId(),p.getLibelle(),p.getPrix(), p.getQte(),  p.getType());
    }
        
    public static ProduitDomaine ConvertInverse(Produit p){
        return new ProduitDomaine(p.getId(),p.getLibelle(),p.getPrix(), p.getQte(),  p.getType());
    }
            
    public static List<ProduitDomaine> ConvertInverseList(List<Produit> p){
        List<ProduitDomaine> copy = new ArrayList<>();
        for (Produit produit :p) {
             copy.add(ConvertInverse(produit));
        }
        return copy;
    }
}
