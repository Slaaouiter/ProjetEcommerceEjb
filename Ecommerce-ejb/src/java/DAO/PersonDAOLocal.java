/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Service.entities.Person;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Youssef
 */
@Local
public interface PersonDAOLocal {
    	public void save(Person a);
	public Person getById(Integer id);
	public List<Person> getAll();
        public Person update(Person a);
        public String getString();
        public Person getByUsername(String username);

}
