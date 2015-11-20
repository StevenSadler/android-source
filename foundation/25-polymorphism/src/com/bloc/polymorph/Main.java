package com.bloc.polymorph;

import java.util.HashMap;
import com.bloc.polymorph.pets.*;

public class Main extends Object {

	public static void main(String [] args) {
		
		HashMap<String, Pet> pets = new HashMap<String, Pet>();
		pets.put("dog", new Dog());
		pets.put("cat", new Cat());
		pets.put("bird", new Bird());
		pets.put("snake", new Snake());
		pets.put("tarantula", new Tarantula());

		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Replace the operations below by employing polymorphism
		/************************************************/

		for (Pet pet : pets.values()) {
			pet.feed();
			pet.wash();
			pet.exercise();
		}

		/************************************************
	 	 *	ASSIGNMENT:
	 	 *	Replace the operations above by employing polymorphism
		/************************************************/

		for (String name : pets.keySet()) {
			Pet pet = pets.get(name);
			assert pet.isFed() && pet.isWashed() && pet.isExercised() : "Your " + name + " needs a little more attention";
		}

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*  If you see this,    */");
		System.out.println("/*  it only means that  */");
		System.out.println("/*  the program ran     */");
		System.out.println("/*  successfully. It    */");
		System.out.println("/*  may require         */");
		System.out.println("/*  additional work.    */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
