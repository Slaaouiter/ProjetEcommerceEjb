/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Metier;

import DAO.PersonDAOLocal;
import Domaine.ConvertPerson;
import Domaine.Personne;
import Service.entities.Person;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Youssef
 */
@Stateless
public class PersonService implements PersonServiceLocal {
    	@EJB
	private PersonDAOLocal dao;
        public static String getMd5(String input) 
        { 
        try { 

                // Static getInstance method is called with hashing MD5 
                MessageDigest md = MessageDigest.getInstance("MD5"); 

                // digest() method is called to calculate message digest 
                // of an input digest() return array of byte 
                byte[] messageDigest = md.digest(input.getBytes()); 

                // Convert byte array into signum representation 
                BigInteger no = new BigInteger(1, messageDigest); 

                // Convert message digest into hex value 
                String hashtext = no.toString(16); 
                while (hashtext.length() < 32) { 
                        hashtext = "0" + hashtext; 
                } 
                return hashtext; 
        } 

        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
                throw new RuntimeException(e); 
        } 
        } 
    @Override
    public void save(Personne a) {
        a.setPassword(getMd5(a.getPassword()));
        System.out.println("INSAVE METIER");
        dao.save(ConvertPerson.Convert(a));
    }

    @Override
    public Personne getById(Integer id) {
        return ConvertPerson.ConvertInverse(dao.getById(id));
      }

    @Override
    public List<Personne> getAll() {
      //return  dao.getAll();
      return new ArrayList<Personne>();
    }

    @Override
    public Personne update(Personne a) {
      Person b=ConvertPerson.Convert(a);
      b=dao.update(b);
      return ConvertPerson.ConvertInverse(b);
    }

    @Override
    public String getString() {
       return "HALLO FROM CHINA  ===>"+dao.getString();
    }

    @Override
    public Personne getByUsername(String username) {
        System.err.println("i am in getBYUSERNAME METIER");
        return ConvertPerson.ConvertInverse(dao.getByUsername(username));
    }

}
