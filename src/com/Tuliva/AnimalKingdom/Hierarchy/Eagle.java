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
public final class Eagle extends Bird {
    //private fields
    private boolean _hasTalons;
    private boolean _isPredatory;
    private boolean _hasTelescopicVision;
    protected static final String HierarchyName = "Eagle";
    public enum EagleGROUPS
        {
            UNKNOWN,
            FISH,
            BOOTED,
            SNAKE,
            HARPY
        }
    //get property for _hasTalons
    public boolean getHasTalons()
    {
        //returning _hasTalons
        return this._hasTalons;
    }
    
    //set property for _hasTalons
    public void setColor(boolean talons)
    {
        //setting _hasTalons to the value talons 
        this._hasTalons = talons;
    }
    
    //get property for _isPredatory
    public boolean getIsPredatory()
    {
        //returning _isPredatory
        return this._isPredatory;
    }
    
    //set property for _isPredatory
    public void setIsPredatory(boolean pred)
    {
        //setting _isPredatory to the value pred
        this._isPredatory = pred;
    }
    
    //get property for _hasTelescopicVision
    public boolean getHasTelescopicVision()
    {
        //returning _hasTelescopicVision
        return this._hasTelescopicVision;
    }
    
    //set property for _hasTelescopicVision
    public void setHasTelescopicVision(boolean tele)
    {
        //setting _hasTelescopicVision to the value tele
        this._hasTelescopicVision = tele;
    }
    //constructor
    public Eagle()
    {
        //initializing the private fields
        _hasTalons = true;
        _isPredatory = true;
        _hasTelescopicVision = true;
        
        //printing to the screen that the Eagle class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE EAGLE CLASS:: " +
                "Eagle class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //default Eat method | simply printing out that the eagle is eating.
    @Override public void Eat()
    {
        Utilities.LogIt("The eagle is eating.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat();
    }
    
    //1st overloaded Eat method | simply printing out 
    //that the eagle is eating what the user inputed for the food
    @Override public void Eat(String food)
    {
        Utilities.LogIt("The eagle is eating " + food + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        
        super.Eat(food);
    }
    
    //2nd overloaded Eat method | simply printing out
    //that the eagle is eating what the user inputed for the food
    //and how the eagle is eating the food.
    @Override public void Eat(String food, String how)
    {
        Utilities.LogIt("The eagle is eating " + food + ""
                + " and it's using " + how + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat(food, how);
    }
    
    //StunVictim Method | Simply printing out  
    //that the eagle is stunning its victim
    public void StunVictim(){
        Utilities.LogIt("The eagle is stunning its victim.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //Soar Method | Simply printing out  
    //that eagle is soaring through the sky
    public void Soar(){
        Utilities.LogIt("The eagle is soaring through the sky.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    @Override
    public String toString(){
        return Eagle.HierarchyName;
    }
}
