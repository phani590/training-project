package com.training.exception.handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//3
public class FileExample {

	
		public static void main(String[] args) throws IOException {
			File file = new File(args[0]);
			
			if(!file.exists()){
				new BadFileNameException();
			}
			
			FileInputStream fileReader = new FileInputStream(file);
			int i =0;
			while((i=fileReader.read()) != -1){
				System.out.print((char)i);
			}
		}
	

}
