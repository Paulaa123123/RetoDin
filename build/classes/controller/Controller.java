/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Model;
import view.View;

/**
 *
 * @author David,Paula.
 */
public class Controller {
    public void run(View view, Model model){
        view.showGreeting(model.getGreeting());
        
    }
}
