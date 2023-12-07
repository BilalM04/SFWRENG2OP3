/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Write a Java program, user input a 1-dimension array of integers, firstly
 * sorting it in non-increasing order, and then remove the duplicates in the
 * array (if exists).
 *
 * INPUT: user input a 1-dimension array.
 * OUTPUT: sorted array in non-increasing order, and without any repeating element.
 *
 * Note: You must write sort algorithm by yourself, you are not supposed to
 * use Arrays.sort() to output the result directly.
 *
 * Hint: you can use bubble sorting algorithm or other sorting algorithms.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example 1:
 * INPUT: [0, 1, 1, 0, 1, 2, 2, 3, 3, 4]
 * OUTPUT: [4, 3, 2, 1, 0]
 *
 * Example 2:
 * INPUT: [7, 0, 4, 2, 9]
 * OUTPUT: [9, 7, 4, 2, 0]
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q3_RemoveDuplicates {
    /* place your subroutine code here */
    public static void sort(Integer[] arr) {
        for (int itemsSorted = 1; itemsSorted < arr.length; itemsSorted++) {
            int temp = arr[itemsSorted];
            int loc = itemsSorted - 1;

            while (loc >= 0 && arr[loc] < temp) {
                arr[loc + 1] = arr[loc];

                loc = loc - 1;
            }

            arr[loc + 1] = temp;
        }
    }

    public static int flagDuplicates(Integer[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                arr[i] = null;
            }
            else {
                count++;
            }
        }
        count++;

        return count;
    }

    public static Integer[] removeDuplicates(Integer[] arr, int n) {
        Integer[] toReturn = new Integer[n];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                toReturn[index] = arr[i];
                index++;
            }
        }

        return toReturn;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a list of integers seperated by a single space '3 5 7 2 4' (without quotations): ");
            String[] input = sc.nextLine().split(" ");

            Integer[] arr = new Integer[input.length];

            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            sort(arr);
            int count = flagDuplicates(arr);
            Integer[] newArr = removeDuplicates(arr, count);

            System.out.println(Arrays.toString(newArr));
        } catch (Exception e) {
            throw new IllegalArgumentException("Error: please ensure your input is formatted correctly and of correct type.");
        }
    }
}
