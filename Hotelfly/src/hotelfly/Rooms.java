/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelfly;

/**
 *
 * @author 1895212
 */
public class Rooms {
    public int Number, Capacity;
    String Type;
    Double Price;
    int id;
    
    public Rooms(int id, int N, int C, String T, Double P)
    {
        this.id = id;
        this.Number = N;
        this.Capacity = C;
        this.Type = T;
        this.Price = P;
        
    }
    
    public void setId(int I)
    {
        this.id=I;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setNumber(int N)
    {
        this.Number=N;
    }
    
    public int getNumber()
    {
        return Number;
    }
    
    public void setCapacity(int C)
    {
        this.Capacity = C;
    }
    
    public int getCapacity()
    {
        return Capacity;
    }
    
    public void setType(String T)
    {
        this.Type = T;
    }
    
    public String getType()
    {
       return Type;
    }
    
    public void setPrice(double P)
    {
        this.Price = P;
    }
    
    public double getPrice()
    {
          return Price;
    }
    
    public void display()
    {
        System.out.println("No of rooms: "+Number+"\nCapacity: "+Capacity+"\nType: "+ Type+"\nPrice: "+Price+"$");
    }
}