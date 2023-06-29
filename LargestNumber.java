package com.git;

//Input 3 number and find the largest number out of them

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 3 number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int top = a;
        if (top < b) {
            top = b;}
        if (top < c) {
            top = c;}
        System.out.println(top);

    }
}

