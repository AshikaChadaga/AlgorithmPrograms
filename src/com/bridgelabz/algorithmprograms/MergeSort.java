package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class MergeSort {

	void merge(String wordArray[], int left, int middle, int right) {

		int sizeOfLeft = middle - left + 1;
		int sizeOfRight = right - middle;

		String leftArray[] = new String[sizeOfLeft];
		String rightArray[] = new String[sizeOfRight];

		for (int leftArrayIndex = 0; leftArrayIndex < sizeOfLeft; ++leftArrayIndex)
			leftArray[leftArrayIndex] = wordArray[left + leftArrayIndex];

		for (int rightArrayIndex = 0; rightArrayIndex < sizeOfRight; ++rightArrayIndex)
			rightArray[rightArrayIndex] = wordArray[middle + 1 + rightArrayIndex];

		int index1 = 0, index2 = 0;
		int sortedArrayindex = left;

		while (index1 < sizeOfLeft && index2 < sizeOfRight) {
			if (leftArray[index1].compareTo(rightArray[index2]) <= 0) {
				wordArray[sortedArrayindex] = leftArray[index1];
				index1++;
			} else {
				wordArray[sortedArrayindex] = rightArray[index2];
				index2++;
			}
			sortedArrayindex++;
		}

		while (index1 < sizeOfLeft) {
			wordArray[sortedArrayindex] = leftArray[index1];
			index1++;
			sortedArrayindex++;
		}

		while (index2 < sizeOfRight) {
			wordArray[sortedArrayindex] = rightArray[index2];
			index2++;
			sortedArrayindex++;
		}
	}

	void mergeSort(String wordArray[], int left, int right) {
		if (left < right) {

			int middle = left + (right - left) / 2;
			mergeSort(wordArray, left, middle);
			mergeSort(wordArray, middle + 1, right);
			merge(wordArray, left, middle, right);
		}

	}

	public void printArray(String[] wordArray) {
		int sizeOfArray = wordArray.length;
		for (int index = 0; index < sizeOfArray; index++) {
			System.out.print(wordArray[index] + " ");
		}
	}

	public static void main(String[] args) {

		MergeSort sortObject = new MergeSort();
		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter the number of words: ");
		int sizeOfArray = scannerObject.nextInt();
		String[] wordArray = new String[sizeOfArray];

		System.out.println("Enter words");
		for (int index = 0; index < sizeOfArray; index++) {
			String word = scannerObject.next();
			wordArray[index] = word;
		}
		scannerObject.close();

		System.out.println("The array of words are : ");
		sortObject.printArray(wordArray);
		System.out.println("");
		sortObject.mergeSort(wordArray, 0, sizeOfArray - 1);

		System.out.println("The sorted array is : ");
		sortObject.printArray(wordArray);

	}
}
