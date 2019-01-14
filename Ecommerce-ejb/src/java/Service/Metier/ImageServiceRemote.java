/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Metier;

import DAO.*;
import Domaine.ImageDomaine;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Shadowniic
 */
@Remote
public interface ImageServiceRemote extends Serializable{
    	public void save(ImageDomaine a);
	public ImageDomaine getById(Integer id);
	public List<ImageDomaine> getAll();
        public ImageDomaine update(ImageDomaine a);
        public List<ImageDomaine>  getByProduit(int id);

}