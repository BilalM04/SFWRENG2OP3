/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a Java program, use 'subroutine' to finds the minimum value of
 * the first N elements of an array of type int.
 * Meanwhile, your code can throw an IllegalException (custom run-time
 * exception, which can be one provided by Java) if N is not in the range
 * of the length of input array.
 *
 * Input: user input array and number N.
 * Output: the minimum value of the first N elements of the array.
 *
 * Note: The array and N are parameters to the subroutine.
 * Users will input an array with no specific length.
 *
 */

import java.util.Scanner;

public class Q1_FindMinimum {
    public static int findMin(Integer[] nums, int N) {
        if (N >= nums.length) {
            throw new IllegalArgumentException("N must be within the range of the length of input array.");
        }

        int min = nums[0];

        for (int i = 0; i <= N; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a list of integers separated by a single space: ");
        String[] arr = sc.nextLine().split(" ");

        System.out.print("Enter an integer N (0 <= N < length of array): ");
        int N = sc.nextInt();

        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        System.out.println("The minimum value is: " + findMin(nums, N));
    }
}


