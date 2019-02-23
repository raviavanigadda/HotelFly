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
    int id;
    
   public Customer(String fName, String lName, String email, int ph, int id)
   {
       this.firstName = fName;
       this.lastName = lName;
       this.email = email;
       this.phoneNo = ph;
       this.id = id;
      
              
   }
    public void setId(int i){
        id=i;
    }
    public void setFirstName(String fn){
       firstName=fn;
    }
    public void setLastName(String ln){
       lastName=ln;
    }
    public void setEmail(String en){
       email=en;
    }
    public void setPhoneNo(int pn){
       phoneNo=pn;
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
    public int getId(){
        return id;
    }
    public void displayCustomer(){
        System.out.println("First Name: "+firstName+"");
        System.out.println("Last Name: "+lastName);
        System.out.println("Email: "+email);
        System.out.println("Phone number: "+phoneNo);
        System.out.println("ID: "+id);
    }
}