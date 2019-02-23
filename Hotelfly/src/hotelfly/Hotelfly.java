/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1895212
 */
public class Hotelfly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating objects for class
        Customer c = new Customer("Mr Parry","Micheal","parrym92@gmail.com",43852000,161);
        Single s = new Single("576 Montrose Ave",15);
        Rooms r = new Rooms(16,5,2,"Delux Room", 1670.0);
        Booking b = new Booking();
        Detail d = new Detail(3,143);
       
        
        //Display Details
        System.out.println("\nBooking Details");
        //System.out.println("Booking date: "+b.date);
        c.displayCustomer();
        r.display();
        d.displayDetails();
        s.display();
        
    }
    
}
