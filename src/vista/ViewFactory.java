/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.ViewImplementation;
import java.util.ResourceBundle;

/**
 *
 * @author david,paula
 */
public class ViewFactory {
    /*public static View getTextImplementation(){
        return new TextImplementation();
    }*/
    
    public static View getView(){
        
        String view = ResourceBundle.getBundle("app.archivo").getString("view");
        
        if(view.equalsIgnoreCase("text")){
            return new TextImplementation();
        } else{
            return new ViewImplementation();
        }
        
    }
}
