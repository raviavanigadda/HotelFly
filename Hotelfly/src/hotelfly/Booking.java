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
        //this.date = Bdate;
        this.BookingDate = parseDate(Bdate);
    }
    
    public Date getBookingdate()
    {
        return BookingDate;
    }
    
     /*
     public void setEnddate(String Edate)
    {
        //this.date = Bdate;
        this.BookingDate = parseDate(Edate);
    }
    
    public Date getEnddate()
    {
        return EndDate;
    }*/
    
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
    
     public static String custid(String d,String fname,String lname)
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
       
        id=year+"-"+month+"-"+today+"-"+fn+ln;
        
        return id;
    }
     
    public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("dd-MM-yyyy").parse(date);
     } catch (ParseException e) {
         return null;
     }
  }
    
}