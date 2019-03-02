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
public class Category {
String name ,description,type;
int id;

public Category ( String N,String D,String T,int I)
{       this.name=N;
        this.description=D;
        this.type=T;
        this.id=I;
}

public void setName(String N)
    {
    this.name=N;
    }
public String getName()
   {
    return name;
   }
public void setDescription(String D)
   {
    this.description=D;
   }
public String getDescription()
   {
   return description;
   }

public void setType(String T)
    {
    this.type=T;
    }
public String getType()
    {
       return type; 
    }
public void setId(int I)
{
    this.id=I;
}
public int getId()
{
return id;
}

public void display()
{ 
    System.out.println("Delux rooms :"+name+"\nDescription: "+description+"\nRoom type: "+type+"\nId: "+id);
}

}
