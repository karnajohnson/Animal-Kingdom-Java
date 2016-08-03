/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Collections;
import com.Tuliva.AnimalKingdom.Hierarchy.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public class ZooCollection {
    //creating an Animal Collection
        private List<Animal> myAnimal;
        
        //constructor
        public ZooCollection()
        {
            //instantiating the Animal Collection
            myAnimal = new ArrayList<Animal>();
        }

        //Add Method
        public void Add(Animal obj)
        {
            //Adding the Animal object into the 
            //collection
            myAnimal.add(obj);
        }

        //Sort Method
        //public void Sort()
        //{
            //Sorting the Animal Collection
            //Collections.sort(myAnimal);
       // }

        //Clear Method
        public void Clear()
        {
            //Clearing the collection
            myAnimal.clear();
        }

        //Remove Method
        public void Remove(Animal obj)
        {
            //Removing the Animal Object 
            //from the collection
            myAnimal.remove(obj);
        }

        //Each method demonstrating the foreach loop
        //for the collection
        public void Each()
        {
            //for all Animals in myAnimal
            for (Animal a : myAnimal)
            {
                //Animal Eats
                a.Eat();
                //Animal Reproduces
                a.Reproduce();
            }
        }

        //Count method
        public int Count()
        {
            //declaring a counting variable
            int counting = 0;
            //assigning counting to myAnimal.Count
            counting = myAnimal.size();
            //returning the counting variable
            return counting;
        }

        //Cast method to demonstrate casting
        public void Cast()
        {
            //casting Human into myAnimal and having it work
            ((Human)(myAnimal.get(0))).Work();
            //casting Duck into myAnimal and having it swim
            ((Duck)(myAnimal.get(1))).Swim();
            //casting Trout into myAnimal and having it swim
            ((Trout)(myAnimal.get(2))).Swim();
        }
}
