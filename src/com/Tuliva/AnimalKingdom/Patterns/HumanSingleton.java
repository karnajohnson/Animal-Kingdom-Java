/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Patterns;

import com.Tuliva.AnimalKingdom.Base.BaseHuman;
import com.Tuliva.AnimalKingdom.Enums.EnumTypes;
import com.Tuliva.AnimalKingdom.Interfaces.IIdentity;
import com.Tuliva.AnimalKingdom.Utilities.Utilities;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public class HumanSingleton {
     private static BaseHuman HumanInstance = null;
     
     private HumanSingleton(){
         HumanInstance = new HumanBuilder().Name("Karna").Age((short)26).Gender(EnumTypes.GenderTYPE.Female).Build();
         Utilities.LogIt( 
                "Singleton Test :: "
                + "AnimalType is " + HumanInstance.getConcreteAnimalType().toString()
                + ". It's name is " + HumanInstance.getName()
                + ". The age is " + HumanInstance.getAge()
                + ". The gender is " + HumanInstance.getGender()
                + " ...",Utilities.MessageSeverity.INFORMATIONAL,true);
     }
     public static BaseHuman getInstance() {
        // As a Recommendation, might want to perform Security Checks before ...
        //... returning the Singleton Instance.
        
        // Conditional Test to ensure there will always be only 1 shared copy.
        if(HumanInstance == null) {
            HumanInstance = 
                    new HumanBuilder().Name("Anna").Age((short)24).
                            Gender(EnumTypes.GenderTYPE.Female).Build();
        } 
        
        return HumanInstance;
    }
}
