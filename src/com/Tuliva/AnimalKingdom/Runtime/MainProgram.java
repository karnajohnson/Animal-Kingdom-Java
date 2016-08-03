/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Runtime;
import com.Tuliva.AnimalKingdom.Clients.*;
import com.Tuliva.AnimalKingdom.Exceptions.CustomExceptions;
import com.Tuliva.AnimalKingdom.Utilities.*;
import java.util.Scanner;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public class MainProgram {
    public static void main(String[] args) {
      //bool for continuing the program
            boolean pleaseContinue = true;
            //string reply for what the user inputs
            String reply = "";
            //a do-while loop for the menu
            do
            {
                //using a method to display the menu
                DisplayMenu();
                //getting input from the user using a method
                reply = Input(); 
                //a switch case for the menu
                switch (reply)
                {
                    //case 1 for the NoClient menu
                    case "1":
                        //clearing the screen with a method that was created
                        ClearScreen();
                        //calling the NoClient's main method for its menu 
                        NoClient.NoClientMain();
                        //breaking from the case
                        break;
                    //case 2 for the MenuClientMain
                    case "2":
                        //clearing the screen with a method that was created
                        ClearScreen();
                        //calling the MenuClient's main method for its menu
                        MenuClient.MenuMain();
                        //breaking from the case
                        break;
                    //case 3 for the FormClient
                    case "3":
                        //clearing the screen with a method that was created
                        ClearScreen();
                        new FormClient().setVisible(true);
                        continue;
                    //This case 4 is the exit
                    case "4":
                        //clearing the screen with a method that was created
                        ClearScreen();
                        //setting the bool to false to let the loop know to exit
                        pleaseContinue = false;
                        //logging that the user exited the menu.
                        Utilities.LogIt("End of program\n",
                            Utilities.MessageSeverity.INFORMATIONAL, true);
                        //breaking from the case
                        break;
                    //default case
                    default:
                        //clearing the screen with a method that was created
                        ClearScreen();
                        try{
                            throw new CustomExceptions("");
                        }
                        catch (CustomExceptions e){
                            Utilities.LogIt("You entered an invalid option in the Main menu!\nTry again!\n"
                                    + e.getMessage(), Utilities.MessageSeverity.ERROR, true);
                        }
                        //breaking from the case
                        break;
                }//end of switch case
            //end of while loop if pleaseContinue is false
            } while (pleaseContinue);
    }
    //Method for displaying the menu
        public static void DisplayMenu()
        {
            //printing out to the screen the menu
            Utilities.LogIt("Hi! Welcome to the Animal Kingdom!!\n" +
                "Choose from the following options for which menu you want to do.\n" +
                "1) NoClientMain\n" +
                "2) MenuMain\n" +
                "3) FormClient\n" +
                "4) Exit\n");
        }
        public static void ClearScreen(){
        Utilities.LogIt("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
        public static String Input(){
        Scanner in = new Scanner(System.in);
        String message = "";
        message = in.nextLine();
        return message;
    }
}
