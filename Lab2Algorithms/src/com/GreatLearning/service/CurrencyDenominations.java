package com.GreatLearning.service;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominations {

	public void minimumCurrencyNotes(int[] notes, int amount) {

		// This array will keep track of the number of time a particular denomination is
		// used
		int[] notesCounter = new int[notes.length];

		// We have sorted the array in reverse order using Merge-sort approach
		// Doing this the maxm value will be at the front of the notes array
		try {
			for (int i = 0; i < notes.length; i++) {
				notesCounter[i] = amount / notes[i];
				amount = amount - notesCounter[i] * notes[i];
			}

			if (amount > 0) {
				System.out.println("Given amount cannot be dispensed with this set of denominations");
			} else {
				System.out.println("Your payment will be processed using following denominations");
				for (int i = 0; i < notes.length; i++) {
					if (notesCounter[i] != 0) {
						System.out.println(notes[i] + ":" + notesCounter[i]);
					}

				}
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae + "Notes of denomination 0 is invalid");
		}

	}

}
