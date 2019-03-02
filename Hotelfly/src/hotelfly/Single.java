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
 
    
    public Single (String add,int id)
    {
        super("Mr Parry","Micheal","parrym92@gmail.com",43852000,161);
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
          System.out.println("Address:" +address+"\nSingle Room id: "+id);
      }   
    
      public static String displayforTest(String address, int Id)
      {
      String add= address;
      int id = Id; 
      return add+" "+id;
      }
}