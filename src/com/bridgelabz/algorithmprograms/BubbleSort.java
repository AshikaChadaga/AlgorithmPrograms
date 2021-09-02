package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BubbleSort {

	public void BubbleSorting(Integer[] numberArray) {

		int sizeOfArray = numberArray.length;

		for (int index = 0; index < sizeOfArray - 1; index++) {
			for (int index2 = 0; index2 < sizeOfArray - index - 1; index2++) {
				if (numberArray[index2].compareTo(numberArray[index2 + 1]) > 0) {
					Integer temporary = numberArray[index2];
					numberArray[index2] = numberArray[index2 + 1];
					numberArray[index2 + 1] = temporary;
				}
			}
		}
		System.out.println("The sorted array is : ");
		printArray(numberArray);
	}

	public void printArray(Integer[] wordArray) {
		int sizeOfArray = wordArray.length;
		for (int index = 0; index < sizeOfArray; index++) {
			System.out.print(wordArray[index] + " ");
		}
	}

	public static void main(String[] args) {

		BubbleSort sortObject = new BubbleSort();
		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter the number of numbers: ");
		int sizeOfArray = scannerObject.nextInt();
		Integer[] numberArray = new Integer[sizeOfArray];

		System.out.println("Enter numbers");
		for (int index = 0; index < sizeOfArray; index++) {
			Integer number = scannerObject.nextInt();
			numberArray[index] = number;
		}
		scannerObject.close();

		System.out.println("The array of numbers are : ");
		sortObject.printArray(numberArray);
		System.out.println("");
		sortObject.BubbleSorting(numberArray);

	}

}
