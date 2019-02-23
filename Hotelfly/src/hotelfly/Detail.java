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
public class Detail {
    
    int numberOfPersons;
    int id;
    
    public Detail (int n,int id)
    {
        this.numberOfPersons=n;
        this.id=id;
    } 
    
   public void setId(int i){
       id=i;
   }
   
    public void setNumberOfPerson(int n){
        numberOfPersons=n;
    }
    
    public int getNumberOfPerson(){
        return numberOfPersons;
    }
    
    public int getId(){
        return id;
    }
    
    public void displayDetails(){
        System.out.println("No of Persons: "+ numberOfPersons);
        System.out.println("Detail ID: "+id);
    }
}
