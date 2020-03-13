package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//Creating stream to read the object  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\f.txt"));  
		  Student s=(Student)in.readObject();  
		  //printing the data of the serialized object  
		  System.out.println(s.id+" "+s.name);  
		  System.out.println(s.address);  
		  //closing the stream  
		  in.close();  
		

	}

}
