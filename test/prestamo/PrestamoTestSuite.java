/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author LuisMiguel_Blanco
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    prestamo.PrestamoACBCBordeTest.class, 
    prestamo.PrestamoTest.class, 
    prestamo.ParametizedTest.class, 
    prestamo.PrestamoBALimiteTest.class, 
    prestamo.PrestamoBABordeTest.class, 
    prestamo.PrestamoACBCLimiteTest.class})
public class PrestamoTestSuite {

   
    
}
