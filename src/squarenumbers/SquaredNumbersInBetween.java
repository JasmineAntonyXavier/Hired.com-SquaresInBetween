/*
 * This is a project that was given to me by hired.com as a sample coding 
 * project. Given two numbers, output the number of square numbers between them
 * for example, if the input is [4, 17] output that there are 3 squares between 
 * them (inclusive), 2, 3 and 4 squared. 
 */
package squarenumbers;

import java.util.Scanner;

/**
 * @author Jasmine Antony Xavier
 */

public class SquaredNumbersInBetween {

    private double squareRootAndRoundUp(int x) {
        return Math.ceil(Math.sqrt(x));
    }

    private double squareRootAndRoundDown(int x) {
        return Math.floor(Math.sqrt(x));
    }

    private int solution(int A, int B) {
        int upper = (int) squareRootAndRoundDown(B);
        int lower = (int) squareRootAndRoundUp(A);
        return upper - lower + 1;
    }

    public static void main(String[] args) {
        SquaredNumbersInBetween main = new SquaredNumbersInBetween();
        System.out.println("Input First Number: ");
        Scanner s = new Scanner(System.in);

        int first = s.nextInt();
        System.out.println("Input Second Number: ");
        int second = s.nextInt();
        System.out.println("The Number of Squares inbetween is: " + main.solution(first, second));
    }
}
