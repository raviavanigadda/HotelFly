/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

/**
 *
 * @author 1895126
 */
public class Customer {
    String firstName,lastName,email;
    int phoneNo;
    
    public Customer(String fname,String lname,String e_mail,int pno){
        firstName=fname;
        lastName=lname;
        email=e_mail;
        phoneNo=pno;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public int phoneNo(){
        return phoneNo;
    }
}
