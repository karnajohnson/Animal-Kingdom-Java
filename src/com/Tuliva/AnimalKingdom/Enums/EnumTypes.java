/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Enums;

/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public class EnumTypes {
    
    public static enum GenderTYPE { 
        Female,
        Male,
        Both,
        NotSet      
    }
    public static enum AnimalTYPES{
        Unknown,
        Animal,
        Mammal,
        Primate,
        Human,
        Bird,
        Duck,
        Eagle,
        Fish,
        Trout,
        Shark
    }
    public static enum ConcreteAnimalTYPES {    
        BaseDUCK,
        BaseTROUT,
        BasePLATYPUS,
        BaseHUMAN
    }

        public enum DuckTYPE
        {
            UNKNOWN,
            DABBLING,
            DIVING,
            EIDER,
            GOLDENEYE,
            MERGANSER,
            PERCHING,
            SCOTER,
            SEA,
            STIFFTAIL,
            TEAL,
            WHISTLING,
            DOMESTIC
        }

        public enum BirdANATOMY
        {
            UNKNOWN,
            SKELETAL,
            EXCRETORY,
            RESPIRATORY,
            CIRCULATORY,
            NERVOUS_SYSTEM,
            DEFENCE_COMBAT,
            INTRASPECIFIC_COMBAT,
            CHROMOSOMES,
            FEATHERS,
            PLUMAGE,
            SCALES,
            FLIGHT
        }

        public enum EagleGROUPS
        {
            UNKNOWN,
            FISH,
            BOOTED,
            SNAKE,
            HARPY
        }

        public enum FishWaterTYPE
        {
            FRESH_WATER,
            SEA_WATER
        }
        public enum MammalTYPE
        {
            MONOTREME,
            MARSUPIAL,
            PLACENTAL
        }

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

        public enum TroutHabitatLOCATION
        {
            UNKNOWN,
            NORTH_AMERICA,
            NORTHERN_ASIA,
            EUROPE,
            AUSTRALIA,
            NEW_ZEALAND
        }
}
