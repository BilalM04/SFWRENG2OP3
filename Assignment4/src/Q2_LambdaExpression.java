/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.Scanner;

public class Q2_LambdaExpression {
    public static double subroutineFunction(double x, double y) {
        if (x * x - y * y < 0) {
            throw new IllegalArgumentException("abs(x) must be >= abs(y)");
        }

        return Math.sqrt(x*x-y*y);
    }

    public static Function function = (x, y) -> {
        if (x * x - y * y < 0) {
            throw new IllegalArgumentException("abs(x) must be >= abs(y)");
        }

        return Math.sqrt(x*x-y*y);
    };

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        double x = sc.nextDouble();

        System.out.print("Enter a value for y: ");
        double y = sc.nextDouble();

        System.out.printf("For x = " + x + " and y = " + y + " the result is %.4f", subroutineFunction(x, y));
        System.out.println();
        System.out.printf("For x = " + x + " and y = " + y + " the result is %.4f", function.lambdaFunction(x,y));
    }
}

interface Function {
    double lambdaFunction(double x, double y);
}
