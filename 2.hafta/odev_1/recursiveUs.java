package pratik_4;

import java.util.Scanner;
/**
taban ve üs değerleri kullanıcıdan alınan üs alma 
işlemini "Recursive" metot kullanarak yapan program
*/
public class recursiveUs {
    static int UsAlma(int taban, int us){
        
        int sonuc = (int) Math.pow(taban,us);
        return sonuc;
    }    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Taban Değerini giriniz: ");
        int taban=s.nextInt();
        System.out.print("Üs değerini yazınız: ");
        int us = s.nextInt();
        
        int sonuc= UsAlma(taban,us);
        System.out.println("Sonuc: " + sonuc );
    }
    }

