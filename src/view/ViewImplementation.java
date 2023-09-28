/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 *
 * @author David,Paula.
 */
public class ViewImplementation extends javafx.application.Application implements View {

    @FXML
    private Label greeting;

    //Método que crea un array de Strings y carga el saludo en el.
    
    @Override
    public void showGreeting(String greeting) {
        String[] args = new String[1];
        args[0] = greeting;
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            //Carga del archivo FXML.
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));

            Parent root = loader.load();

            ViewImplementation viewController = loader.getController();
            
            //Creación e instanciación de la escena y del escenario
            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            //Muestra del saludo obtenido del arrays de strings.
            viewController.greeting.setText(getParameters().getRaw().get(0));

            //Muestra del escenario.
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
