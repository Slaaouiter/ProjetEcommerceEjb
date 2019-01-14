/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Service.entities.Person;
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
public class PersonDAO implements PersonDAOLocal {

    @PersistenceContext(unitName = "Ecommerce-ejbPU")
    private EntityManager em;

    @Override
    public void save(Person a) {
        em.merge(a);
    }

    @Override
    public Person getById(Integer id) {
        return em.find(Person.class, id);
    }
    

    @Override
    public List<Person> getAll() {
        Query rqt=em.createNamedQuery("Person.findAll");
        
        return rqt.getResultList();  
    }

    public void persist(Person person) {
        em.persist(person);
    }

    @Override
    public Person update(Person a) {
      return em.merge(a);  
    }

    @Override
    public String getString() {
    return "You made to the DAO amazing"+getById(1).getNom()    ;
    }

    @Override
    public Person getByUsername(String username) {
        System.err.println("i am in getBYUSERNAME DAO");
        Query rqt=em.createNamedQuery("Person.findByUsername");
        rqt.setParameter("username", username);
            return (Person)rqt.getSingleResult();  
    }

    
}
