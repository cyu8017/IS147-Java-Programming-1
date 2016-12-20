/*
 * IS 147
 * 
 * Unit #2 - Programming Assignment 
 * 
 * Zhengchao Yu 
 * 
 * 10/31/2015 
 * 
 * Program Description
 * 
 * Extend Unit #1 programming assignment to write a program that prompts 
 * the user to enter the arithmetic operation option and numerators and denominators 
 * of two fractions. 
 * 
 * This program computes fraction artithmetic and determines whether the result is 
 * a proper fraction or an improper fraction. 
 * 
 * If it is an improper fraction, this program will display the number in the lowest term. 
 * If not, this program will reduce it to the lowest term and displays a mixed fraction or to an integer. 
 * 
 */
import java.util.Scanner;

public class ReduceFractionArithmetic {
    
    /**
     * This method adds two different fractions and displays the result as a reduced fraction to
     * lower term.
     * 
     * (i.e (numerator1 / denominator1) + (numerator2 / denominator2)
     * 
     * @param numerator1 the numerator of the 1st fraction
     * @param denominator1 the denominator of the 1st fraction
     * @param numerator2 the numerator of the 2nd fraction
     * @param denominator2 the denominator of the 2nd fraction
     */	
    public static void addition(int numerator1, int denominator1, int numerator2, int denominator2) {

	int gcd = findGCD(denominator1, denominator2);
	double num1 = (double)gcd/denominator1 * numerator1;
	double num2 = (double)gcd/denominator2 * numerator2;
	int numerator = (int)(num1 + num2);
	reduce(numerator, gcd);
	
    }

    /**
     * This method subtracts two different fractions and displays the result as a reduced fraction to lower term.
     * 
     * (i.e (numerator1 / denominator1) - (numerator2 / denominator2)
     * 
     * @param numerator1 the numerator of the 1st fraction
     * @param denominator1 the denominator of the 1st fraction
     * @param numerator2 the numerator of the 2nd fraction
     * @param denominator2 the denominator of the 2nd fraction
     */
    public static void subtraction(int numerator1, int denominator1, int numerator2, int denominator2) {
	
	double number1 = (double)denominator2 * numerator1;
		double number2 = (double)denominator1 * numerator2;
		int numerator = (int)(number1 - number2);
		reduce(numerator, (denominator1 * denominator2));
		
    }
    
    /**
     * This method multiplies two different fractions and displays the result as a reduced fraction to lower term.
     * 
     * (i.e (numerator1 / denominator1) * (numerator2 / denominator2)
     * 
     * @param numerator1 the numerator of the 1st fraction
     * @param denominator1 the denominator of the 1st fraction
     * @param numerator2 the numerator of the 2nd fraction
     * @param denominator2 the denominator of the 2nd fraction
     */
    public static void multiplication(int numerator1, int denominator1, int numerator2, int denominator2) {
	    
	int number1 = numerator1 * numerator2;
	int number2 = denominator1 * denominator2;
	reduce(number1, number2);
    }
    
    /**
     * This method divides two different fractions and displays the result as a reduced fraction to lower term
     * 
     * (i.e (numerator1 / denominator1) * (numerator2 / denominator2)
     * 
     * @param numerator1 the numerator of the 1st fraction
     * @param denominator1 the denominator of the 1st fraction
     * @param numerator2 the numerator of the 2nd fraction
     * @param denominator2 the denominator of the 2nd fraction
     */
    public static void division(int numerator1, int denominator1, int numerator2, int denominator2) {
	
	int number1 = numerator1 * denominator2;
	int number2 = numerator2 * denominator1;
	reduce(number1, number2);
    }
    
    /**
     * This method determines whether the number is a proper fraction or an improper fraction. 
     * If it is a proper fraction, display the number. If not, reduce it to a mixed fraction 
     * or to an integer.
     * 
     * @param numerator a numerator for the fraction
     * @param denominator a denominator for the fraction
     */
    public static void reduce(int numerator, int denominator) { 
	
	if (numerator % denominator == 0) {
	    
	    // Displays the improper fraction as a reduced number
	    System.out.println(numerator + "/" + denominator + 
			       " is a improper fraction and can be reduced to " 
			       + (numerator/denominator)); 
	} 
	
	else if (Math.abs(numerator) < Math.abs(denominator)) {
	    
	    // Display Proper Fraction
	    int highestFactor = 1;
	    for(int i =2; i <= numerator;i++) {
		
		if(numerator % i == 0 && denominator % i == 0)
		    highestFactor = i;
	    }
	    
	    System.out.println((numerator/highestFactor) + 
			       "/" + (denominator/highestFactor) + 
			       " is a proper fraction. "); 
	} 
	
	// Calculate Improper Fraction & Mixed Fraction
	
	else {
	    
	    int wholeValue = (numerator / denominator);
	    numerator = numerator - denominator * wholeValue;
	    int highestFactor = 1;
	    
	    for(int i =2; i <= numerator;i++) {
		
		if(numerator % i ==0 && denominator % i ==0)
		    
		    highestFactor = i;
	    }
	    
	    System.out.println(numerator/highestFactor + "/" + denominator/highestFactor + 
			       " is a improper fraction and its mixed fraction is " 
			       + wholeValue + " + "  + (numerator/highestFactor) 
			       + "/" + (denominator/highestFactor) + " ");
	}						
    }
    
    /**
     * Find the greatest common divisor of a and b
     * 
     * @param a an integer number
     * @param b an integer number
     * 
     * @return the greatest common divisor
     */
    public static int findGCD(int a, int b) {
	
	return a * b;
    }
    
    public static void main(String[] args) { 
	
	Scanner scan = new Scanner(System.in);
	
	// Print greeting and prompt the user to select a choice. 
	System.out.println("Select an arithmetic operation with reduced fraction as following.");
	System.out.print("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and -1 to exit:");
	int choice = scan.nextInt();
	
	while(choice != -1) {
	    
	    // First fraction numerator input 
	    System.out.print("Enter a numerator for the first fraction: "); 
	    int numerator1 = scan.nextInt();
	    
	    // First fraction denominator input
	    System.out.print("Enter a denominator for the first fraction: "); 
	    int denominator1 = scan.nextInt(); 
	    
	    // Second fraction numerator input
	    System.out.print("Enter a numerator for the second fraction: ");
	    int numerator2 = scan.nextInt();
	    
	    // Second fraction denominator input
	    System.out.print("Enter a denominator for the second fraction: "); 
	    int denominator2 = scan.nextInt();
	    
	    // Choice #1 - Addition operation  
	    if(choice == 1) {
		System.out.print("User selected addition operation and results is "  );
		addition(numerator1, denominator1, numerator2, denominator2); 
	    } 
	    
	    // Choice #2 - Subtraction operation 
	    else if (choice == 2) {
		System.out.print("User selected subtraction operation and results is " );
		subtraction(numerator1, denominator1, numerator2, denominator2);
	    } 
	    
	    // Choice #3 - Multiplication operation 
	    else if (choice == 3) {
		System.out.print("User selected multiplication operation and result is " ); 
		multiplication(numerator1, denominator1, numerator2, denominator2); 
		
	    } 
			
	    // Choice #4 - Division operation
	    else if (choice == 4) {
		System.out.print("User selected division operation and result is "  );
		division(numerator1, denominator1, numerator2, denominator2);
	    }
	    
	    System.out.println();
	    
	    System.out.println("Select an arithmetic operation with reduced fraction as following.");
	    System.out.print("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and -1 to exit:");
	    choice = scan.nextInt();
	}
	
	// If user enters -1, program will print good bye and quit
	System.out.print("Good Bye!!!");
    }
}
