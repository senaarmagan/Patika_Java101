package pratik_12;

import java.util.Scanner;

/**
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen 
sayıların ortalamasını hesaplayan programı yazınız.
 */
public class TamBolunenleriBulma {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n, sayac = 0, toplam = 0;
        System.out.println("Bir sayı yazınız: ");
        n = s.nextInt();
        
        for (int i = 0; i <= n; i++) {
            if((i % 3 == 0) && (i%4==0)) {
                sayac++ ;
                toplam +=i;
                
            }
           
        }
        System.out.println("Ortalama: " + toplam/sayac);
    }
 
}
