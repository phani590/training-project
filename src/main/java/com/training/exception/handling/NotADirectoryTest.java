package com.training.exception.handling;

import java.io.File;
import java.io.IOException;

public class NotADirectoryTest {

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		if(!file.isDirectory()){
			new NotADirectoryException();
		}
		
	}

}
