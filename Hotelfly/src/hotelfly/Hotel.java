/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

/**
 *
 * @author 1894831
 */
public class Hotel {
    String Name;
    String Address;
    int Phone;
    
    public Hotel( String N,String A,int P)
    {
        this.Name=N;
        this.Address=A;
        this.Phone=P; 
        
    }    
    public void setName( String N)
    {
        this.Name=N;
    }
    public String getName ()
    {
    return Name;
    }
    public void setAddress(String A)
    {
    this.Address=A;
    }
    public String getAddress()
    {
      return Address;  
    }
    public void setPhone(int P)
    {
    this.Phone=P;
    }
    public int getPhone()        
    {
    return Phone;
    }
    

public void display()
{
    System.out.println("Customer name: "+Name+"\nAddress :"+Address+"\nPhone :"+Phone);
}

public static String displayforTest(String N,String A,int P)
{

  return N+" "+A+" "+P;


    }}

