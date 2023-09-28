/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.Controller;
import model.ModelFactory;
import view.ViewFactory;

/**
 *
 * @author David, Paula.
 */
public class Application{

    public static void main(String[] args) {
    //Llamada al controlador
    new Controller().run(ViewFactory.getView(), ModelFactory.getModel());
    }


}
