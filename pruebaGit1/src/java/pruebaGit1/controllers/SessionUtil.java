/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaGit1.controllers;

import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juan
 */
public class SessionUtil {

    //Método para crar las variables de sesión.
    public static void addSession(Integer userId, String userNombre, Integer tipo, String userTipo){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession sesion = (HttpSession)context.getExternalContext().getSession(true);
        
        sesion.setAttribute("userlog", userId);
        sesion.setAttribute("userNombre", userNombre);
        sesion.setAttribute("userTipoId", tipo);
        sesion.setAttribute("userTipo", userTipo);
    }
    
    //Método para cerrar la sesión
    public static void closeSession(){
        ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
        ((HttpSession)ctx.getSession(false)).invalidate();
    }
    
    //Recupera el Id del usuario logueado
    public static Integer getUserLog(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession sesion = (HttpSession)context.getExternalContext().getSession(false);
        Integer userLog = (Integer)sesion.getAttribute("userLog");
        return userLog;
    }
    
    //Recupera el nombre del usuario logueado
    public static String getUserNombreLog(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession sesion = (HttpSession)context.getExternalContext().getSession(false);
        String nombre = (String)sesion.getAttribute("userNombre");
        return nombre;
    }
    
    //Recupera el tipo de usuario del usuario logueado (Id) 
    public static Integer getIdUserTipoLog(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession sesion = (HttpSession)context.getExternalContext().getSession(false);
        Integer tipo = (Integer)sesion.getAttribute("userTipoId");
        return tipo;
    }
    
    //Recupera el tipo de usuario del usuario logueado (nombre)
    public static String getUserTipoLog(){
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession sesion = (HttpSession)context.getExternalContext().getSession(false);
        String tipo = (String)sesion.getAttribute("UserTipo");
        return tipo;
    }
    
    //Recupera la página actual que se está visitando
    public static String getPagina(){
        ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
        return ctx.getRequestPathInfo();
    }
    
    //Método apra redirigir la página del sitio
    public static void redirectTo(String url){
        ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
        String ctxPath = ((ServletContext)ctx.getContext()).getContextPath();
        try{
            ctx.redirect(ctxPath + url);
        }catch(IOException ex){}
    }
    
    public static void addErrorMessage(String msg){
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }
}
