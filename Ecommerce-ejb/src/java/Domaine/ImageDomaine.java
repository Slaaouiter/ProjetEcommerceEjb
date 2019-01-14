/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domaine;

import java.io.Serializable;


/**
 *
 * @author Shadowniic
 */

public class ImageDomaine implements Serializable {

    private Integer id;
    private String url;
    private int idprod;

    public ImageDomaine() {
    }

    public ImageDomaine(Integer id) {
        this.id = id;
    }

    public ImageDomaine(Integer id, String url, int idprod) {
        this.id = id;
        this.url = url;
        this.idprod = idprod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageDomaine)) {
            return false;
        }
        ImageDomaine other = (ImageDomaine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.Image[ id=" + id + " ]";
    }
    
}
