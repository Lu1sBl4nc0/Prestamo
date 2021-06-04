/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LuisMiguel_Blanco
 */
public class PrestamoBALimiteTest {
    Prestamo instance = new Prestamo();
    public PrestamoBALimiteTest() {
    }
    
    @Before
    public void Before() {
        System.out.println("Before");
     instance = new Prestamo();    
    
    }
    
    @After
    public void After() {
        System.out.println("After");
    instance = null;
    
    }

    /**
     * Test of main method, of class Prestamo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Prestamo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
   @Test
    public void testEstudio_Valores_limite1() {
        System.out.println("El prestado está entre 1000 y 15000");
        int cantidad = 2000;
        //Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    @Test
    public void testEstudio_Valores_limite2() {
        System.out.println("El prestado es menor que 1000 cerece de interes");
        int cantidad = 650;
        //Prestamo instance = new Prestamo();
        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    @Test
    public void testEstudio_Valores_limite3() {
        System.out.println("El prestado es mayor  que 15000, operacion de riesgo");
        int cantidad = 20000;
        //Prestamo instance = new Prestamo();
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }
    
}
