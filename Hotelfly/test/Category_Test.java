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
 * @author 1894831
 */
public class Category_Test {
    
    public Category_Test() {
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
     public void testCategory() {
    String name="Delux_Rooms";
    String description="well maintained room";
    String type=" single or double";
   
    String expResult=name+" "+description+" "+type;
    String result=hotelfly.Category.displayforTest(name,description,type);
    
     assertEquals(expResult,result);
     
     
     }
}
