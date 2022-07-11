package com.GreatLearning.service;

public class MergeSortImplementation {

	public void merge(int[] arr, int left, int mid, int right) {

		int len1 = mid - left + 1;
		int len2 = right - mid;

		int[] leftArr = new int[len1];
		int[] rightArr = new int[len2];

		for (int i = 0; i < len1; i++) {
			leftArr[i] = arr[left + i];
		}

		for (int j = 0; j < len2; j++) {
			rightArr[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k;
		k = left;

		//Descending order sort
		while (i < len1 && j < len2) {
			if (leftArr[i] >= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		/**
		 * To insert the remaining elements of both the sub-array in case one of the
		 * sub-arrays completely runs out of pointers while comparing, then we just
		 * append the element of the greater sub-array
		 */

		while (i < len1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < len2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

	}

	// Merge sort is a recursive algorithm
	public void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	public void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
