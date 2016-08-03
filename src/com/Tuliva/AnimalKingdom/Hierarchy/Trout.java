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
public final class Trout extends Fish {
        private String _type;
        private String _diet;
        private FishWaterTYPE fishWaterType = FishWaterTYPE.FRESH_WATER;
        protected static final String HierarchyName = "Trout";
        //Property for the private field _type
        public String getType()
        {
            return this._type;
        }
        
        public void setType(String type){
            this._type = type;
        }

        //Property for the private field _diet
        public String getDiet()
        {
            return this._diet;
        }
        
        public void setDiet(String diet)
        {
            this._diet = diet;
        }
        
        //default constructor
        public Trout()
        {
            //initializing the Trout Fields
            _type = "Rainbow Trout";
            _diet = "Small Fish";
            //printing to the screen that the Trout class has been initialized.
            Utilities.LogIt(Utilities.UtilName + "INSIDE THE TROUT CLASS:: The Trout class has been initialized.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }//end of Trout Constructor
        
        //default override eat method
        @Override public void Eat()
        {
            Utilities.LogIt("Trouts eat to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            super.Eat();
        }

        //Second Overriden Eat Method
        @Override public void Eat(String food)
        {
            Utilities.LogIt("Our trout is eating " + food + " to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            super.Eat(food);
        }

        //Third Overriden Eat Method
        @Override public void Eat(String food, String how)
        {
            Utilities.LogIt("Our trout is eating " + food +
                " with " + how + " to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            super.Eat(food, how);
        }
        
        //AvoidAnglers Method | simply printing out that the trout is avoid anglers.
        public void AvoidAnglers()
        {
            //printing a saying to the screen 
            Utilities.LogIt("The trout is avoiding anglers.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }

        //StealBait Method | simply printing out that the trout is stealing bait.
        public static void StealBait()
        {
            //printing a saying to the screen 
            Utilities.LogIt("The trout is stealing bait.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        
        @Override
        public String toString(){
            return Trout.HierarchyName;
        }
}
