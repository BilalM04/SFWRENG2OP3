/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 4 (20 marks)
 * 
 * Write a Java program to print the area and perimeter of a circle.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: radius input by a user.
 * OUTPUT: the area and the perimeter of the circle defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint: you may use java.util.Scanner to take user input real valued radius.
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class Q4_AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius:");
		double r = sc.nextDouble();

		double area = Math.PI * Math.pow(r, 2);
		double perimeter = 2 * Math.PI * r;

		System.out.printf("The area is: %.2f", area);
		System.out.printf("\nThe perimeter is: %.2f", perimeter);
	}
}
