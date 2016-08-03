/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Base;
import com.Tuliva.AnimalKingdom.Enums.EnumTypes;
import com.Tuliva.AnimalKingdom.Interfaces.*;
import com.Tuliva.AnimalKingdom.Utilities.*;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public final class BaseDuck implements IEat, IFly, IIdentity, IReproduce, ISwim{
    
    private String _name;
    private short _age;
    private EnumTypes.GenderTYPE _gender;
    private EnumTypes.ConcreteAnimalTYPES _type;
    
    public BaseDuck(){
        this._name = "Unknown";
        this._age = 0;
        this._gender = EnumTypes.GenderTYPE.NotSet;
        this._type = EnumTypes.ConcreteAnimalTYPES.BaseDUCK;
        //printing to the screen that the BaseDuck class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE BASEDUCK CLASS:: " +
                "BaseDuck class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    @Override
    public void Eat(){
        Utilities.LogIt("The BaseDuck named " + this._name.toString() +
                " is eating.\n", Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    @Override
    public void Eat(String food){
        Utilities.LogIt("The BaseDuck named " + this._name.toString() + 
                " is eating " + food + ".\n", 
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    @Override
    public void Eat(String food, String how){
        Utilities.LogIt("The BaseDuck named " + this._name.toString() + 
                " is eating " + food + " with " + how + ".\n", 
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    @Override
    public void Fly(){
        Utilities.LogIt("The BaseDuck named " + this._name.toString() +
                " is flying.\n", Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    @Override
    public void Fly(int howHigh){
        Utilities.LogIt("The BaseDuck named " + this._name.toString() + 
                " is flying " + howHigh + " feet high.\n", 
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
     @Override
    public String getName(){
        Utilities.LogIt("Getting the " + this._type.toString() + "'s" +
                "Name Property to " + this._name.toString() + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        return this._name;
    }
     @Override
    public void setName(String name){
        Utilities.LogIt("Setting the " + this._type.toString() + "'s" +
                "Name Property to " + this._name.toString() + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        this._name = name;
    }

     @Override
    public short getAge(){
        Utilities.LogIt("Getting the " + this._type.toString() + "'s" +
                "Age Property to " + this._age + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        return this._age;
    }
     @Override
    public void setAge(short age){
        Utilities.LogIt("Setting the " + this._type.toString() + "'s" +
                "Age Property to " + this._age + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        this._age = age;
    }
     @Override
    public EnumTypes.GenderTYPE getGender(){
        Utilities.LogIt("Getting the " + this._type.toString() + "'s" +
                "Gender Property to " + this._gender.toString() + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        return this._gender;
    }
     @Override
    public void setGender(EnumTypes.GenderTYPE gender){
        Utilities.LogIt("setting the " + this._type.toString() + "'s" +
                "Gender Property to " + this._gender.toString() + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        this._gender = gender;
    }
     @Override
    public EnumTypes.ConcreteAnimalTYPES getConcreteAnimalType(){
        Utilities.LogIt("Getting the " + this._type.toString() + "'s" +
                "Concrete Animal Type to " + this._type.toString() + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        return this._type;
    }
    public void Reproduce(){
        Utilities.LogIt("BaseDuck named " + this._name.toString()  + 
                " is reproducing. Give it some privacy!\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void Reproduce(int howManyBabies){
        Utilities.LogIt("BaseDuck named " + this._name.toString()  + 
                " is reproducing and had " + howManyBabies + 
                ". Give it some privacy!\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void Swim(){
        Utilities.LogIt("BaseDuck named " + this._name.toString()  + 
                " is swimming on the lake.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void Swim(short howDeep){
        Utilities.LogIt("BaseDuck named " + this._name.toString()  + 
                " is swimming on the lake, and it is " + howDeep + " feet deep.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
}
