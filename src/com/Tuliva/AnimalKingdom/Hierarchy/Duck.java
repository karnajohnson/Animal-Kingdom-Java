/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Hierarchy;
import com.Tuliva.AnimalKingdom.Utilities.*;
import com.Tuliva.AnimalKingdom.Enums.*;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public final class Duck extends Bird {
    //private fields
    private String _color;
    private String _type;
    protected static final String HierarchyName = "Duck";
     
    //get property for _color
    public String getColor()
    {
        //returning _color
        return this._color;
    }
    
    //set property for _color
    public void setColor(String color)
    {
        //setting _color to the value 
        this._color = color;
    }
    
    //get property for _type
    public String getType()
    {
        //returning _type
        return this._type;
    }
    
    //set property for _type
    public void setType(String type)
    {
        //setting _type to the value type
        this._type = type;
    }
    
    //constructor
    public Duck()
    {
        //initializing the private fields
        _type = "Mallard";
        _color = "green";
        
        //printing to the screen that the Duck class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE DUCK CLASS:: " +
                "Duck class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //default Eat method | simply printing out that the duck is eating.
    @Override public void Eat()
    {
        Utilities.LogIt("The duck is eating.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat();
    }
    
    //1st overloaded Eat method | simply printing out 
    //that the duck is eating what the user inputed for the food
    @Override public void Eat(String food)
    {
        Utilities.LogIt("The duck is eating " + food + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat(food);
    }
    
    //2nd overloaded Eat method | simply printing out
    //that the duck is eating what the user inputed for the food
    //and how the duck is eating the food.
    @Override public void Eat(String food, String how)
    {
        Utilities.LogIt("The duck is eating " + food + ""
                + " and it's using " + how + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat(food, how);
    }
    
    //Swim Method | Simply printing out  
    //that the duck is swimming
    public void Swim(){
        Utilities.LogIt("The duck is swimming.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
     public void Swim(String duck){
        Utilities.LogIt("The " + duck + " is swimming.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
     public void Swim(String duck, String animal)
        {
            //printing a saying to the screen 
            Utilities.LogIt("The " + duck + " is swimming like a " + animal + ".\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
    
    //GetBeakSlappedOff Method | Simply printing out  
    //that Daffy Duck is getting his beak slapped off
    public void GetBeakSlappedOff(){
        Utilities.LogIt("Daffy Duck is getting his beak slapped off.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    @Override
    public String toString(){
        return Duck.HierarchyName;
    }
}
