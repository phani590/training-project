package com.training.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
	 
         File file = new File("D:\\");  
//         if (file.createNewFile()) {  
//             System.out.println("New File is created!");  
//         } else {  
//             System.out.println("File already exists.");  
//         }  
         System.out.println(file.isDirectory());
         File[] listFiles = file.listFiles();
         for(File fil:listFiles){
        	 System.out.println(fil.getName());
         }
      
	}
}
