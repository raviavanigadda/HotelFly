/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

/**
 *
 * @author temp
 */
public class Single extends Customer
{
    String address;
    int id;
    
    Customer c;
    
    public Single (String add,int id)
    {
        this.address=add;
        this.id=id;
    }
    
    public void Setaddress(String add)
    {
        this.address=add;
    }
     public void Setid(int id)
    {
        this.id=id;
    }
    public String Getaddress()
    {
        return address;
    }
      public int Getid()
    {
        return id;
    }
      public void display()
      {
          System.out.println("address:" +address+"/nid: "+id);
      }   
    
}
