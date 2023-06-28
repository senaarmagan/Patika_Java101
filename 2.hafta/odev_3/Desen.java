package odev_3;

import java.util.Scanner;

/**
Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya olduktan 
sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */
public class Desen {
     static int desen(int s, int temp, boolean state) {
        System.out.print(s + " ");
        if (s < 0 || s == 0 || !state) {
            state = false;
            if (s != temp) {
                return desen(s + 5, temp, state);
            } else
                return 0;
        } else {
            return desen(s - 5, temp, state);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, temp;
        System.out.print("Sayı Yazınız: ");
        s = input.nextInt();
        desen(s, temp = s, true);
    }
}