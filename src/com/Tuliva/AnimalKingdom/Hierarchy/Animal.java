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
public abstract class Animal {
    //private fields
    private String _name;
    private int _age;
    private GenderTYPE _animalGender;
    protected static final String HierarchyName = "Animal";
    
    //enum Gender Type
    public enum GenderTYPE
        {
            UNKNOWN,
            MALE,
            FEMALE,
            HERMAPHRODITE
        }
    
    public GenderTYPE getGenderType(){
        return this._animalGender;
    }
    
    public void setGenderTYPE(GenderTYPE gender){
        this._animalGender = gender;
    }
    //get property for _name       
    public String getName()
    {
        //returning _name
        return this._name;
    }
    
    //set property for _name
    public void setName(String name)
    {
        //setting _name to the value name
        this._name = name;
    }
    
    //get property for _age
    public int getAge()
    {
        //returning _age
        return this._age;
    }
    
    //set property for _age
    public void setAge(int age)
    {
        //setting _age to the value age
        this._age = age;
    }
    
    //constructor
    public Animal()
    {
        //initializing the private fields
        _name = "Unknown";
        _age = 0;
        _animalGender = GenderTYPE.UNKNOWN;
        //printing to the screen that the Animal class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE ANIMAL CLASS:: " +
                "Animal class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    //1st Overloaded constructor
    public Animal(String nameIn, int ageIn)
    {
        //initializing the private fields
        _name = nameIn;
        _age = ageIn;
        
        //printing to the screen that the Animal class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE ANIMAL CLASS:: " +
                "Animal overloaded constructor has been initialized.\n" + this.toString() +
                this._name + this._age,
                Utilities.MessageSeverity.INFORMATIONAL, true );
    }
   
    
    //default Eat method | simply printing out that the animal is eating.
    public abstract void Eat();
    //{
        //Utilities.LogIt("The animal is eating.\n");
    //}
    
    //1st overloaded Eat method | simply printing out 
    //that the animal is eating what the user inputed for the food
    public abstract void Eat(String food);
    //{
        //Utilities.LogIt("The animal is eating " + food + ".\n");
   // }
    
    //2nd overloaded Eat method | simply printing out
    //that the animal is eating what the user inputed for the food
    //and how the animal is eating the food.
    public abstract void Eat(String food, String how);
    //{
        //Utilities.LogIt("The animal is eating " + food + ""
               // + " and it's using " + how + ".\n");
    //}
    
    //Reproduce Method | Simply printing out  
    //that the animal is reproducing
    public void Reproduce(){
        Utilities.LogIt("The animal is reproducing.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void Reproduce(String animal){
        Utilities.LogIt("The " + animal + " is reproducing.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
     //Move Method | Simply printing out  
    //that the animal is moving
    public void Move(){
        Utilities.LogIt("The animal is moving.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    public void Move(String animal){
        Utilities.LogIt("The " + animal + " is moving.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    @Override
    public String toString()
    {
        return Animal.HierarchyName;
    }
}
