/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Hierarchy;
import com.Tuliva.AnimalKingdom.Utilities.*;
import com.Tuliva.AnimalKingdom.Enums.*;
/*
 * Version 0.1.9
 * @author Karna Johnson
 */
public abstract class Primate extends Mammal{
    //private fields
    private boolean _hasOpposableThumbs;
    private boolean _hasLargeBrain;
    protected static final String HierarchyName = "Primate";
    public enum BrainSIZE
        {
            UNKNOWN,
            VERY_SMALL,
            SMALL,
            MEDIUM,
            LARGE,
            HUMAN_LARGE,
            STEPHEN_HAWKING_LARGE
        }
    public enum PrimateLOCOMOTION
        {
            UNKNOWN,
            BRACHIATION,
            BIPEDLISM,
            LEAPING,
            QUADREPEDALISM,
            CLIMBING,
            KNUCKLE_WALKING,
            SWINGING
        }
    //get property for _hasOpposableThumbs
    public boolean getHasOpposableThumbs()
    {
        //returning _hasOpposableThumbs
        return this._hasOpposableThumbs;
    }
    
    //set property for _hasOpposableThumbs
    public void setHasOpposableThumbs(boolean thumb)
    {
        //setting _hasOpposableThumbs to the value thumb
        this._hasOpposableThumbs = thumb;
    }
    
    //get property for _hasLargeBrain
    public boolean getHasLargeBrain()
    {
        //returning _hasLargeBrain
        return this._hasLargeBrain;
    }
    
    //set property for _hasLargeBrain
    public void setHasLargeBrain(boolean brain)
    {
        //setting _hasLargeBrain to the value brain
        this._hasLargeBrain = brain;
    }
    
    //constructor
    public Primate()
    {
        //initializing the private fields
        _hasOpposableThumbs = true;
        _hasLargeBrain = true;
        
        //printing to the screen that the Primate class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE PRIMATE CLASS:: " +
                "Primate class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //default Eat method | simply printing out that the primate is eating.
    @Override public void Eat()
    {
        Utilities.LogIt("The primate is eating.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat();
    }
    
    //1st overloaded Eat method | simply printing out 
    //that the primate is eating what the user inputed for the food
    @Override public void Eat(String food)
    {
        Utilities.LogIt("The primate is eating " + food + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat(food);
    }
    
    //2nd overloaded Eat method | simply printing out
    //that the primate is eating what the user inputed for the food
    //and how the primate is eating the food.
    @Override public void Eat(String food, String how)
    {
        Utilities.LogIt("The primate is eating " + food + ""
                + " and it's using " + how + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat(food, how);
    }
    
    //UseLargeBrain Method | Simply printing out  
    //that the primate is using its large brain
    public void UseLargeBrain(){
        Utilities.LogIt("The primate is using its large brain.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    //overloaded UseLargeBrain method that takes a String 
    public void UseLargeBrain(String primate){
        Utilities.LogIt("The " + primate + " is using its large brain.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    //SwingFromTrees Method | Simply printing out  
    //that the primate is swinging from trees
    public void SwingFromTrees(){
        Utilities.LogIt("The primate is swinging from tree to tree.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    public void SwingFromTrees(String primate){
        Utilities.LogIt("The " + primate + " is swinging from tree to tree.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    //FierclyProtectTerritory Method | Simply printing out  
    //that the primate is fiercly protecting its territory
    public static void FierclyProtectTerritory(){
        Utilities.LogIt("The primate is fiercly protecting its territory.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    @Override
    public String toString(){
        return Primate.HierarchyName;
    }
}
