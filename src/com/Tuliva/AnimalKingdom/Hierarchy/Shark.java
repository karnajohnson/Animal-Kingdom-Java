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
public final class Shark extends Fish {
        private boolean _isPredatory;
        private double _size;
         protected static final String HierarchyName = "Shark";
        public enum SharkANATOMY
        {
            UNKNOWN,
            TEETH,
            SKELETON,
            JAW,
            FINS,
            DERMAL_DENTICLES,
            TAILS,
            GILLS
        }
        //Property for the private field _ispredatory
        public boolean getIsPredatory()
        {
            return this._isPredatory;
        }
        
        public void setIsPredatory(boolean pred){
            this._isPredatory = pred;
        }

        //Property for the private field _size
        public double getSize()
        {
            return this._size;
        }
        
        public void setSize(double size){
            this._size = size;
        }
        
        public Shark()
        {
            //initializing the Shark Fields
            _isPredatory = true;
            _size = 13.5;
            //printing to the screen that the Shark class has been initialized.
            Utilities.LogIt(Utilities.UtilName + "INSIDE THE SHARK CLASS:: the Shark class has been initialized.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }//end of Shark Constructor

        //default override eat method
        @Override public void Eat()
        {
            Utilities.LogIt("Sharks eat to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            super.Eat();
        }

        //Second Overriden Eat Method
        @Override public void Eat(String food)
        {
            Utilities.LogIt("Our shark is eating " + food + " to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            super.Eat(food);
        }

        //Third Overriden Eat Method
        @Override public void Eat(String food, String how)
        {
            Utilities.LogIt("Our shark is eating " + food +
                " with " + how + " to survive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
            super.Eat(food, how);
        }

        //KeepMovingToBreathe Method | simply printing out that the shark has to keep moving to breathe.
        public void KeepMovingToBreathe()
        {
            //printing a saying to the screen 
            Utilities.LogIt("The shark has to keep moving to breathe and stay alive.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }

        //AttackBoats Method | simply printing out that the shark is attacking a boat.
        public void AttackBoats()
        {
            //printing a saying to the screen 
            Utilities.LogIt("The shark is attacking the boat with its jaw.\n",
                    Utilities.MessageSeverity.INFORMATIONAL, true);
        }
        
        @Override
        public String toString(){
            return Shark.HierarchyName;
        }
}
