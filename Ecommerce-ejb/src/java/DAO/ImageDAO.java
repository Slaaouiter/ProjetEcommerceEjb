/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Service.entities.Image;
import Service.entities.Person;
import Service.entities.Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Shadowniic
 */
@Stateless
public class ImageDAO implements ImageDAOLocal{
    @PersistenceContext(unitName = "Ecommerce-ejbPU")
    private EntityManager em;
    @Override
    public void save(Image a) {
        em.merge(a);
    }

    @Override
    public Image getById(Integer id) {
        return em.find(Image.class, id);
    }

    @Override
    public List<Image> getAll() {
    Query rqt=em.createNamedQuery("Image.findAll");
        return rqt.getResultList();      
    }

    @Override
    public Image update(Image a) {
       return em.merge(a);
    }
    public void persist(Image a) {
        em.persist(a);
    }

    @Override
    public List<Image> getByProduit(int id) {
        System.err.println("i am in getBYUSERNAME DAO");
        Query rqt=em.createNamedQuery("Image.findByIdprod");
        rqt.setParameter("idprod", id);
        return (List<Image>)rqt.getResultList(); 
    }

   
    
}
