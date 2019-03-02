/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author 1895212
 */
public class Booking {
  
    Date BookingDate,EndDate;
    String BookD,EndD;
    int Duration;
    Customer c;
    Date dt=new Date();
    static String id;
    
    public Booking(String Bdate, String Edate, int Duration)
    {
        this.BookD = Bdate;
        this.EndD = Edate;
        this.Duration = Duration;
    }
    
    public void setBookingdate(String Bdate)
    {
        this.BookingDate = parseDate(Bdate);
    }
    
    public Date getBookingdate()
    {
        return BookingDate;
    }
    
    
    public void setDuration(int Duration)
    {
        this.Duration = Duration;
    }
    
    public int getDuration()
    {
        return Duration;
    }
    
     public void display()
    {
        System.out.println("\nBooking Details:"+"\nBooking id: "+id+"\nBooking Date: "+ BookD+"\nDuration: "+Duration+" days\nEnd Date: "+EndD);
    }
    
          
    public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("dd-MM-yyyy").parse(date);
     } catch (ParseException e) {
         return null;
     }
  }
    
     public static String disp(String BookD, int Dur, String id)
      {
          String BookingD= BookD;
          String Id = id; 
          int Duration = Dur;
      return BookingD+" "+Id+" "+ Duration;
      }
    
}