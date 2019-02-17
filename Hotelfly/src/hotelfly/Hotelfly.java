/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

/**
 *
 * @author 1895212
 */
public class Hotelfly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Booking b = new Booking();
        Customer c = new Customer();
        Single s = new Single("576 Montrose Ave, NDG");
        Rooms r = new Rooms(5,2,"Delux Room", 1670.0);
        c.setFirstName("M.Johnson Michelle");
        c.setPhoneNo(438874456);
        b.setBookingdate("17-02-2019");
        b.setDuration(5);
        System.out.println("\nBooking Date: "+b.BookingDate+"\nCustomer Name: "+c.firstName+"\nPhone no: "+c.phoneNo+
                "\nAddress: "+s.address+"\nDuration: "+b.Duration+" days");
        r.display();
    }
    
}
