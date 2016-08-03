/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Hierarchy;
import com.Tuliva.AnimalKingdom.Enums.*;
import com.Tuliva.AnimalKingdom.Utilities.*;

/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public final class ComposedPlatypus {
    private Duck _duck;
    private Trout _trout;
    
    public Duck getDuck(){
        return this._duck;
    }
    
    public void setDuck(Duck duck){
        this._duck = duck;
    }
    
    public Trout getTrout(){
        return this._trout;
    }
    
    public void setTrout(Trout trout){
        this._trout = trout;
    }
    
    public ComposedPlatypus(){
        _duck = new Duck();
        _trout = new Trout();
        //printing to the screen that the Platypus class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE PLATYPUS CLASS:: " +
                "Platypus class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        _duck.Swim("platypus", "duck");
        _trout.Swim("playtpus", "fish");
        _duck.LayEggs("platypus", "bird");
        
    }
    
    public void Nurse(){
        Utilities.LogIt("The platypus is nursing using its sticky milk.\n", 
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
}
