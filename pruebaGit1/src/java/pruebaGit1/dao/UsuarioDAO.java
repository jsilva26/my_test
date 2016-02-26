/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaGit1.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pruebaGit1.models.Usuario;

/**
 *
 * @author Juan
 */
@Stateless
public class UsuarioDAO extends AbstractDAO<Usuario> {
    @PersistenceContext(unitName = "pruebaGit1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioDAO() {
        super(Usuario.class);
    }
   
    //Este es el lugar para escribir método de login
    public Usuario getLogin(String login, String password){
        try{
            Query query = em.createNamedQuery("Usuario.findLogin");
            query.setParameter("login", login);
            query.setParameter("password", password);
            return (Usuario)query.getSingleResult();
        }catch(Exception e){
            return null;
        }
    }
}
