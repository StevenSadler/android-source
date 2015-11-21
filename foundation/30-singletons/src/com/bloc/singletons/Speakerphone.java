package com.bloc.singletons;

import java.util.*;

/************************************************
 *	ASSIGNMENT:
 *	Populate this class with the defined methods.
 *
 *	This is a singleton class which maintains communication
 *	between Talker and Listener interface objects.
/************************************************/

public class Speakerphone extends Object {

	private static HashSet<Listener> sListeners;

	private static Speakerphone sSpeakerphone;
	/*
	 * get
	 *
	 * @return the singleton instance of Speakerphone (Speakerphone)
	 */
	public static Speakerphone get() {
		if (sSpeakerphone == null) {
			sSpeakerphone = new Speakerphone();
			sListeners = new HashSet<Listener>();
		}
		return sSpeakerphone;
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the get method
	/************************************************/

	/*
	 * addListener
	 *
	 * Add a listener to Speakerphone's list
	 *
	 * @param listener an instance of the Listener interface (Listener)
	 * @return nothing
	 */
	public void addListener(Listener listener) {
		sListeners.add(listener);
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the addListener method
	/************************************************/

	/*
	 * removeListener
	 *
	 * Remove a Listener from the Speakerphone's list
	 *
	 * @param listener the Listener to remove (Listener)
	 * @return nothing
	 */
	public void removeListener(Listener listener) {
		sListeners.remove(listener);
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeListener method
	/************************************************/

	/*
	 * removeAll
	 *
	 * Removes all Listeners from Speakerphone
	 *
	 * @return nothing
	 */
	public void removeAll() {
		sListeners.clear();
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeAll method
	/************************************************/

	/*
	 * contains
	 *
	 * Checks whether a Listener is found in the Speakerphone's
	 * collection.
	 *
	 * @param listener
	 * @return `true` if the Listener has already been added to
	 *		   the Speakerphone, `false` otherwise (boolean)
	 */
	public boolean contains(Listener listener) {
		return sListeners.contains(listener);
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the contains method
	/************************************************/	

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @return nothing
	 */
	public void shoutMessage(Talker talker) {
		Iterator<Listener> itr = sListeners.iterator();
		while (itr.hasNext()) {
			Listener listener = itr.next();
			listener.onMessageReceived(talker.getMessage());
		}
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners which are instances of
	 * the cls parameter
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message (Class)
	 * @return nothing
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	public void shoutMessage(Talker talker, Class cls) {
		Iterator<Listener> itr = sListeners.iterator();
		while (itr.hasNext()) {
			Listener listener = itr.next();
			if (cls.isAssignableFrom(listener.getClass())) {
				listener.onMessageReceived(talker.getMessage());
			}
		}
	}
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/

}