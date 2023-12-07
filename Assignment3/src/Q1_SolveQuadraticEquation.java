/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program, use 'subroutine', 'if', 'else if' and 'else' to solve a quadratic equation in the following form:

    a*x^2 + b*x + c = 0

 * INPUT: user input real valued coefficients: a, b, c.
 * These inputs should be fed as parameters into a subroutine that you write.
 *
 * OUTPUT: Output the solutions (i.e., roots) to the quadratic function defined by the coefficients a, b and c.
 * If there is no real roots, output: "The equation has no real roots."
 * The above outputs should be produced as a String variable returned by your subroutine.
 *
 * Note: all values must be displayed using two significant digits after decimal point.

*
* Example:
For a=1, b=5 and c=2, the roots are -0.44 and -4.56
 */

import java.util.Scanner;

public class Q1_SolveQuadraticEquation {
    public static String quadraticEquation(double a, double b, double c) {
        double determinant = Math.pow(b, 2) - 4 * a * c;
        String roots;
        double x1, x2;

        if (determinant < 0) {
            roots = "the equation has no real roots";
        }
        else {
            x1 = (-b + Math.sqrt(determinant)) / (2 * a);
            x2 = (-b - Math.sqrt(determinant)) / (2 * a);
            roots = "the roots are " + Math.round(x1*100)/100.0 + " and " + Math.round(x2*100)/100.0;
        }

        return roots;
    }

    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        System.out.println("For a=" + a + ", b=" + b + ", c=" + c + ", " + quadraticEquation(a, b, c));
    }
}
