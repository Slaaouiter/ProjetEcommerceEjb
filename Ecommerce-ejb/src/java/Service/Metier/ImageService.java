/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Metier;

import DAO.ImageDAOLocal;
import Domaine.ConvertImage;
import Domaine.ImageDomaine;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Shadowniic
 */
@Stateless
public class ImageService implements ImageServiceRemote{
   @EJB
    private ImageDAOLocal dao;
    @Override
    public void save(ImageDomaine a) {
        dao.save(ConvertImage.Convert(a));
    }

    @Override
    public ImageDomaine getById(Integer id) {
        return ConvertImage.ConvertInverse(dao.getById( id));
    }

    @Override
    public List<ImageDomaine> getAll() {
    return ConvertImage.ConvertInverseList(dao.getAll());
    }

    @Override
    public ImageDomaine update(ImageDomaine a) {
       return ConvertImage.ConvertInverse(dao.update(ConvertImage.Convert(a)));
    }
   

    @Override
    public List<ImageDomaine> getByProduit(int id) {
        return ConvertImage.ConvertInverseList(dao.getByProduit(id)); 
    }
    
}
