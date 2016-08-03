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
public abstract class Bird extends Animal {
     //private fields
    private boolean _canFly;
    private boolean _isAquatic;
    
    //get property for _canFly
    public boolean getCanFly()
    {
        //returning _canFly
        return this._canFly;
    }
    
    //set property for _canFly
    public void setCanFly(boolean fly)
    {
        //setting _canFly to the value fly
        this._canFly = fly;
    }
    
    //get property for _isAquatic
    public boolean getIsAquatic()
    {
        //returning _isAquatic
        return this._isAquatic;
    }
    
    //set property for _isAquatic
    public void setIsAquatic(boolean aqua)
    {
        //setting _isAquatic to the value aqua
        this._isAquatic = aqua;
    }
    
    //constructor
    public Bird()
    {
        //initializing the private fields
        _canFly = true;
        _isAquatic = true;
        
        //printing to the screen that the Bird class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE BIRD CLASS:: " +
                "Bird class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //default Eat method | simply printing out that the bird is eating.
    @Override public void Eat()
    {
        Utilities.LogIt("The bird is eating.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        //super.Eat();
    }
    
    //1st overloaded Eat method | simply printing out 
    //that the bird is eating what the user inputed for the food
    @Override public void Eat(String food)
    {
        Utilities.LogIt("The bird is eating " + food + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        //super.Eat(food);
    }
    
    //2nd overloaded Eat method | simply printing out
    //that the bird is eating what the user inputed for the food
    //and how the bird is eating the food.
    @Override public void Eat(String food, String how)
    {
        Utilities.LogIt("The bird is eating " + food + ""
                + " and it's using " + how + ".\n",Utilities.MessageSeverity.INFORMATIONAL, true);
        //super.Eat(food, how);
    }
    
    //LayEggs Method | Simply printing out  
    //that the bird is laying eggs
    public void LayEggs(){
        Utilities.LogIt("The bird is laying eggs.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void LayEggs(String bird){
        Utilities.LogIt("The " + bird + " is laying eggs.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void LayEggs(String bird, String animal){
        Utilities.LogIt("The " + bird + " is laying eggs like a " + animal + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    //Fly Method | Simply printing out  
    //that the bird is flying
    public void Fly(){
        Utilities.LogIt("The bird is flying.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void Fly(String bird){
        Utilities.LogIt("The " + bird + " is flying.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
}
