package com.bloc.securitypackages;

import com.bloc.securitypackages.Color;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

public abstract class Fruit extends Object {
	// The name of the fruit
	private String mName;
	// Number of calories
	private int mCalories;
	// Color of the fruit
	private Color mColor;
	// Weight of the fruit, in pounds
	private double mWeight;

	protected Fruit() {
		this("Fruit");
		// Default fruit
	}

	protected Fruit(String name) {
		this(name, 0);
	}

	protected Fruit(String name, int calories) {
		this(name, calories, null);
	}

	protected Fruit(String name, int calories, Color color) {
		this(name, calories, color, 0d);
	}

	protected Fruit(String name, int calories, Color color, double weight) {
		this.mName = name;
		this.mCalories = calories;
		this.mColor = color;
		this.mWeight = weight;
	}

	protected String getName() {
		return mName;
	}

	protected void setName(String name) {
		mName = name;
	}

	protected int getCalories() {
		return mCalories;
	}

	protected void setCalories(int calories) {
		mCalories = calories;
	}

	protected Color getColor() {
		return mColor;
	}

	protected void setColor(Color color) {
		mColor = color;
	}

	protected double getWeight() {
		return mWeight;
	}

	protected void setWeight(double weight) {
		mWeight = weight;
	}
}