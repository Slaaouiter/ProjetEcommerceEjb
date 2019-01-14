/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Metier;

import DAO.ProduitDAOLocal;
import Domaine.ConvertProduit;
import Domaine.ProduitDomaine;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Youssef
 */
@Stateless
public class ProduitService implements ProduitServiceLocal {

    @EJB
    private ProduitDAOLocal  dao;
    
    @Override
    public void save(ProduitDomaine a) {
        dao.save(ConvertProduit.Convert(a));
    }

    @Override
    public ProduitDomaine getById(Integer id) {
        return ConvertProduit.ConvertInverse(dao.getById(id)) ;
    }

    @Override
    public List<ProduitDomaine> getAll() {
        return ConvertProduit.ConvertInverseList(dao.getAll()) ;
    }

    @Override
    public ProduitDomaine update(ProduitDomaine a) {
        return ConvertProduit.ConvertInverse(dao.update(ConvertProduit.Convert(a)));
    }

    @Override
    public void delete(String libelle) {
        dao.delete(libelle);
    }

    @Override
    public List<ProduitDomaine> getByString(String critere) {
        System.err.println("IN METIER");
        return ConvertProduit.ConvertInverseList(dao.getByString(critere)) ;
    }

    
    @Override
    public ProduitDomaine getByLib(String lib) {
        return  ConvertProduit.ConvertInverse(dao.getByLib(lib)) ;
  
    }
}
