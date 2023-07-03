package com.git;

import java.util.Scanner;
//Program for buying stock and selling stock for max profit
public class Practice {
    public static void main(String[] args) {
       int[] prices = {1,3,2,8,4,9};
       int fee = 2;
       int buy= Integer.MIN_VALUE;
       int sell = 0;

       for (int price : prices) {
           System.out.println(price);
           buy = Math.max(buy, sell-price);
           System.out.println(buy);
           sell = Math.max(sell, buy+price-fee);
           System.out.println(sell);
           System.out.println(  );
        }
        System.out.println(sell);
    }

    public static class Countno {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int count = 0;
            while (n > 0){
                int rem = n%10;
                if (rem == 3){
                    count++;
                }
                n = n/10;
            }
            System.out.println(count);
        }
    }
}
