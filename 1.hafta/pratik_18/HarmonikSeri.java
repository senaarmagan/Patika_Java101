package pratik_18;

import java.util.Scanner;

/**
Java ile girilen sayının harmonik serisini bulan program.
 */
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        double sum=0;
        
        System.out.print("Bir sayı yazınız: ");
        number = s.nextInt();
        
        for (double i = 1; i <= number; i++) {
            sum =sum + (1/i);
        }
        System.out.println("Sonuç: " + sum);
    }
}
