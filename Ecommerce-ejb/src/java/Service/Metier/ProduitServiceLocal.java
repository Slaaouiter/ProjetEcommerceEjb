/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Metier;

import Domaine.ProduitDomaine;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Youssef
 */
@Remote
public interface ProduitServiceLocal extends Serializable {
        public void save(ProduitDomaine a);
	public ProduitDomaine getById(Integer id);
	public  List<ProduitDomaine> getByString(String critere);
	public List<ProduitDomaine> getAll();
        public ProduitDomaine update(ProduitDomaine a);
        public void delete(String libelle);
        
        public ProduitDomaine getByLib(String lib);
}
