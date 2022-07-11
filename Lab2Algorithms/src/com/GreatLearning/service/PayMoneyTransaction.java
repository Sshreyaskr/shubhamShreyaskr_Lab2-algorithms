package com.GreatLearning.service;

import java.util.Scanner;

public class PayMoneyTransaction {
	int targetNum;
	int targetValue;

	public void targetValidation(int[] transactionArray) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of targets");
		targetNum = sc.nextInt();

		while (targetNum-- != 0) {

			System.out.println("Enter the value of target");
			targetValue = sc.nextInt();

			int sum = 0;
			int flag = 0;

			for (int i = 0; i < transactionArray.length; i++) {
				sum += transactionArray[i];

				if (sum >= targetValue) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}

	}

}
