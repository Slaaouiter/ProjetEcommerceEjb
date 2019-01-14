/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Youssef
 */
@Embeddable
public class ProduitCmdPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cmd")
    private int idCmd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_prd")
    private int idPrd;

    public ProduitCmdPK() {
    }

    public ProduitCmdPK(int idCmd, int idPrd) {
        this.idCmd = idCmd;
        this.idPrd = idPrd;
    }



    public int getIdCmd() {
        return idCmd;
    }

    public void setIdCmd(int idCmd) {
        this.idCmd = idCmd;
    }

    public int getIdPrd() {
        return idPrd;
    }

    public void setIdPrd(int idPrd) {
        this.idPrd = idPrd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCmd;
        hash += (int) idPrd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduitCmdPK)) {
            return false;
        }
        ProduitCmdPK other = (ProduitCmdPK) object;
        if (this.idCmd != other.idCmd) {
            return false;
        }
        if (this.idPrd != other.idPrd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProduitCmdPK[ idCmd=" + idCmd + ", idPrd=" + idPrd + " ]";
    }
    
}
