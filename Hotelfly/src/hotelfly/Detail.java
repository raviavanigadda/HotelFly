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
        System.out.println(numberOfPersons+"");
        System.out.println(id+"");
    }
}
