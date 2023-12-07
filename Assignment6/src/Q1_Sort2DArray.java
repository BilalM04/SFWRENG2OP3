/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a java program, use "subroutine" to finish sorting a 2-dimension array.
 *
 * User input a 2-dimension array of double type, return it in non-decreasing
 * order according to values in the first raw, if there are two or more same
 * element in the first raw, keep the original sequence.
 *
 * INPUT: a user input 2-dimension array.
 * OUTPUT: sorted input array in non-decreasing order according to values in the first row.
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example 1
 * INPUT: if user input array (Order 2*4) is
 *        1.45 0.25 8.95 0.99
 *        2.56 5.67 0.47 2.65
 *
 * OUTPUT: 0.25  0.99  1.45  8.95
 *         5.67  2.65  2.56  0.47
 *
 * Example 2
 * INPUT: if user input array (Order 5*5) is
 *        0.95 0.23 0.95 0.95 0.65
 *        2.56 5.67 0.47 2.65 0.47
 *        1.45 0.25 8.95 0.99 0.67
 *        5.67 2.65 0.25 8.95 0.99
 *        1.23 4.21 0.97 7.64 8.52
 *
 * OUTPUT: 0.23  0.65  0.95  0.95  0.95
 *         5.67  0.47  2.56  0.47  2.65
 *         0.25  0.67  1.45  8.95  0.99
 *         2.65  0.99  5.67  0.25  8.95
 *         4.21  8.52  1.23  0.97  7.64
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Sort2DArray {
    /* place your subroutine code here */
    public static void sort(double[][] arr) {
        for (int itemsSorted = 1; itemsSorted < arr[0].length; itemsSorted++) {
            double temp = arr[0][itemsSorted];
            int loc = itemsSorted - 1;

            while (loc >= 0 && arr[0][loc] > temp) {
                arr[0][loc + 1] = arr[0][loc];
                loc = loc - 1;
            }
            arr[0][loc + 1] = temp;

            for(int i = 1; i < arr.length; i++) {
                double temp2 = arr[i][itemsSorted];

                for (int j = itemsSorted; j > loc + 1; j--) {
                    arr[i][j] = arr[i][j-1];
                }

                arr[i][loc + 1] = temp2;
            }
        }
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

            double[][] arr = new double[rows][columns];

            System.out.println("\nWhen entering each row, each element must be a double and separated by a single space Ex. '3.2 5 6.0 7.1 8.4' (without quotations).");

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter the " + (i + 1) + "(st/nd/rd/th) row of the 2D array consisting of " + columns + " elements: ");
                String[] input = sc.nextLine().split(" ");
                for (int j = 0; j < input.length; j++) {
                    arr[i][j] = Double.parseDouble(input[j]);
                }
            }
            System.out.println();

            sort(arr);

            //double[][] arr = {{0.95, 0.23, 0.95, 0.95, 0.65}, {2.56, 5.67, 0.47, 2.65, 0.47}, {1.45, 0.25, 8.95, 0.99, 0.67}, {5.67, 2.65, 0.25, 8.95, 0.99}, {1.23, 4.21, 0.97, 7.64, 8.52}};
            //sort(arr);

            System.out.println("Sorted 2D Array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }

        } catch (Exception e) {
            throw new IllegalArgumentException("Error: please ensure your input is formatted correctly and of correct type.");
        }
    }
}
