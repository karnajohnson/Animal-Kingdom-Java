/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Interfaces;
import com.Tuliva.AnimalKingdom.Enums.EnumTypes.*;

/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public interface IIdentity {
    public String getName();
    public void setName(String name);
    
    public short getAge();
    public void setAge(short age);
    
    public GenderTYPE getGender();
    public void setGender(GenderTYPE gender);
    
    public ConcreteAnimalTYPES getConcreteAnimalType();
}
