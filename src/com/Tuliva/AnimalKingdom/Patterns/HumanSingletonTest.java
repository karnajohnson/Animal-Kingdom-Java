/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Patterns;
import com.Tuliva.AnimalKingdom.Base.BaseHuman;
import com.Tuliva.AnimalKingdom.Patterns.HumanSingleton;
import com.Tuliva.AnimalKingdom.Utilities.Utilities;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public class HumanSingletonTest {
    private HumanSingletonTest(){
    }
    public static void TestHuman(){
        //fields
        BaseHuman HumanFirstReference = HumanSingleton.getInstance();
        BaseHuman HumanSecondReference = HumanSingleton.getInstance();
        
        Utilities.LogIt("Human Singleton Test :: First Human Reference: \n" + 
                "Name: " + HumanFirstReference.getName() + "\n"+
                "Age: " + HumanFirstReference.getAge() + "\n"+
                "Gender: " + HumanFirstReference.getGender()+ "\n"+
                "Animal Type: " + HumanFirstReference.getConcreteAnimalType()+ "\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        
        Utilities.LogIt("Human Singleton Test :: Second Human Reference: \n" + 
                "Name: " + HumanFirstReference.getName() + "\n"+
                "Age: " + HumanFirstReference.getAge() + "\n"+
                "Gender: " + HumanFirstReference.getGender()+ "\n"+
                "Animal Type: " + HumanFirstReference.getConcreteAnimalType() + "\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        
        //set the first human reference to a different name
        HumanFirstReference.setName("Adele");
        
        Utilities.LogIt("Human Singleton Test :: First Human Reference: \n" + 
                "Name: " + HumanFirstReference.getName() + "\n"+
                "Age: " + HumanFirstReference.getAge() + "\n"+
                "Gender: " + HumanFirstReference.getGender()+ "\n"+
                "Animal Type: " + HumanFirstReference.getConcreteAnimalType()+ "\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        
        Utilities.LogIt("Human Singleton Test :: Second Human Reference: \n" + 
                "Name: " + HumanFirstReference.getName() + "\n"+
                "Age: " + HumanFirstReference.getAge() + "\n"+
                "Gender: " + HumanFirstReference.getGender()+ "\n"+
                "Animal Type: " + HumanFirstReference.getConcreteAnimalType() + "\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        Utilities.LogIt("End of Singleton Test\n");
    }
}
