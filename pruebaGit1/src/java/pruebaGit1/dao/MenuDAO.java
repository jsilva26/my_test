/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaGit1.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pruebaGit1.models.Menu;

/**
 *
 * @author Juan
 */
@Stateless
public class MenuDAO extends AbstractDAO<Menu> {
    @PersistenceContext(unitName = "pruebaGit1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuDAO() {
        super(Menu.class);
    }
    
}
