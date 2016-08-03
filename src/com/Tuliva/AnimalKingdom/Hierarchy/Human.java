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
public final class Human extends Primate {
    //private fields
    private String _jobTitle;
    private int _salary;
    private boolean _hasJob;
    
    private HumanGenderTYPE _humanGenderType;
    protected static final String HierarchyName = "Human";
    public enum HumanGenderTYPE
        {
            MALE,
            FEMALE
        }
    
    public HumanGenderTYPE getHumanGenderType(){
        return this._humanGenderType;
    }
    public void setHumanGenderType(HumanGenderTYPE gender){
        this._humanGenderType = gender;
    }
    //get property for _jobTitle
    public String getJobTitle()
    {
        //returning _jobTitle
        return this._jobTitle;
    }
    
    //set property for _jobTitle
    public void setJobTitle(String job)
    {
        //setting _jobTitle to the value job
        this._jobTitle = job;
    }
    
    //get property for _salary
    public int getSalary()
    {
        //returning _salary
        return this._salary;
    }
    
    //set property for _salary
    public void setSalary(int sal)
    {
        //setting _salary to the value sal
        this._salary = sal;
    }
    
    //get property for _hasJob
    public boolean getHasJob()
    {
        //returning _hasJob
        return this._hasJob;
    }
    
    //set property for _hasJob
    public void setHasJob(boolean job)
    {
        //setting _hasJob to the value job
        this._hasJob = job;
    }
    //constructor
    public Human()
    {
        //initializing the private fields
        _jobTitle = "Programmer";
        _salary = 65000;
        _hasJob = true;
        
        //printing to the screen that the Human class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE HUMAN CLASS:: " +
                "Human class has been initialized.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    //1st overloaded constructor
    public Human(String jobTitleIn, int salaryIn)
    {
        //initializing the private fields
        _jobTitle = jobTitleIn;
        _salary = salaryIn;
        _hasJob = true;
        
        //printing to the screen that the Human class has been initialized
        Utilities.LogIt(Utilities.UtilName + "INSIDE THE HUMAN CLASS:: " +
                "1st overloaded constructor in the Human class has been initialized.\n"+
                this._jobTitle + this._salary,
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //default Eat method | simply printing out that the human is eating.
    @Override public void Eat()
    {
        Utilities.LogIt("The human is eating.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat();
    }
    
    //1st overloaded Eat method | simply printing out 
    //that the human is eating what the user inputed for the food
    @Override public void Eat(String food)
    {
        Utilities.LogIt("The human is eating " + food + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat(food);
    }
    
    //2nd overloaded Eat method | simply printing out
    //that the human is eating what the user inputed for the food
    //and how the human is eating the food.
    @Override public void Eat(String food, String how)
    {
        Utilities.LogIt("The human is eating " + food + ""
                + " and it's using " + how + ".\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
        super.Eat(food, how);
    }
    
    //Work Method | Simply printing out  
    //that the human is working
    public void Work(){
        Utilities.LogIt("The human is working.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    //Play Method | Simply printing out  
    //that the human is playing
    public void Play(){
        Utilities.LogIt("The human is playing.\n",
                Utilities.MessageSeverity.INFORMATIONAL, true);
    }
    
    @Override
    public String toString(){
        return Human.HierarchyName;
    }
}
