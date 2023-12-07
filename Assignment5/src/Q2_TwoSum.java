/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (30 marks)
 *
 * Write a subroutine, user input an 1D array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * INPUT: user input array and target
 * OUTPUT: the indices of the two numbers such that they add up to target.
 *
 * The array and target are parameters to the subroutine.
 * User can get hint to input array and target number, respectively.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example:
 * INPUT: [2,7,11,15], 9
 * OUTPUT: [0,1]
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q2_TwoSum {
    /* place your subroutine code here */
    public static Integer[] twoSum(Integer[] nums, int target) {
        Integer[] output = new Integer[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer array and an integer target Ex. '[2,7,11,15], 9' (without quotations): ");
            String input = sc.nextLine();

            int target = Integer.parseInt(input.substring(input.lastIndexOf(',')+1).replace(" ", ""));
            String[] numsString = input.substring(0, input.lastIndexOf(',')).replace(" ", "").replace("[", "").replace("]", "").split(",");

            Integer[] nums = new Integer[numsString.length];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(numsString[i]);
            }

            Integer[] result = twoSum(nums, target);

            if (result[0] == null) {
                System.out.println("No two unique indices sum up to " + target + ".");
            }
            else {
                System.out.println(Arrays.toString(result));
            }
        } catch(Exception e) {
            throw new IllegalArgumentException("Error: please ensure your input is formatted correctly and of correct type.");
        }
    }

}
