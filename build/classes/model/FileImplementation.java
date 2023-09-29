/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Implementación del archivo de donde obtenemos el valor del saludo.
 * @author David,Paula.
 */
public class FileImplementation implements Model{

    //Método que obtiene el valor de la variable saludo del archivo donde se encuentra.
    @Override
    public String getGreeting() {
        return ResourceBundle.getBundle("app.greeting").getString("greeting");
    }
    
}
