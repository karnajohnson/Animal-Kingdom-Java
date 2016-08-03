/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Clients;
import com.Tuliva.AnimalKingdom.Patterns.HumanBuilder;
import com.Tuliva.AnimalKingdom.Utilities.*;
import com.Tuliva.AnimalKingdom.Base.*;
import com.Tuliva.AnimalKingdom.Enums.EnumTypes;
import com.Tuliva.AnimalKingdom.Utilities.*;
import com.Tuliva.AnimalKingdom.Collections.ZooCollection;
import com.Tuliva.AnimalKingdom.Hierarchy.*;
import java.util.Scanner;
import com.Tuliva.AnimalKingdom.Exceptions.CustomExceptions;
import com.Tuliva.AnimalKingdom.Patterns.HumanSingletonTest;


/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public class MenuClient {
    public static void MenuMain(){
        
        //fields
        String reply = "";
        boolean pleaseContinue = true;
        //do while loop for the menu
        do{
            //DisplayMenu Method call
            DisplayMenu();
            //Getting input from the user
            reply = Input();
            //clearing the screen
            ClearScreen();
            //switch case based on reply
            switch (reply){
                //case 1 - BaseDuck
                case "1":
                    //clearing the screen
                   ClearScreen();
                   //Creating a new BaseDuck
                   BaseDuck myDuck = new BaseDuck();
                   //BaseDuck interface methods
                   myDuck.setName("Daffy");
                   myDuck.setAge((short)4);
                   myDuck.setGender(EnumTypes.GenderTYPE.Male);
                   myDuck.Eat();
                   myDuck.Eat("fish");
                   myDuck.Eat("fish", "mouth");
                   myDuck.Reproduce();
                   myDuck.Swim();
                   myDuck.Fly();
                   myDuck.Fly(300);
                   myDuck.Reproduce();
                   myDuck.Reproduce(5);
                   myDuck = null;
                   break;
                //case 2 - BaseTrout
                case "2":
                    //clearing the screen
                    ClearScreen();
                     //create a new base Trout
                     BaseTrout aTrout = new BaseTrout();
                     //using the interfaces
                     aTrout.setName("Phil");
                     aTrout.setAge((short)2);
                     aTrout.setGender(EnumTypes.GenderTYPE.Male);
                     aTrout.Eat();
                     aTrout.Eat("fish");
                     aTrout.Eat("fish", "mouth");
                     aTrout.Reproduce();
                     aTrout.Reproduce(15);
                     aTrout.Swim();
                     aTrout = null;
                    break;
                //case 3 - BaseHuman
                case "3":
                     //clearing the screen
                    ClearScreen();
                    
                    //Calling the Singleton method
                    //to demonstrate the singleton human
                    HumanSingletonTest.TestHuman();
                    //creating a new human using the HumanBuilder
                    BaseHuman ourHuman = new HumanBuilder().Name("Karna").
                            Age((short) 26).Gender(EnumTypes.GenderTYPE.Female).Build();

                    Utilities.LogIt( 
                        "HumanBuilderTest :: "
                        + "AnimalType is " + ourHuman.getConcreteAnimalType().toString()
                        + ". It's name is " + ourHuman.getName()
                        + ". The age is " + ourHuman.getAge()
                        + ". The gender is " + ourHuman.getGender()
                        + " ...",Utilities.MessageSeverity.INFORMATIONAL,true);
                    
                    Utilities.LogIt("Regular Human Methods:\n");
                    ourHuman.Eat();
                    ourHuman.Eat("mashed potatoes");
                    ourHuman.Eat("mashed potatoes", "utensils");
                    ourHuman.Reproduce();
                    ourHuman.Fly();
                    ourHuman.Fly(35000);
                    ourHuman.Swim();
                    ourHuman.Swim((short)10);
                    ourHuman = null;
                    break;
                //case 4 - zoo
                case "4":
                    //clearing the screen
                    ClearScreen();
                    //creating a new zoo collection object
                    ZooCollection myZoo = new ZooCollection();

                    //adding objects into the collection
                    myZoo.Add(new Human());
                    myZoo.Add(new Duck());
                    myZoo.Add(new Trout());

                    //using a Each method in the ZooCollection class
                    //that has a for ( : ) method to go through the items 
                    //and print out the different methods
                    myZoo.Each();

                    //method demonstrating the casting
                    myZoo.Cast();

                    //LogIt method saying that the user created a zoo.
                    Utilities.LogIt("MenuClient::The user created a zoo.\n",
                             Utilities.MessageSeverity.INFORMATIONAL, true);
                    break;
                case "5":
                    //clearing the screen
                    ClearScreen();
                    //Quit the program
                    pleaseContinue = false;
                    break;
                default:
                    //clearing the screen
                    ClearScreen();
                    //trying and catching a custom exception
                    try{
                        throw new CustomExceptions("");
                    }
                    catch (CustomExceptions e){
                        Utilities.LogIt("You entered an invalid option in the MenuClient menu!\nTry again!\n"
                                + e.getMessage(), Utilities.MessageSeverity.ERROR, true);
                    }
            }
            
        }while (pleaseContinue);
        
    }
    //Input method
    public static String Input(){
        Scanner in = new Scanner(System.in);
        String message = "";
        message = in.next();
        return message;
    }
    
    //DisplyMenu method
    public static void DisplayMenu(){
        String message = "Hi! You are in the MenuClient menu!\n" +
                "Please select from the following which animal you want to instantiate.\n" +
                "1) BaseDuck\n" +
                "2) BaseTrout\n" +
                "3) BaseHuman\n" +
                "4) Zoo\n"+
                "5) Exit\n";
        Utilities.LogIt(message);
    }
    
    //Clearing the screen
    public static void ClearScreen(){
        Utilities.LogIt("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
}
