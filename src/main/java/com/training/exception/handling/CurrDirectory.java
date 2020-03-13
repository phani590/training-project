package com.training.exception.handling;

import java.nio.file.Paths;

public class CurrDirectory {

	
	public static void main(String[] args) {
		if(args.length == 0){
		String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);
		}

	}

}
