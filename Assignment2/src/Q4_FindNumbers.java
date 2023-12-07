/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
    Write a Java program to print integer numbers between 1 to a user input integer n, which are divisible by 3, 5 and by both.

 * INPUT: a user input integer n
 * OUTPUT: all the integer numbers between 1 and n that are either divisible by 3 or by 5 or by both.

* Hint: For n=16, the output should be as follows.
    Divided by 3 -> 3, 6, 9, 12, 15.
    Divided by 5 -> 5, 10, 15.
    Divided by 3 and 5 -> 15.
 */

import java.util.Scanner;

public class Q4_FindNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        String three = "Divided by 3 -> ";
        String five = "Divided by 5 -> ";
        String three_and_five = "Divided by 3 and 5 -> ";

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0){
                if (three.charAt(three.length()-1) != ' '){
                    three += ", ";
                }
                three += i;
            }
            if (i % 5 == 0){
                if (five.charAt(five.length()-1) != ' '){
                    five += ", ";
                }
                five += i;
            }
            if (i % 3 == 0 && i % 5 == 0){
                if (three_and_five.charAt(three_and_five.length()-1) != ' '){
                    three_and_five += ", ";
                }
                three_and_five += i;
            }
        }

        System.out.println(three + ".");
        System.out.println(five + ".");
        System.out.println(three_and_five + ".");
    }
}
