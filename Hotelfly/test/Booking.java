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
public class Booking {
    
    public Booking() {
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
    String BookingD= "30-2-1995";
    String Id = "451AF"; 
    int Duration = 5;
    
    String expectedResult = BookingD + " " + Id + " " + Duration;
    String realResult = hotelfly.Booking.disp(BookingD, Duration, Id);
    assertEquals(expectedResult, realResult);
     }
}
