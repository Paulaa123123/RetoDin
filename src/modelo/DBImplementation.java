/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david,paula
 */
public class DBImplementation implements Model{

    private Connection con = null;
    private PreparedStatement stmt;
    
    final private String SALUDO = "SELECT * FROM Greeting";
    
    public void abrirConexion(){

        try {

            final String URL = ResourceBundle.getBundle("modelo.configbda").getString("url");
            final String USER = ResourceBundle.getBundle("modelo.configbda").getString("user");
            final String PASSWORD = ResourceBundle.getBundle("modelo.configbda").getString("password");

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (SQLException ex) {
            Logger.getLogger(DBImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cerrarConexion() {
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
    @Override
    public String getGreeting() {
        String saludo = null;
        this.abrirConexion();
        
        try {
            stmt = con.prepareStatement(SALUDO);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                saludo = rs.getString("greeting");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        this.cerrarConexion();
        return saludo;
    }
    
}
