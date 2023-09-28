/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author david,paula
 */
public class ViewFactory {
    /*public static View getTextImplementation(){
        return new TextImplementation();
    }*/
    
    public static View getView(){
        return new TextImplementation();
    }
}
