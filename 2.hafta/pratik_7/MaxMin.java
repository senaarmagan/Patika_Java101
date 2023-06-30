package pratik_7;

import java.util.Arrays;
import java.util.Scanner;

/**
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük 
en yakın sayıyı bulan programı yazınız.
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi: " + Arrays.toString(list));
        
        System.out.print("Bir sayı yazınız: ");
        int sayi=s.nextInt();
      
        int min = sayi;
        int max = sayi;
        
        Arrays.sort(list);
        System.out.println("Sıralanmış Dizi: " + Arrays.toString(list));

        for (int i = list.length-1; i >= 0; i--){
            if (list[i] < sayi){
                min = list[i];
                break;
           }
        }
        
        for (int i : list) {
            if (i >  max) {
                max = i;
                break;
            }
        }    

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}
