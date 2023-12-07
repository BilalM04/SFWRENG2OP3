/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)
 *
 * Write a java program to compute the transpose of a user input matrix,
 * whose elements are all integers.
 *
 * Converting rows of a matrix into columns and columns of a matrix into
 * row is called transpose of a matrix.
 *
 * INPUT: user input matrix (2D array).
 * OUTPUT: the transpose of input matrix.
 *
 * Note: considering how to take users' input, you can set some rules
 * (give users some hints) to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * INPUT: 4  6  8
 *        5  8  9
 *        2  1  8
 *
 * OUTPUT: 4  5  2
 *         6  8  1
 *         8  9  8
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q3_TransposeMatrix {
    /* place your subroutine code here */
    public static Integer[][] transpose(Integer[][] matrix) {
        Integer[][] transposedMatrix= new Integer[matrix[0].length][matrix.length];

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number of rows in the matrix (n > 0): ");
            int rows = sc.nextInt();

            System.out.print("Enter the number of columns in the matrix (n > 0): ");
            int columns = sc.nextInt();
            sc.nextLine();

            Integer[][] matrix = new Integer[rows][columns];

            System.out.println("\nWhen entering each row, each element must be an integer and separated by a single space Ex. '3 5 6 7 8' (without quotations).");

            for (int i = 0; i < matrix.length; i++) {
                System.out.print("Enter the " + (i + 1) + "(st/nd/rd/th) row of the matrix consisting of " + columns + " elements: ");
                String[] input = sc.nextLine().split(" ");
                for (int j = 0; j < input.length; j++) {
                    matrix[i][j] = Integer.parseInt(input[j]);
                }
            }

            System.out.println("\nOriginal Matrix:");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
            System.out.println();

            Integer[][] trans = transpose(matrix).clone();

            System.out.println("Transposed Matrix:");
            for (int i = 0; i < trans.length; i++) {
                System.out.println(Arrays.toString(trans[i]));
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error: please ensure your input is formatted correctly and of correct type.");
        }

    }
}
