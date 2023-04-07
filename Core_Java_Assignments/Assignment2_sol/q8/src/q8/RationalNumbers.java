package q8;

import java.util.Scanner;

public class RationalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, den1, num2, den2;
        
        // Input the first rational number
        System.out.println("Enter the first rational number:");
        System.out.print("Numerator: ");
        num1 = input.nextInt();
        System.out.print("Denominator: ");
        den1 = input.nextInt();
        
        // Input the second rational number
        System.out.println("Enter the second rational number:");
        System.out.print("Numerator: ");
        num2 = input.nextInt();
        System.out.print("Denominator: ");
        den2 = input.nextInt();
        
        // Input the arithmetic operation
        System.out.print("Enter the arithmetic operation (+, -, *, /): ");
        char op = input.next().charAt(0);
        
        // Perform the arithmetic operation
        int resultNum, resultDen;
        switch (op) {
            case '+':
                resultNum = num1 * den2 + num2 * den1;
                resultDen = den1 * den2;
                break;
            case '-':
                resultNum = num1 * den2 - num2 * den1;
                resultDen = den1 * den2;
                break;
            case '*':
                resultNum = num1 * num2;
                resultDen = den1 * den2;
                break;
            case '/':
                resultNum = num1 * den2;
                resultDen = den1 * num2;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        
        // Reduce the result to its simplest form
        int gcd = findGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;
        
        // Output the result
        System.out.println("Result: " + resultNum + "/" + resultDen);
    }
    
    // Find the greatest common divisor (GCD) of two integers using Euclid's algorithm
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
