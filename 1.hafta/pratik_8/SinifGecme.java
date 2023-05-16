package pratik_8;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
       double mat, fizik, turkce, kimya, muzik, ort;
       
       Scanner s = new Scanner(System.in);
       
       System.out.print("Matematik notunuzu yazınız: ");
       mat = s.nextDouble();
       if((mat < 0) || (mat > 100)) {
           System.out.println("Notunuz 0'dan küçük 100'den büyük olamaz.");
           mat = 0;
       }
        
       System.out.print("Fizik notunuzu yazınız: ");
       fizik = s.nextDouble();
       if((fizik < 0) || (fizik > 100)) {
           System.out.println("Notunuz 0'dan küçük 100'den büyük olamaz.");
           fizik = 0;
       }
        
       System.out.print("Türkçe notunuzu yazınız: ");
       turkce = s.nextDouble();
       if((turkce < 0) || (turkce > 100)) {
           System.out.println("Notunuz 0'dan küçük 100'den büyük olamaz.");
           turkce = 0;
       }
       
       System.out.print("Kimya notunuzu yazınız: ");
       kimya = s.nextDouble();
       if((kimya < 0) || (kimya > 100)) {
           System.out.println("Notunuz 0'dan küçük 100'den büyük olamaz.");
           kimya = 0;
       }
       
       System.out.print("Müzik notunuzu yazınız: ");
       muzik = s.nextDouble();
       if((muzik < 0) || (muzik > 100)) {
           System.out.println("Notunuz 0'dan küçük 100'den büyük olamaz.");
           muzik = 0;
       }
       
       ort = ((mat+fizik+turkce+kimya+muzik) / 5);
       System.out.println("Derslerin ortalaması: " + ort);

       
       if (ort <= 50) {
           System.out.println("Sınıfta kaldınız...");
       }else {
           System.out.println("Sınıfı geçtiniz.Tebrikler...");
       }
        


    }
}
