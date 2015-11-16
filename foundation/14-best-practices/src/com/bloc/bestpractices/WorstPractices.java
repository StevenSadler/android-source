package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String [] args) {

		int magicNumber = WorstPractices.animals(false);
		magicNumber *= 5;
		if (magicNumber > 18) {
			while(magicNumber > 0) {
				magicNumber--;
			}
		}
	}

	/************************************************
	 *	animals
	 *	This method takes in a single parameter, seed.
	 *  Using a very elaborate and complex algorithm, 
	 *  it calculates a magic number.
	 *  seed: a seed which helps generate the magic number
	 *  returns: a magical number
	/************************************************/
	private static int animals(boolean seed) {

		/*
			Start off with one of these
		*/
		float sparklesFairy = .5f;
		int aInt;
		if (seed) {
			aInt = 34;
		}
		else {
			aInt = 21;
		}
		for (int brown = 0; brown < aInt; brown++) { 
			sparklesFairy *= aInt;
		} 
		return (int) sparklesFairy * aInt;
	}

	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
