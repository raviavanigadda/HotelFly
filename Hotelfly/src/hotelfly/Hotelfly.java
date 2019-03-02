/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

import static hotelfly.Booking.id;
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
        Customer c = new Customer("Mr Parry","Michel","parrym92@gmail.com",43852000,161);
        Single s = new Single("576 Montrose Ave",15);
        Rooms r = new Rooms(16,5,2,"Delux Room", 1670.0);
        Booking b = new Booking("5-03-2019","10-03-2019",5);
        Detail d = new Detail(3,143);
        
        Date dt=new Date();
        String date=dt.toString();
        String id= id(date, c.firstName, c.lastName);
        
        //Display Details
        b.display();
        c.displayCustomer();
        r.display();
        d.displayDetails();
        s.display();
        
    }
        
    public static String id(String d,String fname,String lname)
    {
        char today;
       
        String[] datesplit=d.split(" ");
        
        String year=datesplit[5].substring(2,4); //03-02-2019
        String month=datesplit[1].toUpperCase();
        String date=datesplit[2];
        
        int currentdate=Integer.parseInt(date);
       
            if(currentdate%2==0)
            {
                 today='E';
            }
            else
            {
                 today='O';
            }
           
        char fn=fname.charAt(0);
        char ln=lname.charAt(0);
       
        id=year+"-"+month+"-"+date+"-"+today+"-"+fn+ln;
        
        return id;
    }
}
