/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */

import java.util.Scanner;
public class Q5_Roman2Integer {
    public static int romanToInt(String roman) {
        int num = 0;
        int currentInt;
        char currentChar;

        for (int i = 0; i < roman.length(); i++) {
            currentChar = roman.charAt(i);
            currentInt = 0;

            if (currentChar == 'I') {
                if (i != roman.length() - 1 && roman.charAt(i+1) == 'V') {
                    currentInt = 4;
                    i++;
                } else if (i != roman.length() - 1 && roman.charAt(i+1) == 'X') {
                    currentInt = 9;
                    i++;
                } else {
                    currentInt = 1;
                }
            } else if (currentChar == 'X') {
                if (i != roman.length() - 1 && roman.charAt(i+1) == 'L') {
                    currentInt = 40;
                    i++;
                } else if (i != roman.length() - 1 && roman.charAt(i+1) == 'C') {
                    currentInt = 90;
                    i++;
                } else {
                    currentInt = 10;
                }
            } else if (currentChar == 'C') {
                if (i != roman.length() - 1 && roman.charAt(i+1) == 'D') {
                    currentInt = 400;
                    i++;
                } else if (i != roman.length() - 1 && roman.charAt(i+1) == 'M') {
                    currentInt = 900;
                    i++;
                } else {
                    currentInt = 100;
                }
            } else if (currentChar == 'V') {
                currentInt = 5;
            } else if (currentChar == 'L') {
                currentInt = 50;
            } else if (currentChar == 'D') {
                currentInt = 500;
            } else if (currentChar == 'M') {
                currentInt = 1000;
            }

            num += currentInt;
        }

        return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a roman number: ");
        String roman = sc.nextLine().toUpperCase();

        System.out.println(roman + " -> " + romanToInt(roman));
    }
}
