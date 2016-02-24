/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaGit1.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "menu_tipo_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenuTipoUsuario.findAll", query = "SELECT m FROM MenuTipoUsuario m"),
    @NamedQuery(name = "MenuTipoUsuario.findByIdMenuTipoUsuario", query = "SELECT m FROM MenuTipoUsuario m WHERE m.idMenuTipoUsuario = :idMenuTipoUsuario"),
    @NamedQuery(name = "MenuTipoUsuario.findByMenuId", query = "SELECT m FROM MenuTipoUsuario m WHERE m.menuId = :menuId"),
    @NamedQuery(name = "MenuTipoUsuario.findByTipoUsuario", query = "SELECT m FROM MenuTipoUsuario m WHERE m.tipoUsuario = :tipoUsuario"),
    @NamedQuery(name = "MenuTipoUsuario.findByCreated", query = "SELECT m FROM MenuTipoUsuario m WHERE m.created = :created"),
    @NamedQuery(name = "MenuTipoUsuario.findByUpdated", query = "SELECT m FROM MenuTipoUsuario m WHERE m.updated = :updated")})
public class MenuTipoUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_menu_tipo_usuario")
    private Integer idMenuTipoUsuario;
    @Column(name = "menu_id")
    private Integer menuId;
    @Column(name = "tipo_usuario")
    private Integer tipoUsuario;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    public MenuTipoUsuario() {
    }

    public MenuTipoUsuario(Integer idMenuTipoUsuario) {
        this.idMenuTipoUsuario = idMenuTipoUsuario;
    }

    public Integer getIdMenuTipoUsuario() {
        return idMenuTipoUsuario;
    }

    public void setIdMenuTipoUsuario(Integer idMenuTipoUsuario) {
        this.idMenuTipoUsuario = idMenuTipoUsuario;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenuTipoUsuario != null ? idMenuTipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MenuTipoUsuario)) {
            return false;
        }
        MenuTipoUsuario other = (MenuTipoUsuario) object;
        if ((this.idMenuTipoUsuario == null && other.idMenuTipoUsuario != null) || (this.idMenuTipoUsuario != null && !this.idMenuTipoUsuario.equals(other.idMenuTipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebaGit1.models.MenuTipoUsuario[ idMenuTipoUsuario=" + idMenuTipoUsuario + " ]";
    }
    
}
