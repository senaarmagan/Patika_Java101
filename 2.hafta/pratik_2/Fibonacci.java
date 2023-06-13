package pratik_2;

import java.util.Scanner;

public class Fibonacci {
    static int fibBul(int number){
        int a = 1, b=1, c=0, sum=0;
        for (int i = 3; i <= number; i++) {
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Sayı yazınız: ");
        int num =s.nextInt();
        System.out.println(fibBul(num));
    }
}
