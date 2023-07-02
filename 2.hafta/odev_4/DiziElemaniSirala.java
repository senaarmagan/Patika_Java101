package odev_4;

import java.util.Arrays;
import java.util.Scanner;

/*
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. 
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
*/
public class DiziElemaniSirala {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dizinin Boyutu: ");
        int n=s.nextInt();
        
        int[] list= new int[n];
        
        System.out.println("Dizinin elemanlarını yazınız:");
        for (int i = 0; i <list.length; i++) {
            System.out.print((i+1) + " Elamanı: ");
            list[i] = s.nextInt();
        }
        System.out.print("Sıralama: " );
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));
    }
}
