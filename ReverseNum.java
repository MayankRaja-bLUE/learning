package com.git;

import java.util.Scanner;
//take input num and reverse the num
public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        int ans = 0;
        while (num>0) {
            int rem = num%10;
            num /= 10;
            System.out.println(num);
            ans = ans*10 + rem;
        }

        System.out.println(ans);
    }
}
