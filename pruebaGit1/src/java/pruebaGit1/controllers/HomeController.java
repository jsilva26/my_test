package pruebaGit1.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Juan
 */
@ManagedBean
@SessionScoped
public class HomeController {

    /**
     * Creates a new instance of HomeController
     */
    public HomeController() {
    }
    
    public String index(){
        return "/index"; //para navegar hacia inicio (index)
    }
    
    public String acercaDe(){
        return "/home/acerca_de"; //para navegar hacia acerca_de que esta dentro de home
    }
    
    public String infoDelPie(){ 
        String nombre = null;
        String tipo = null;
        String usuario ="";
        if(nombre!=null && tipo!=null){
            usuario=nombre+"( "+tipo+" )";
        }
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy h:mm a");
        Date d = new Date();
        String fechaStr= sdf.format(d);
        return usuario + " - " + fechaStr + " - Desarrollado por Java EE 7";
    }//Está lógica se escribe aquí porque no es logica que se conecta a bd, de ser el caso se tendría en otro paquete
    
}
