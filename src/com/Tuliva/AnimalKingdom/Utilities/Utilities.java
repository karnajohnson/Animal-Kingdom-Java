/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Tuliva.AnimalKingdom.Utilities;
import java.io.*;
import java.nio.file.*;
import java.util.Date;           
import java.text.SimpleDateFormat;
/**
 * Version 0.1.9
 * @author Karna Johnson
 */
public final class Utilities {
    public static String UtilName = "Using the Utilities class's methods :: ";  
    public static boolean DoFileLogging = true;
    
    public enum MessageSeverity
        {
            UNKNOWN,
            INFORMATIONAL,
            WARNING,
            ERROR,
            SEVERE,
            FATAL,
            EXCEPTION,
            THERMONUCLEAR
        }
    
     public static boolean doExtraDebugoutput = false;
     
     private Utilities()throws InstantiationException {
            throw new InstantiationException("YOU CANNOT INSTANTIATE THIS CLASS");
        }
     public static boolean LogIt(String msgToLog) throws IllegalArgumentException {
         boolean rv = false;
         if (msgToLog == null)
             throw new IllegalArgumentException("The message can't be null!!");
         
         try{
             System.out.println(msgToLog);
             rv = true;
         }
         catch(Exception e){
             System.err.println(Utilities.UtilName + 
                     " :: Exception Occurred! Exception MESSAGE = " + e.getMessage());
             rv = false;
         }
         return rv;
     }
     
     public static boolean LogIt(String msgToLog, MessageSeverity severity, boolean logFileYesNo){
         
         if (msgToLog == null)
            throw new IllegalArgumentException("The message can't be null!!");
         
          SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	  String aDate = sdf.format(new Date());  
          
          System.out.println(msgToLog);
          
          String LogFile = "C:\\Users\\student\\Documents\\Week9\\AnimalKingdom\\JavaLogFile.txt"; 
          
          boolean rv = false;
          
          if (!logFileYesNo)
          {
              LogIt(aDate + " -- " + severity.toString() + " -- " + msgToLog);
              rv = true;
          }
          else{
              Path logPath = Paths.get(LogFile);
              if (Files.notExists(logPath)){
                  try{
                    Files.createDirectories(logPath.getParent());
                    Files.createFile(logPath);
                  }
                  catch(IOException e){
                      String error = "EXCEPTION IN THE UTILITIES CLASS::LogIt() create file:" + e.getMessage();
                      System.err.println(error);
                      LogIt(error, MessageSeverity.EXCEPTION, false);
                  }
              }
             
                if(Files.exists(logPath)){ 
                PrintWriter toFile=null;
                try{
                    
                    FileWriter fw= new FileWriter(logPath.toString(),true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    toFile = new PrintWriter(bw);
                    
                    toFile.println(aDate + " -- " + severity.toString() + " -- " + msgToLog);
                    toFile.close();                  
                }
                catch (Exception e){              
                 String errorMessage= "EXCEPTION IN UTILITIES::LogIt(): "+ e.getMessage();
                    System.err.println(errorMessage);
                    LogIt(errorMessage,MessageSeverity.EXCEPTION,false);
                }   
               finally{
                    if(toFile != null)
                        toFile.close();
                } 
           }  
        }
        return rv;
     }
}
