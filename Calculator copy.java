/**
 * Title: Lab 2
 * Author: Merrill Carr
 * Date: Jan 19th
 * Description: This lab will be a basic four function calculator.
 * Code Version: V1
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // connects to public class hagshdksefnlsj
        int calculation;
        // declaration of int variable
        double firstOper;
        double secondOper;
        double result = 0;
        //must initialize the result variable
        // declaration of the double precision floating point variable

        Scanner scanner = new Scanner(System.in);
        // making sure the scanner works
        System.out.print("Enter first operand: ");
        //asks user to enter first value
        firstOper = scanner.nextDouble();
        // stores the userinput as the firstInt
        System.out.print("Enter second operand: ");
        //asks user to enter second value
        secondOper = scanner.nextDouble();
        //stores the user input as secondInt

        System.out.println(" ");
        System.out.println("Calculator Menu ");
        System.out.println("--------------- ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        //prints the menu
        System.out.println("Which operation do you want to perform? ");
        Scanner scnr = new Scanner(System.in);
        calculation = scanner.nextInt();
        //user picks a function and the calculator then it goes into the if statements

        if (calculation == 1) {
            result = firstOper + secondOper;
            System.out.print("The result of the operation is " + result + ". Goodbye! ");
            // addition of the two numbers
        }
        else if (calculation == 2) {
            result = firstOper - secondOper;
            System.out.print("The result of the operation is " + result + ". Goodbye! ");
            // subtraction of the two numbers
        }
        else if (calculation == 3){
            result = firstOper * secondOper;
            System.out.print("The result of the operation is " + result + ". Goodbye! ");
            // multiplication of the two numbers
        }
        else if (calculation == 4){
            result = firstOper / secondOper;
            System.out.print("The result of the operation is " + result + ". Goodbye! ");
            // division of the two numbers
        }
        else {
            System.out.println("Error: Invalid selection! Terminating program.");
            // when the user inputs a invalid number
        }

    }
}
