/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author LuisMiguel_Blanco
 */
public class PrestamoTest {

  

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
    public void testEstudio_Valores_borde1() {
        System.out.println("El prestamo es menor que 1000 , carece de interes");
        int cantidad = 999;
        Prestamo instance = new Prestamo();
        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEstudio_Valores_borde2() {
        System.out.println("El prestamo es 1000, es concedido");
        int cantidad = 1000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEstudio_Valores_borde3() {
        System.out.println("El pestamo es concedido, son 15000");
        int cantidad = 15000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEstudio_Valores_borde4() {
        System.out.println(" el prestamo es 14999 ,felicidades prestamo concedido");
        int cantidad = 14999;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEstudio_Valores_limite1() {
        System.out.println("El prestado está entre 1000 y 15000");
        int cantidad = 2000;
        Prestamo instance = new Prestamo();
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
        Prestamo instance = new Prestamo();
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
        Prestamo instance = new Prestamo();
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    /*
     Valores borde

       999  devolverá "Préstamo no concedido carece de interes"  
       1000  devolverá"Felicidades, préstamo concedido"
       15000 devolverá "Felicidades, préstamo concedido"
       14999 devolverá "Felicidades, préstamo concedido"

     Valores limite

      2000 devolverá "Felicidades, préstamo concedido"
      650  devolverá  "Préstamo no concedido carece de interes"
      20000 devolverá  "Préstamo no concedido es una operación con demasiado riesgo"

     */
}
