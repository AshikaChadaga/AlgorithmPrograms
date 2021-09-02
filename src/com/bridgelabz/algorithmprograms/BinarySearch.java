package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {

	public int binarySearch(ArrayList<String> wordArray, int low, int high, String key) {
		if (high >= low) {
			int middle = low + (high - low) / 2;
			if (wordArray.get(middle).equals(key)) {
				return middle;
			}
			if (wordArray.get(middle).compareTo(key) > 0) {
				return binarySearch(wordArray, low, middle - 1, key);
			}
			return binarySearch(wordArray, middle + 1, high, key);
		}
		return -1;
	}

	public static void main(String[] args) {

		BinarySearch searchObject = new BinarySearch();
		Scanner scannerObject = new Scanner(System.in);
		ArrayList<String> wordArray = new ArrayList<String>();
		System.out.println("Enter the number of words: ");
		int sizeOfArray = scannerObject.nextInt();
		System.out.println("Enter words");
		for (int index = 0; index < sizeOfArray; index++) {
			String word = scannerObject.next();
			wordArray.add(word);
		}

		System.out.println("Enter the word to be searched");
		String wordToBeSearched = scannerObject.next();
		scannerObject.close();
		System.out.println("The array of words are : " + wordArray);
		int indexOfWord = searchObject.binarySearch(wordArray, 0, sizeOfArray - 1, wordToBeSearched);
		System.out.println("Word [" + wordToBeSearched + "] found at index: " + indexOfWord);

	}

}
