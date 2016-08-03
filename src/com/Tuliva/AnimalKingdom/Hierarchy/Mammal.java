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
public class Mammal extends Animal {
    //private fields
    private boolean _isItWarmBlooded;
    private boolean _hasHairOrFur;
     protected static final String HierarchyName = "Mammal";
      public enum MammalTYPE
        {
            MONOTREME,
            MARSUPIAL,
            PLACENTAL
        }
    //get property for _isItWarmBlooded
    public boolean getIsItWarmBlooded()
    {
        //returning _isItWarmBlooed
        return this._isItWarmBlooded;
    }
    
    //set property for _isItWarmBlooded
    public void setIsItWarmBlooded(boolean warm)
    {
        //setting _isItWarmBlooded to the value warm
        this._isItWarmBlooded = warm;
    }
    
    //get property for _hasHairOrFur
    public boolean getHasHairOrFur()
    {
        //returning _hasHairOrFur
        return this._hasHairOrFur;
    }
    
    //set property for _hasHairOrFur
    public void setHasHairOrFur(boolean hair)
    {
        //setting _hasHairOrFur to the value hair
        this._hasHairOrFur = hair;
    }
    
    //constructor
    public Mammal()
    {
        //initializing the private fields
        _isItWarmBlooded = true;
        _hasHairOrFur = true;
        
        //printing to the screen that the Mammal class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE MAMMAL CLASS:: " +
                "Mammal class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //default Eat method | simply printing out that the mammal is eating.
    @Override public void Eat()
    {
        Utilities.LogIt("The mammal is eating.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        //super.Eat();
    }
    
    //1st overloaded Eat method | simply printing out 
    //that the mammal is eating what the user inputed for the food
    @Override public void Eat(String food)
    {
        Utilities.LogIt("The mammal is eating " + food + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        //super.Eat(food);
    }
    
    //2nd overloaded Eat method | simply printing out
    //that the mammal is eating what the user inputed for the food
    //and how the mammal is eating the food.
    @Override public void Eat(String food, String how)
    {
        Utilities.LogIt("The mammal is eating " + food + ""
                + " and it's using " + how + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        //super.Eat(food, how);
    }
    
    //GiveLiveBirth Method | Simply printing out  
    //that the mammal is giving live birth
    public void GiveLiveBirth(){
        Utilities.LogIt("The mammal is giving live birth.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void GiveLiveBirth(String mammal){
        Utilities.LogIt("The " + mammal + " is giving live birth.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    //Nurse Method | Simply printing out  
    //that the mammal is nursing
    public static void Nurse(){
        Utilities.LogIt("The mammal is nursing.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public static void Nurse(String mammal){
        Utilities.LogIt("The " + mammal + " is nursing.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
                
    }
    @Override
    public String toString(){
        return Mammal.HierarchyName;
    }
}

