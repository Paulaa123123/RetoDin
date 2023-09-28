/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.ViewImplementation;
import java.util.ResourceBundle;

/**
 * Factoría para crear la implementación correcta de la vista.
 * @author David,Paula.
 */
public class ViewFactory {
    //Método que devuelve la implementacion correcta de la vista.
    public static View getView(){
        
        String view = ResourceBundle.getBundle("app.archivo").getString("view");
        
        if(view.equalsIgnoreCase("text")){
            return new TextImplementation();
        } else{
            return new ViewImplementation();
        }
        
    }
}
