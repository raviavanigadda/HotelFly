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

public Category ( String N,String D,String T)
{       this.name=N;
        this.description=D;
        this.type=T;
}

public void setName(String N)
    {
    this.name=N;
    }
public String getName()
   {
    return(name);
   }
public void setDescription(String D)
   {
    this.description=D;
   }
public String getDescription()
   {
   return(description);
   }

public void setType(String T)
    {
    this.type=T;
    }
public String getType()
    {
       return(type); 
    }
}