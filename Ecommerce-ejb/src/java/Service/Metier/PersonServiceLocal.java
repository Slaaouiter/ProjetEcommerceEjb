/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Metier;

import Domaine.Personne;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Youssef
 */
@Remote
public interface PersonServiceLocal extends Serializable{
        	public void save(Personne a);
                public Personne getById(Integer id);
                public List<Personne> getAll();
                public Personne update(Personne a);
                public String getString();
                public Personne getByUsername(String username);
}
