/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import modelo.Model;
import vista.View;

/**
 *
 * @author 2dam
 */
public class Controller {
    public void run(View view, Model model){
        view.showGreeting(model.getGreeting());
        
    }
}
