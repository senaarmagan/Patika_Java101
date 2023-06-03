package odev_8;

import java.util.Scanner;

/**
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, 
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
*/
public class TersUcgen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Basamak sayısını yazınız: ");
        int num = s.nextInt();
        
        for (int i = 1; i <=num; i++) {
            for (int j =num ; j >=i; j--) {
                 System.out.print("*");
            }
            System.out.println("");
        }
    }
}
