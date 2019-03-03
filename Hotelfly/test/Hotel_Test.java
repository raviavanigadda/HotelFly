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
public class Hotel_Test {
    
    public Hotel_Test() {
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
    public void testHotel() {
    
    String Name="name";
    String Address="Street1";
    int Phone=123445;
    int id=121;
    String expResult=Name+" "+Address+" "+Phone+" "+id;
     
    String result=hotelfly.Hotel.displayforTest(Name, Address, Phone, id);
    
     assertEquals(expResult,result);
    
     
    
    }
}
