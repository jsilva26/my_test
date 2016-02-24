/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaGit1.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pruebaGit1.models.MenuTipoUsuario;

/**
 *
 * @author Juan
 */
@Stateless
public class MenuTipoUsuarioDAO extends AbstractDAO<MenuTipoUsuario> {
    @PersistenceContext(unitName = "pruebaGit1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuTipoUsuarioDAO() {
        super(MenuTipoUsuario.class);
    }
    
}
