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
    public Date BookingDate,EndDate;
    int Duration,id;
    Date Bookingdate; // = parseDate("17-02-2019");
    Customer c;
    

   /* public Booking(Date Bdate, Date Edate, int Duration)
    {
        this.BookingDate = Bdate;
        this.EndDate = Edate;
        this.Duration = Duration;
    }*/
    
    public void setId(int I)
    {
        this.id=I;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setBookingdate(String Bdate)
    {
        //this.date = Bdate;
        this.BookingDate = parseDate(Bdate);
    }
    
    public Date getBookingdate()
    {
        return BookingDate;
    }
    
     public void setEnddate(String Edate)
    {
        //this.date = Bdate;
        this.BookingDate = parseDate(Edate);
    }
    
    public Date getEnddate()
    {
        return EndDate;
    }
    
    public void setDuration(int Duration)
    {
        this.Duration = Duration;
    }
    
    public int getDuration()
    {
        return Duration;
    }
    
    
    public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("dd-MM-yyyy").parse(date);
     } catch (ParseException e) {
         return null;
     }
  }
    
}