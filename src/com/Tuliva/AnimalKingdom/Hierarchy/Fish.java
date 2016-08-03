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
public abstract class Fish extends Animal {

        private boolean _canLayEggs;
        private boolean _hasScales;
         protected static final String HierarchyName = "Fish";
        public enum FishWaterTYPE
        {
            FRESH_WATER,
            SEA_WATER
        }
        //Property for the private field _canLayEggs
        public boolean getCanLayEggs()
        {
            return this._canLayEggs; 
        }
        
        public void setCanLayEggs(boolean eggs){
            this._canLayEggs = eggs;
        }
        //Property for the private field _hasScales
        public boolean getHasScales()
        {
            return this._hasScales;
        }
        public void setHasScales(boolean scales){
            this._hasScales = scales;
        }
        
        public Fish()
        {
            //initializing the Fish Fields
            _canLayEggs = true;
            _hasScales = true;

            //printing to the screen that the Fish class has been initialized.
            Utilities.LogIt(Utilities.UtilName + "INSIDE THE FISH CLASS:: The Fish class has been initialized.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }//end of Fish Constructor

        //default override eat method
        @Override public void Eat()
        {
            Utilities.LogIt("Fish eat to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            //super.Eat();
        }

        //Second Overriden Eat Method
       @Override public void Eat(String food)
        {
            Utilities.LogIt("Our fish is eating " + food + " to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            //super.Eat(food);
        }

        //Third Overriden Eat Method
        @Override public void Eat(String food, String how)
        {
            Utilities.LogIt("Our fish is eating " + food +
                " with " + how + " to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            //super.Eat(food, how);
        }
        //LayEggs Method | simply printing out that the fish is laying eggs.
        public void LayEggs()
        {
            //printing a saying to the screen 
            Utilities.LogIt("The fish is laying eggs.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        
        public void LayEggs(String fish)
        {
            //printing a saying to the screen 
            Utilities.LogIt("The " + fish + " is laying eggs.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        //Swim Method |
        public void Swim()
        {
            //printing a saying to the screen 
            Utilities.LogIt("The fish is swimming.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        public void Swim(String fish)
        {
            //printing a saying to the screen 
            Utilities.LogIt("The " + fish + " is swimming.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        public void Swim(String fish, String animal)
        {
            //printing a saying to the screen 
            Utilities.LogIt("The " + fish + " is swimming like a " + animal + ".\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        //GiveLiveBirth Method | 
        public void GiveLiveBirth()
        {
            //printing a saying to the screen 
            Utilities.LogIt("The fish is giving live birth.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        //GiveLiveBirth Method | 
        public void GiveLiveBirth(String fish)
        {
            //printing a saying to the screen 
            Utilities.LogIt("The " + fish + " is giving live birth.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        @Override
        public String toString(){
            return Fish.HierarchyName;
        }
}
