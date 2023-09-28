/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TextImplementation;
import modelo.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Main {

    public static void main(String[] args) {
        try {
            Properties archivo = new Properties();
            FileInputStream fis;
            fis = new FileInputStream("archivo.properties");

            archivo.load(fis);

            final String view = archivo.getProperty("view");
            final String model = archivo.getProperty("model");

            if (view.equals("text")) {
                TextImplementation ti = ViewFactory.getTextImplementation();

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
