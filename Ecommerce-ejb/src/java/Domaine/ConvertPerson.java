/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;

import Service.entities.Person;

/**
 *
 * @author Shadowniic
 */
public class ConvertPerson {
    public static Person Convert(Personne p){
        return new Person(p.getUsername(),p.getPassword(), p.getNom(),  p.getPrenom(), p.getTelephone(),  p.getEmail(), p.getAdresse(), p.getRole());
    }
    public static Personne ConvertInverse(Person p){
        return new Personne( p.getNom(),  p.getPrenom(),p.getUsername(),p.getPassword(),p.getEmail(), p.getAdresse(),p.getTel1(), p.getRole());
    }
}
