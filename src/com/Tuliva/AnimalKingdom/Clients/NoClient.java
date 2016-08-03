/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Clients;

import com.Tuliva.AnimalKingdom.Exceptions.CustomExceptions;
import com.Tuliva.AnimalKingdom.Hierarchy.*;
import com.Tuliva.AnimalKingdom.Utilities.*;
import java.util.Scanner;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public class NoClient {
    public static void NoClientMain(){
        String reply = "";
        boolean pleaseContinue = true;
        do{
            DisplayMenu();
            reply = Input();
            ClearScreen();
            switch (reply){
                case "1":
                   Duck myDuck = new Duck();
                   myDuck.Eat();
                   myDuck.Eat("fish");
                   myDuck.Eat("fish", "mouth");
                   myDuck.GetBeakSlappedOff();
                   myDuck.Swim();
                   myDuck.Fly("duck");
                   myDuck.LayEggs("duck");
                   myDuck.Move("duck");
                   break;
                case "2":
                    Trout myTrout = new Trout();
                    myTrout.Eat();
                    myTrout.Eat("fish");
                    myTrout.Eat("fish", "mouth");
                    myTrout.AvoidAnglers();
                    myTrout.LayEggs("trout");
                    myTrout.GiveLiveBirth("trout");
                    myTrout.Move("trout");
                    break;
                case "3":
                    Human myHuman = new Human();
                    myHuman.Eat();
                    myHuman.Eat("chicken");
                    myHuman.Eat("chicken", "utensils");
                    myHuman.Play();
                    myHuman.Work();
                    myHuman.GiveLiveBirth("human");
                    myHuman.Move("human");
                    myHuman.SwingFromTrees("human");
                    myHuman.Reproduce("human");
                    break;
                case "4":
                    ComposedPlatypus myPlat = new ComposedPlatypus();
                    myPlat.Nurse();
                    break;
                case "5":
                    pleaseContinue = false;
                    break;
                default:
                    try{
                        throw new CustomExceptions("");
                    }
                    catch (CustomExceptions e){
                        Utilities.LogIt("You entered an invalid option in the NoClient menu!\nTry again!\n"
                                + e.getMessage(), Utilities.MessageSeverity.ERROR, true);
                    }
            }
            
        }while (pleaseContinue);
    }
    
    public static String Input(){
        Scanner in = new Scanner(System.in);
        String message = "";
        message = in.next();
        return message;
    }
    
    public static void DisplayMenu(){
        String message = "Hi! You are in the NoClient menu!\n" +
                "Please select from the following which animal you want to instantiate.\n" +
                "1) Duck\n" +
                "2) Trout\n" +
                "3) Human\n" +
                "4) Platypus\n" +
                "5) Exit\n";
        Utilities.LogIt(message);
    }
    
    public static void ClearScreen(){
        Utilities.LogIt("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
