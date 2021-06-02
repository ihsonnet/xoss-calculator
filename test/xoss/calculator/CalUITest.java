/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoss.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ihsonnet
 */
public class CalUITest {

    public CalUITest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class CalUI.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 2;
        CalUI instance = new CalUI();
        int expResult = 4;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of backSpace method, of class CalUI.
     */
    @Test
    public void testBackSpace() {
        System.out.println("backSpace");
        CalUI instance = new CalUI();
        String actual = instance.backSpace();
        
        assertEquals("0", actual);
    }

    /**
     * Test of calculate method, of class CalUI.
     */
    @Test
    public void testCalculateAdd() {
        System.out.println("calculate");
        String str = "8 + 9";
        CalUI instance = new CalUI();
        float expResult = 17.0F;
        float result = instance.calculate(str);
        assertEquals(expResult, result, 17.0);
    }
    
     @Test
    public void testCalculateSub() {
        System.out.println("calculate");
        String str = "45 - 8";
        CalUI instance = new CalUI();
        float expResult = 37.0F;
        float result = instance.calculate(str);
        assertEquals(expResult, result, 37.0);
    }
    
     @Test
    public void testCalculateMul() {
        System.out.println("calculate");
        String str = "8 * 9";
        CalUI instance = new CalUI();
        float expResult = 72.0F;
        float result = instance.calculate(str);
        assertEquals(expResult, result, 72.0);
    }
    
      @Test
    public void testCalculateDiv() {
        System.out.println("calculate");
        String str = "80 / 9";
        CalUI instance = new CalUI();
        float expResult = 26.6F;
        float result = instance.calculate(str);
        assertEquals(expResult, result, 26.6666667);
    }

    /**
     * Test of saveHistory method, of class CalUI.
     */
    @Test
    public void testSaveHistory() {
        System.out.println("saveHistory");
        String hist = "8 + 2 = 10";
        CalUI instance = new CalUI();
        String actual = instance.saveHistory(hist);
        
        assertEquals(hist, actual);
    }
  
    /**
     * Test of main method, of class CalUI.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        CalUI.main(args);
//        fail("Main methond run faild");
//    }

}
