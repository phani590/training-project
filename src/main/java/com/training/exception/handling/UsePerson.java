package com.training.exception.handling;

public class UsePerson {

	public UsePerson() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Person p = null;
		String name = null;
		// comment out next line to see exception!
		name = "Some Name";
		try {
			p = new Person(name,10);
		}
		catch(InvalidDataException e) {
			System.err.println(e.getMessage());
		} catch (BadAgeException e) {
			e.printStackTrace();
		}
		if (p != null)
			System.out.println("We got a Person created!");
	}

}
