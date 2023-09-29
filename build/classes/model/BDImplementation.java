/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la base de datos de donde obtenemos el valor del saludo.
 * @author David.
 */
public class BDImplementation implements Model {

    //Variables que usaremos más tarde
    private Connection con = null;
    private PreparedStatement stmt;
    
    //Secuencia que devuelve el saludo de la base de datos.
    final private String SALUDO = "SELECT * FROM Greeting";

    /**
     * Método que abre la conexión con la base de datos.
     */
    public void openConnection() {

        try {

            //Variables en las que guardamos la información obtenida de un archivo de configuración para abrir la conexión con la base de datos.
            final String URL = ResourceBundle.getBundle("app.configbda").getString("url");
            final String USER = ResourceBundle.getBundle("app.configbda").getString("user");
            final String PASSWORD = ResourceBundle.getBundle("app.configbda").getString("password");

            con = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException ex) {
            Logger.getLogger(BDImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Método para cerrar la conexión con la base de datos.
     */
    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que devuelve el saludo obtenido de la base de datos.
     * @return Devuelve el saludo de la base de datos.
     */
    @Override
    public String getGreeting() {
        String greeting = null;
        //Abrimos la conexión con la base de datos.
        this.openConnection();

        try {
            //Ejecutamos la select y obtenemos el saludo.
            stmt = con.prepareStatement(SALUDO);

            //Guardamos el valor que devuelve la select.
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                greeting = rs.getString("greeting");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Cerramos la conexión de la base de datos.
        this.closeConnection();
        //Devolvemos el saludo.
        return greeting;
    }

}
