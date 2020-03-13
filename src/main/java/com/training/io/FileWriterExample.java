package com.training.io;

import java.io.FileWriter;

public class FileWriterExample {
	 public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout1.txt");    
           fw.write("Phani cccccccccccc.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }   
}
