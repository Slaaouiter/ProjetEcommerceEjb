/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Service.entities.Image;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Shadowniic
 */
@Local
public interface ImageDAOLocal {
    	public void save(Image a);
	public Image getById(Integer id);      
	public List<Image> getAll();
        public Image update(Image a);
        public List<Image>  getByProduit(int id);

}