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
    int Phone,id;
    
    
    public Hotel( String N,String A,int P,int I)
    {
        this.Name=N;
        this.Address=A;
        this.Phone=P; 
        this.id=I;
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
    public void setId(int I)
   {
    this.id=I;
   }
   public int getId()
   {
   return id;
   }


}
