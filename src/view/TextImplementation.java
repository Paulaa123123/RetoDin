/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Implementacion que muestra el saludo por texto.
 * @author David,Paula.
 */
public class TextImplementation implements View {

    /**
     * Método que muestra el saludo que le llega por parámetro.
     * @param greeting el saludo que le llega por parámetro.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
