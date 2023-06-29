//Check if armstrong
package com.git;

import java.util.Scanner;

public class AmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 digit number: ");
        int n = in.nextInt();
        if (n < 1000 && n>99) {
            System.out.println(isArmstrong(n));
        } else {
            System.out.println("INVALID INPUT");
        }
//        Print all three digit armstrong number
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n) {
        int org = n;
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==org;

    }
}