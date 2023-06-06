package pratik_17;

import java.util.Scanner;

/**
Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazın.
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
 */
public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number,k, tempNum1, tempNum2 ,basamakSayisi = 0, sum=0;
        
        System.out.print("Bir sayı yazınız: ");
        number = s.nextInt();
        
        tempNum1 = number;
        tempNum2 = number;
        
        while(tempNum1 > 0) {
            tempNum1 /= 10;
            basamakSayisi++;           
        }
        while(number > 0) {
            k = number % 10;
            sum += Math.pow(k, basamakSayisi);
            number /= 10;
        }
        if(sum == tempNum2){
            System.out.println(tempNum2 + " sayısı Armstrong bir sayıdır.");
        }
        else{
            System.out.println(tempNum2 + " sayısı Armstrong bir sayı değildir.");
        }
        
    }
}
