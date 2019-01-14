/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;

import static Domaine.ConvertProduit.ConvertInverse;
import Service.entities.Image;
import Service.entities.Person;
import Service.entities.Produit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shadowniic
 */
public class ConvertImage {
     public static Image Convert(ImageDomaine i){
        return new Image(i.getId(),i.getUrl(), i.getIdprod());
    }
    public static ImageDomaine ConvertInverse(Image i){
        return new ImageDomaine(i.getId(),i.getUrl(), i.getIdprod());
    }
     public static List<ImageDomaine> ConvertInverseList(List<Image> i){
        List<ImageDomaine> copy = new ArrayList<>();
        for (Image image :i) {
             copy.add(ConvertInverse(image));
        }
        return copy;
    }
}
