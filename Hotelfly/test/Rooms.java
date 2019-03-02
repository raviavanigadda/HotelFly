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
 * @author 1895212
 */
public class Rooms {
    
    public Rooms() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBooking() 
    {
    String Type= "Deluxe Room";
    int Id = 15; 
    int capacity=3;
    double price = 1205.34;
    
    String expectedResult =  Type + " "+ Id + " "+ price + " "+ capacity;
    String realResult = hotelfly.Rooms.disp(Type, Id, price, capacity);
    assertEquals(expectedResult, realResult);
    }
}
