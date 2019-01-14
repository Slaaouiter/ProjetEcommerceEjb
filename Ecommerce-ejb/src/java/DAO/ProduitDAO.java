/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Service.entities.Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Youssef
 */
@Stateless
public class ProduitDAO implements ProduitDAOLocal {

    @PersistenceContext(unitName = "Ecommerce-ejbPU")
    private EntityManager em;

    @Override
    public void save(Produit a) {
            em.merge(a);
      }

    @Override
    public Produit getById(Integer id) {
         return em.find(Produit.class, id);
    }

    @Override
    public List<Produit> getAll() {
        Query rqt=em.createNamedQuery("Produit.findAll");
        return rqt.getResultList();  
    }

    @Override
    public Produit update(Produit a) {
           return em.merge(a);  
    }

    public void persist(Produit a) {
        em.persist(a);
    }

   

    @Override
    public void delete(String libelle) {
    Query rqt=em.createNamedQuery("Produit.findByLibelle");
    rqt.setParameter("libelle", libelle);
    Produit p=(Produit)rqt.getSingleResult();  
    em.remove(p);
     }

    @Override
    public List<Produit> getByString(String critere) {
        System.err.println("IN DAO");
        Query rqt=em.createNamedQuery("Produit.findByCritere");
        rqt.setParameter("critere","%"+critere+"%");
        System.err.println(critere);
        return rqt.getResultList(); 
    }
    @Override
    public Produit getByLib(String lib) {
    Query rqt=em.createNamedQuery("Produit.findByLibelle");
    rqt.setParameter("libelle", lib);
    return (Produit)rqt.getSingleResult();  
    }

}
