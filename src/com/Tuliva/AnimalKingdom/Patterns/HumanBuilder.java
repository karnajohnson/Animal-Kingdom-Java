/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Patterns;
import com.Tuliva.AnimalKingdom.Base.BaseHuman;
import com.Tuliva.AnimalKingdom.Enums.EnumTypes;

/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public final class HumanBuilder {
    
    private BaseHuman aHuman = BaseHuman.getHumanInstance();
    
    public HumanBuilder Name(String name){
        aHuman.setName(name);
        return this;
    }
    
    public HumanBuilder Age(short age){
        aHuman.setAge(age);
        return this;
    }
    
    public HumanBuilder Gender (EnumTypes.GenderTYPE gender){
        aHuman.setGender(gender);
        return this;
    }
    
    public BaseHuman Build(){
        return aHuman;
    }
}
