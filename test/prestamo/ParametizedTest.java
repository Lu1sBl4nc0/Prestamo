package prestamo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import prestamo.Prestamo;

/**
 *
 * @author LuisMiguel_Blanco
 */


@RunWith(value = Parameterized.class)
public class ParametizedTest {

    /**
     * Test of main method, of class Prestamo.
     */
    /**
     * Test of estudio method, of class Prestamo.
     */
 

    String sRespuesta;
    int cantidad;

    public ParametizedTest(String sResp, int cant) {
        
        this.sRespuesta = sResp;
        this.cantidad = cant;
    }

    @Parameters

    public static Iterable<Object[]> getdata() {

        List<Object[]> Obj = new ArrayList<>();

        /*valores borde*/
        Obj.add(new Object[]{"Préstamo no concedido carece de interes",999});
        Obj.add(new Object[]{"Felicidades, préstamo concedido",1000});
        Obj.add(new Object[]{"Felicidades, préstamo concedido",15000});
        Obj.add(new Object[]{"Felicidades, préstamo concedido",14999});
         
        /*valores limite*/
        
        Obj.add(new Object[]{"Felicidades, préstamo concedido",2000});
        Obj.add(new Object[]{"Préstamo no concedido carece de interes",650});
        Obj.add(new Object[]{ "Préstamo no concedido es una operación con demasiado riesgo",20000});
        
        return Obj;

    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Prestamo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

 

  /*
   Valores borde

       999   "Préstamo no concedido carece de interes"  
       1000  "Felicidades, préstamo concedido"
       15000  "Felicidades, préstamo concedido"
       14999  "Felicidades, préstamo concedido"

   Valores limite

    2000  "Felicidades, préstamo concedido"
    650    "Préstamo no concedido carece de interes"
    20000   "Préstamo no concedido es una operación con demasiado riesgo"


  */