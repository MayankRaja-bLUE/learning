package functions;

import java.util.Scanner;

public class ArmstrongFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
//For Printing All Three Degit Armstrong Numbers
//        for (int i = 100; i < 1000 ; i++) {
//            if (isArmstrong(i)){
//                System.out.println(i);
//            }
//        }
    }
    static boolean isArmstrong(int n){
        int orignal = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == orignal;
    }
}
