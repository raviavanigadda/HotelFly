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
    Customer c;
    
    public Single (String add)
    {
        this.address=add;
    }
    
    public void Setaddress(String add)
    {
        this.address=add;
    }
    public String Getaddress()
    {
        return address;
    }
    
}
