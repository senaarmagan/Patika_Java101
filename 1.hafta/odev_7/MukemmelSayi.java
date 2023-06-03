package odev_7;

import java.util.Scanner;

/**
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını 
bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” 
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) 
toplamı kendisine eşit olan sayıya mükemmel sayı denir.

*/
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.print("Write a number: ");
        int num= s.nextInt();
        
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                sum += i;
            }    
        }
        if(num == sum){
            System.out.println(num + " Mükemmel sayı.");
        }
        else{
            System.out.println(num + " Mükemmel sayı değildir.");
        }    
    }
}
