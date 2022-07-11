package com.GreatLearning.driver;

import com.GreatLearning.service.CurrencyDenominations;
import com.GreatLearning.service.MergeSortImplementation;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int[] denominationArray;
		int size;
		int amountToPay = 0;
		// TODO Auto-generated method stub
		MergeSortImplementation msi = new MergeSortImplementation();
		CurrencyDenominations cd = new CurrencyDenominations();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();

		denominationArray = new int[size];

		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			denominationArray[i] = sc.nextInt();
		}

		//To sort the given array in descending order first
		msi.mergeSort(denominationArray, 0, size - 1);

		System.out.println("Enter the amount you want to pay");
		amountToPay = sc.nextInt();

		cd.minimumCurrencyNotes(denominationArray, amountToPay);

	}

}
