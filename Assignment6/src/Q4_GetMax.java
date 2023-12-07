/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
 *
 * Write a complete static method that finds the largest value in a 2-dimension array of ints.
 * The method should have one parameter, which is a 2d array of type int. The largest number
 * in the array should be returned as the value of the method.
 *
 * INPUT: user input a 2-dimension array of type int
 * OUTPUT: the largest number in input array
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * Input: 4  6  8
 *        5  8  9
 *        2  1  8
 * Output: 9
 *
 */

import java.util.Scanner;

public class Q4_GetMax {
    /* place your code here */
    public static int getMax(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer number of rows in the 2D array (n > 0): ");
            int rows = sc.nextInt();

            System.out.print("Enter an integer number of columns in the 2D array (n > 0): ");
            int columns = sc.nextInt();
            sc.nextLine();

            int[][] arr = new int[rows][columns];

            System.out.println("\nWhen entering each row, each element must be an integer and separated by a single space Ex. '3 5 6 7 8' (without quotations).");

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the " + (i + 1) + "(st/nd/rd/th) row of the 2D array consisting of " + columns + " elements: ");
                String[] input = sc.nextLine().split(" ");
                for (int j = 0; j < input.length; j++) {
                    arr[i][j] = Integer.parseInt(input[j]);
                }
            }

            System.out.println("\nThe max value in the 2D array is: "+ getMax(arr));

        } catch (Exception e) {
            throw new IllegalArgumentException("Error: please ensure your input is formatted correctly and of correct type.");
        }


    }
}
