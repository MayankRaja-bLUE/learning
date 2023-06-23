package com.git;

import java.sql.SQLOutput;
import java.util.Scanner;
//program to convert roman to integer
public class Caps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.next();
        int ans=0, num=0, prev=0;
        for (int i = s.length()-1; i>= 0; i--){
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (num<prev) {
                ans -= num;
            }else {
                ans += num;
            }
            prev = num;
        }
        System.out.println(ans);
        int buy = Math.max(-2147483648, 0-1);
        int sell = Math.max(0, buy+1-2);
    }
}
