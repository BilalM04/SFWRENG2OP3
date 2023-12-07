/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)

Many companies use telephone numbers like 555-GET-Food so the number is easier for their customers to remember.
On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion:

A, B, and C = 2
D, E, and F = 3
G, H, and I = 4
J, K, and L = 5
M, N, and O = 6
P, Q, R, and S = 7
T, U, and V = 8
W, X, y, and Z = 9
Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX.
The application should display the telephone number with any alphabetic characters that appeared in the original
translated to their numeric equivalent.

Example: if the user enters 555GETFOOD the application should display 555-438-3663.
*

 */

import java.util.Scanner;

public class Q3_AlphabeticPhoneNumber
{
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number)
    {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        long number = 0; // 'number' is the digital phone number to compute from the initial alphabetic phone number.

        /* place your code here */
        String new_number = initial_phone_number.replace("-","");

        for (int i = 0; i < new_number.length(); i++) {
            if (new_number.charAt(i) == 'A' | new_number.charAt(i) == 'B' | new_number.charAt(i) == 'C') {
                new_number = new_number.substring(0, i) + '2' + new_number.substring(i+1);
            }
            else if (new_number.charAt(i) == 'D' | new_number.charAt(i) == 'E' | new_number.charAt(i) == 'F') {
                new_number = new_number.substring(0, i) + '3' + new_number.substring(i+1);
            }
            else if (new_number.charAt(i) == 'G' | new_number.charAt(i) == 'H' | new_number.charAt(i) == 'I') {
                new_number = new_number.substring(0, i) + '4' + new_number.substring(i+1);
            }
            else if (new_number.charAt(i) == 'J' | new_number.charAt(i) == 'K' | new_number.charAt(i) == 'L') {
                new_number = new_number.substring(0, i) + '5' + new_number.substring(i+1);
            }
            else if (new_number.charAt(i) == 'M' | new_number.charAt(i) == 'N' | new_number.charAt(i) == 'O') {
                new_number = new_number.substring(0, i) + '6' + new_number.substring(i+1);
            }
            else if (new_number.charAt(i) == 'P' | new_number.charAt(i) == 'Q' | new_number.charAt(i) == 'R' | new_number.charAt(i) == 'S') {
                new_number = new_number.substring(0, i) + '7' + new_number.substring(i+1);
            }
            else if (new_number.charAt(i) == 'T' | new_number.charAt(i) == 'U' | new_number.charAt(i) == 'V') {
                new_number = new_number.substring(0, i) + '8' + new_number.substring(i+1);
            }
            else if (new_number.charAt(i) == 'W' | new_number.charAt(i) == 'X' | new_number.charAt(i) == 'Y' | new_number.charAt(i) == 'Z') {
                new_number = new_number.substring(0, i) + '9' + new_number.substring(i+1);
            }
        }

        number = Long.parseLong(new_number);

        // Return actual number only at the end of the function
        return number;

    }// End of full_number function
}
