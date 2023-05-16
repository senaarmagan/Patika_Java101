package pratik_6;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double a ,b ;
        
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Birinci sayıyı yazınız: ");
        a = s.nextDouble();
        System.out.print("İkinci sayıyı yazınız: ");
        b = s.nextDouble();
        
        System.out.println("Yapacağınız işlemi seçiniz: ");
        System.out.println("1: Toplama \n2: Çıkarma \n3: Çarpma \n4: Bölme ");
        int islem = s.nextInt();
        
         switch (islem) {
            case 1:
                System.out.println("Toplama Sonucu: " + (a+b));
                break;
            case 2:
                System.out.println("Çıkarma Sonucu: " + (a-b));
                break;
            case 3:
                System.out.println("Çarpma Sonucu: " + (a*b));
                break;
            case 4:
                if (b == 0 )
                    System.out.println("Hatalı giriş. Bir sayı sıfıra bölünemez.");
                else
                    System.out.println("Bölme Sonucu: " +(a/b));
                break;
            default:
                System.out.println("Hatalı işlem yaptınız...");
    }
}
}