package com.bloc.objects;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Song
	 *
	 * Default Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	Song() {
		Artist davidGilmour = new Artist("David", "Gilmour");
		Artist rogerWaters = new Artist("Roger", "Waters");
		Artist richardWright = new Artist("Richard", "Wright");
		Artist nickMason = new Artist("Nick", "Mason");
		Artist[] pinkFloydArtists = { davidGilmour, rogerWaters, richardWright, nickMason };
		Ensemble pinkFloyd = new Ensemble("Pink Floyd", pinkFloydArtists);
		
		mEnsemble = pinkFloyd;
		mTitle = "Echoes";
		mYearReleased = 1971;
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Song constructor
	/************************************************/

	/*
	 * Song
	 *
	 * Side-effects: Sets the year of release to 0
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 */
	Song(Ensemble ensemble, String title) {
		this(ensemble, title, 0);
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Song constructor
	/************************************************/

	/*
	 * Song
	 *
	 * @param ensemble the ensemble responsible (Ensemble)
	 * @param title the song title (String)
	 * @param yearReleased the year the song was released (int)
	 */
	Song(Ensemble ensemble, String title, int yearReleased) {
		mEnsemble = ensemble;
		mTitle = title;
		mYearReleased = yearReleased;
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the third Song constructor
	/************************************************/
}