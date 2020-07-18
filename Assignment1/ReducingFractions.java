/*
 * IS 147
 * 
 * Unit #1 - Programming Assignment 
 * 
 * Zhengchao Yu 
 * 
 * 09/07/2015 
 * 
 * Program Assignment: 
 * Write a program that prompts the user to enter the numerator and denominator of a fraction. 
 * The program determines whether the number is a proper fraction or an improper fraction. 
 * If it is a proper fraction, display the number. 
 * If not, reduce it to a mixed fraction or to an integer. 
 */

import java.util.Scanner;

public class ReducingFractions {

	public static void main(String[] args) {

		// Declare global variables
		int numerator, denominator;

		Scanner input = new Scanner(System.in);

		// Numerator Input
		System.out.print("Enter a numerator: ");
		numerator = input.nextInt();

		// Denominator Input
		System.out.print("Enter a denominator: ");
		denominator = input.nextInt();

		// Calculate Proper Fractions
		if (Math.abs(numerator) < denominator) {
			// Display Proper Fraction
			System.out.print(numerator + "/" + denominator + " is a proper fraction. ");
		}

		else {

			// Calculate Improper Fraction
			if (numerator % denominator == 0) {

				// Displays the improper fraction as a reduced number
				System.out.print(numerator + "/" + denominator + " is a improper fraction and can be reduced to "
						+ (numerator / denominator) + " ");ß
			}

			else {

				// Mixed Fraction
				int wholeNumber = (numerator / denominator);

				int remainderNumber = numerator % (denominator);

				System.out.print(numerator + "/" + denominator + " is a improper fraction and its mixed fraction is "
						+ wholeNumber + " + " + remainderNumber + "/" + denominator + " ");
			}
		}
	}

}