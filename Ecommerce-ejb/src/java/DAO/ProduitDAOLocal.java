/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Service.entities.Produit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Youssef
 */
@Local
public interface ProduitDAOLocal {
        public void save(Produit a);
	public Produit getById(Integer id);
	public List<Produit> getAll();
        public Produit update(Produit a); 
        public void delete(String libelle);
        public List<Produit> getByString(String critere);       
        public Produit getByLib(String lib);

}
