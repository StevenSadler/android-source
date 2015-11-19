package com.bloc.interfaces.people;

import com.bloc.interfaces.people.hobbies.*;

/************************************************
 *	ASSIGNMENT:
 *	Have Albert implement the SalsaDancer interface
/************************************************/

public class Albert extends Person implements SalsaDancer {
	public Albert() {
		super("Albert", "Cobb", "Male", 1.8d, 72d, "Green");
	}

	public void putOnShoes() {}
	public void findAPartner() {}
	public void salsa() {}
}