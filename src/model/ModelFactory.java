/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Factoría para crear la implementación correcta del modelo.
 * @author David,Paula.
 */
public class ModelFactory {
    //Método que devuelve la implementacion correcta del modelo.
    public static Model getModel(){
        
        String model = ResourceBundle.getBundle("app.archivo").getString("model");
        
        if(model.equalsIgnoreCase("file")){
            return new FileImplementation();
        } else{
            return new BDImplementation();
        }
        
    }
}
