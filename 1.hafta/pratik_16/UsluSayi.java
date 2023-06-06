package pratik_16;

import java.util.Scanner;

/**
Java ile kullanıcının girdiği değerler ile üslü sayı 
hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/
public class UsluSayi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,r,total=1;
        
        System.out.print("Üssü alınacak sayı: ");
        n=s.nextInt();
        System.out.print("Üs olacak sayı: ");
        r = s.nextInt();
        
        for (int i = 1; i <= r; i++) {
            total *=n;
        }
        System.out.println("Sonuç: " + total);
        
    }
}
