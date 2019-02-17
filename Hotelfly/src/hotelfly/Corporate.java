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
public class Corporate extends Customer {
    
    String company_name;
    
     public Corporate (String cname)
    {
        this.company_name=cname;
    }
    
    public void Setcompany_name(String cname)
    {
        this.company_name=cname;
    }
    public String Getcompany_name()
    {
        return company_name;
    }
    
    
}
