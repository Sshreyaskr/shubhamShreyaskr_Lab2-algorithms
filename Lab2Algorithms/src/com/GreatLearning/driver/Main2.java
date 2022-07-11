package com.GreatLearning.driver;

import java.util.Scanner;

import com.GreatLearning.service.PayMoneyTransaction;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] transactionArray;
		int size;

		PayMoneyTransaction pmt = new PayMoneyTransaction();

		System.out.println("Enter the size of the transaction array");
		size = sc.nextInt();

		transactionArray = new int[size];

		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			transactionArray[i] = sc.nextInt();
		}

		pmt.targetValidation(transactionArray);

	}

}
