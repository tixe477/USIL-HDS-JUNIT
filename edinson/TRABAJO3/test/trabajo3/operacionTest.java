/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class operacionTest {
    
    public operacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class operacion.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int num1 = 10;
        int num2 = 2;
        operacion instance = new operacion();
        int expResult = 12;
        int result = instance.suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class operacion.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int num1 = 15;
        int num2 = 10;
        operacion instance = new operacion();
        int expResult = 5;
        int result = instance.resta(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class operacion.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int num1 = 15;
        int num2 = 3;
        operacion instance = new operacion();
        int expResult = 45;
        int result = instance.multiplicacion(num1, num2);
        assertEquals(expResult, result);//compara el valor 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divicion method, of class operacion.
     */
    @Test
    public void testDivicion() {
        System.out.println("divicion");
        int num1 = 20;
        int num2 = 4;
        operacion instance = new operacion();
        int expResult = 5;
        int result = instance.divicion(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
