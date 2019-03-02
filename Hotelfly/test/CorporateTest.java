/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1897564
 */
public class CorporateTest {
    
    public CorporateTest() {
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

    @Test
    public void testCorp() {
    
        String name="Mr.Singh";
        int id=25;
        String expResult=name+","+id;
        String result=hotelfly.Corporate.corporateforTest(name, id);
        assertEquals(expResult, result);
    
    }
}
