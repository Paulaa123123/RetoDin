/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ResourceBundle;
import model.FileImplementation;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author David, Paula.
 */
public class FileImplementationTest {

    public FileImplementationTest() {

    }

    @Test
    public void testGetGreeting() {
        FileImplementation fi = new FileImplementation();
        assertEquals("Hello World from the file.", fi.getGreeting());
    }

}
