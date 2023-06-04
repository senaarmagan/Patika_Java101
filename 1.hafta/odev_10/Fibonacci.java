package odev_10;

import java.util.Scanner;

/**
Java döngüler ile fibonacci serisi bulan program yazıyoruz. 
Fibonacci serisinin eleman sayısını kullanıcıdan alın.
*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num, num1=0,num2=1, sum;
        
        System.out.print("Basamak sayısını yazınız: ");
        num = s.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println(num1 + " ");
            
            sum=num1+num2;
            num1 =num2;
            num2=sum;  
        } 
    }
}
