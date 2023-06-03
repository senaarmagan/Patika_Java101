package odev_6;

import java.util.Arrays;
import java.util.Scanner;

/**
Java ile klavyeden girilen N tane sayma sayısından en büyük 
ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
*/
public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num,max_num,min_num;
        
        System.out.print("Kaç tane sayı gireceksiniz: ");
        num = s.nextInt();
        int[] arr = new int[num];
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i + ".Sayıyı giriniz: ");
            arr[i-1] = s.nextInt();
        }    
        Arrays.sort(arr);
        max_num = arr[num-1];
        min_num = arr[0];
        System.out.println("En büyük sayı: " + max_num);
        System.out.println("En küçük sayı: " + min_num); 
    }
}
