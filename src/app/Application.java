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
import vista.TextImplementation;
import vista.ViewFactory;
import modelo.Model;
import vista.FXMLController;
import vista.View;

/**
 *
 * @author 2dam
 */
public class Application extends javafx.application.Application{

    public static void main(String[] args) {
        
    new Controller().run(ViewFactory.getView(), ModelFactory.getModel());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("vista.view.fxml"));
        
        Parent root = loader.load();
       
        FXMLController viewController = loader.getController();
        //viewController.setGreeting(greeting);
//Create a scene for view
        Scene scene = new Scene(root);
        //Put the view on Stage
        primaryStage.setScene(scene);
        //Show the stage
        
        primaryStage.showAndWait();
    }


}
