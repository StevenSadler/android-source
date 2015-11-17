package com.bloc.classes;

class Dog {
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;

	/************************************************
	 * ADD MEMBER VARIABLES HERE IF NECESSARY	
	/************************************************/
	String[] sizes = {"tiny", "small", "average", "large"};
	int mealsTowardNextUpSize = 0;
	int playsTowardNextDownSize = 0;


	/*
	 * getHairLength
	 *
	 * @return this Dog's hair length (float)
	 */
	public float getHairLength() {
		return mHairLength;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getHairLength method
	/************************************************/

	/*
	 * setHairLength
	 *
	 * Sets the length of the Dog's hair (float)
	 *
	 * @param hairLength the new length of the hair (float)
	 * @return nothing
	 */
	public void setHairLength(float hairLength) {
		mHairLength = hairLength;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setHairLength method
	/************************************************/

	/*
	 * getGender
	 *
	 * @return this Dog's gender (String)
	 */
	public String getGender() {
		return mGender;
	}
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getGender method
	/************************************************/

	/*
	 * setGender
	 *
	 * Sets this Dog's gender
	 *
	 * @param gender the new gender of the Dog (String)
	 * @return nothing
	 */
	public void setGender(String gender) {
		mGender = gender;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setGender method
	/************************************************/

	/*
	 * getSize
	 *
	 * @return the size of the dog (String)
	 */
	public String getSize() {
		return mSize;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getSize method
	/************************************************/

	/*
	 * setSize
	 *
	 * Sets the size of the Dog
	 *
	 * @param size the new size of the Dog (String)
	 * @return nothing
	 */
	public void setSize(String size) {
		mSize = size;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setSize method
	/************************************************/

	/*
	 * getAge
	 *
	 * @return this Dog's age (int)
	 */
	public int getAge() {
		return mAge;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getAge method
	/************************************************/

	/*
	 * setAge
	 *
	 * Sets the age of the Dog
	 *
	 * @param age the new age of the Dog (int)
	 * @return nothing
	 */
	public void setAge(int age) {
		mAge = age;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setAge method
	/************************************************/

	/*
	 * getWeight
	 *
	 * @return this Dog's weight (float)
	 */
	public float getWeight() {
		return mWeight;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getWeight method
	/************************************************/

	/*
	 * setWeight
	 *
	 * Sets the weight of the Dog
	 *
	 * @param weight the new weight of the Dog (float)
	 * @return nothing
	 */
	public void setWeight(float weight) {
		mWeight = weight;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setWeight method
	/************************************************/

	/*
	 * getColor
	 *
	 * @return this Dog's color (String)
	 */
	public String getColor() {
		return mColor;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the getColor method
	/************************************************/

	/*
	 * setColor
	 *
	 * Sets the color of the Dog
	 *
	 * @param color the new color of the Dog's coat (String)
	 * @return nothing
	 */
	public void setColor(String color) {
		mColor = color;
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the setColor method
	/************************************************/

	/*
	 * feed
	 *
	 * Feeds the Dog.
	 *
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if
	 *                 possible
	 *                 i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                 "average" (3 meals later ->) "large"
	 *				   the Dog cannot exceed the "large" size or shrink smaller than
	 *				   "tiny"
	 * @return nothing
	 */
	public void feed() {
		mWeight += WEIGHT_GAIN;
		if (mSize != "large") {
			mealsTowardNextUpSize++;
			if (mealsTowardNextUpSize == 3) {
				mealsTowardNextUpSize = 0;
				if (mSize == "tiny") {
					mSize = "small";
				} else if (mSize == "small") {
					mSize = "average";
				} else if (mSize == "average") {
					mSize = "large";
				}
			}
		}
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the feed method
	/************************************************/

	/*
	 * play
	 *
	 * Let the Dog play.
	 *
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller 
	 *		   		   size, if possible i.e. "large" (6 plays later->) "average" (6 plays later->) 
	 *		   		   "small" -> "tiny"
	 *		   		3. The Dog cannot shrink to a weight smaller than
	 *		  		   MIN_WEIGHT
	 * @return nothing
	 */
	public void play() {
		mWeight -= WEIGHT_LOSS;
		if (mWeight < MIN_WEIGHT) {
			mWeight = MIN_WEIGHT;
		}
		if (mSize != "tiny") {
			playsTowardNextDownSize++;
			if (playsTowardNextDownSize == 6) {
				playsTowardNextDownSize = 0;
				if (mSize == "small") {
					mSize = "tiny";
				} else if (mSize == "average") {
					mSize = "small";
				} else if (mSize == "large") {
					mSize = "average";
				}
			}
		}
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the play method
	/************************************************/

	/*
	 * cutHair
	 *
	 * Cut the Dog's hair.
	 *
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
	 * 				The Dog's hair cannot be shorter than 0f
	 *
	 * @return nothing
	 */
	public void cutHair() {
		mHairLength -= HAIR_CUT_LENGTH;
		if (mHairLength < 0f) {
			mHairLength = 0f;
		}
	}
	/************************************************
 	 *	ASSIGNMENT:
 	 *	Create the cutHair method
	/************************************************/

}
