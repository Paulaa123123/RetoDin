/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import model.BDImplementation;
import model.FileImplementation;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author David.
 */
public class BDImplementationTest {
    
    private BDImplementation dbImp;
    
    public BDImplementationTest() {

    }
    
    @Before
    public void openConnection(){
        dbImp = new BDImplementation();
        dbImp.openConnection();
    }
    
    
    @Test
    public void testGetGreeting() {
        assertEquals("Hello World", dbImp.getGreeting());
    }
    
    @After
    public void closeConnection(){
        dbImp.closeConnection();
    }
}
