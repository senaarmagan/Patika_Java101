package pratik_2;

import java.util.Scanner;

public class KDVHesapla {
    public static void main(String[] args) {
       //Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplama
       double tutar,kdvOrani,kdvliTutar,kdvTutari;
       Scanner s= new Scanner(System.in);
       
       System.out.print("KDV'siz tutarı yazınız: ");
       tutar = s.nextDouble();
        
       //girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18,1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplama
        
       boolean sonuc = (tutar <= 1000);
       kdvOrani = sonuc ? 0.18 : 0.08 ;
       kdvTutari = tutar * kdvOrani ;
       kdvliTutar = tutar * (1+ kdvOrani) ;
       
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
       
    }
}
