package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class InsertionSort {

	public void insertionSort(String[] wordArray) {

		int sizeOfArray = wordArray.length;

		for (int index = 1; index < sizeOfArray; ++index) {
			String current = wordArray[index];
			int previousIndex = index - 1;

			while (previousIndex >= 0 && wordArray[previousIndex].compareTo(current) > 0) {
				wordArray[previousIndex + 1] = wordArray[previousIndex];
				previousIndex = previousIndex - 1;
			}
			wordArray[previousIndex + 1] = current;
		}
		System.out.println("The sorted array is : ");
		printArray(wordArray);
	}

	public void printArray(String[] wordArray) {
		int sizeOfArray = wordArray.length;
		for (int index = 0; index < sizeOfArray; index++) {
			System.out.print(wordArray[index] + " ");
		}
	}

	public static void main(String[] args) {

		InsertionSort sortObject = new InsertionSort();
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
		sortObject.insertionSort(wordArray);

	}

}
