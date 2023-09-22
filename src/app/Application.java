/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.Controller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.ModelFactory;
import modelo.TextImplementation;
import modelo.ViewFactory;
import modelo.Model;
import modelo.View;

/**
 *
 * @author 2dam
 */
public class Application{

    public static void main(String[] args) {
        
    new Controller().run(ViewFactory.getView(), ModelFactory.getModel());
    }


}
