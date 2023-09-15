/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    public static DAO getDaoBDA(){
        return new DAOImplementationBD();
    }
    
    public static FileImplementation getFileImplementation(){
        return new FileImplementation();
    }
}