package com.training.string;

public class StringEx {

	public static void main(String[] args) {
		String st1 ="phanindra";
		String st2 ="phanindra";
		String st3 =new String("phanindra");
				
		if(st1 == st2){
			System.out.println("st1 == st2");
		}
		if(st1 == st3){
			System.out.println("st1 == st3");
		}
		
		if(st1.equals(st3)){
			System.out.println("st1 equals st3");
		}
		
		/*System.out.println(st1.indexOf("p"));
		System.out.println(st1.lastIndexOf('n'));
		System.out.println(st1.substring(2, 5));
		System.out.println(st1.length());
		System.out.println(st1.replace('i', 'e'));
		System.out.println(st1.concat("  chennu"));
		System.out.println(st1.contains("niun"));
		System.out.println(st1.startsWith("p"));*/

	}

}
