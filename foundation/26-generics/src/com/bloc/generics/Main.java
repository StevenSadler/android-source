package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/
		Toy<ActionFigure> superman = new Toy(new ActionFigure() );
		Toy<Book> littleRedRidingHood = new Toy(new Book() );
		Toy<Spoon> winnieThePoohHoneyScooper = new Toy(new Spoon() );
		Toy<Thing> nerfGun = new Toy(new Thing("Shooter") );

		toyBox.addToy(superman);
		toyBox.addToy(littleRedRidingHood);
		toyBox.addToy(winnieThePoohHoneyScooper);
		toyBox.addToy(nerfGun);

		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
