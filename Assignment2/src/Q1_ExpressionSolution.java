/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program to find the value of following expression.
    a) (101 + 0) / 3
    b) 3.0e-6 * 10000000.1
    c) true && true
    d) false && true
    e) (false && false) || (true && true)
    f) (false || false) && (true && true)

 * INPUT: n/a
 * OUTPUT: the value of each of the above expressions.

 */


public class Q1_ExpressionSolution {
    public static void main(String[] args) {
        double a = (101 + 0) / 3.0;
        double b = 3.0e-6 * 10000000.1;
        boolean c = true && true;
        boolean d = false && true;
        boolean e = (false && false) || (true && true);
        boolean f = (false || false) && (true && true);

        System.out.println("a) (101 + 0) / 3 = " + a);
        System.out.println("b) 3.0e-6 * 10000000.1 = " + b);
        System.out.println("c) true && true = " + c);
        System.out.println("d) false && true = " + d);
        System.out.println("e) (false && false) || (true && true) = " + e);
        System.out.println("f) (false || false) && (true && true) = " + f);
    }
}
