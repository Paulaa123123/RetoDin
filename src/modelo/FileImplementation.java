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
public class FileImplementation implements Model{

    @Override
    public String getGreeting() {
        /*ResourceBundle rb = ResourceBundle.getBundle("modelo.configbda");
        String text = rb.getString("greeting");*/
        return ResourceBundle.getBundle("modelo.greeting").getString("greeting");
    }
    
}
