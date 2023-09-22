/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ResourceBundle;

/**
 *
 * @author david,paula
 */
public class ModelFactory {
    /*public static Model getImplementationDB(){
        return new DBImplementation();
    }*/
    
    public static Model getModel(){
        return new FileImplementation();
    }
}
