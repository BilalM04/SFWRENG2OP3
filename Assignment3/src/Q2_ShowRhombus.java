/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a java program to display the number rhombus structure.

 * INPUT: user input integer value: n
 * The input should be fed into a subroutine as parameter.
 *
 * OUTPUT: the rhombus structure corresponding to n. (see the following example)
 * Your subroutine should directly print the result and do not return anything.

*
* Example:
* For n=7, the rhombus structure is:
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1

* For n=3, the rhombus structure is:
  1
 212
32123
 212
  1

 */

import java.util.Scanner;

public class Q2_ShowRhombus {
    public static void generateRhombus(int n) {
        int i = 1;
        boolean half = false;
        String numbers = "";
        String space = " ";

        while (i >= 1) {
            if (i == 1) {
                numbers = "1";
            }
            else if (!half) {
                numbers = i + numbers + i;
            }
            else {
                numbers = numbers.substring(1, numbers.length()-1);
            }

            System.out.print(space.repeat(n - i));
            System.out.print(numbers);
            System.out.println();

            if (i == n) {
                half = true;
            }

            if (!half) {
                i++;
            }
            else {
                i--;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();

        generateRhombus(n);
    }
}
