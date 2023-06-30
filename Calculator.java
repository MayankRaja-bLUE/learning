package com.git;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// Take input form user till does not press x or X
        while (true){
            System.out.print("Enter Operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '*' || op == '-' || op == '/' || op == '%'){
                System.out.print("Enter Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    System.out.println(num1 + num2);
                }
                if (op == '-'){
                    System.out.println(num1 - num2);
                }
                if (op == '*'){
                    System.out.println(num1 * num2);
                }
                if (op == '/'){
                    if (num2 != 0){
                        System.out.println(num1 / num2);
                    }
                }
                if (op == '%'){
                    System.out.println(num1 % num2);
                }
            } else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Invalid Operator");
            }
        }
    }
}
