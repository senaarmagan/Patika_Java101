package pratik_1;

import java.util.Scanner;

public class OrtHesapla {

    public static void main(String[] args) {
        //Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alma
        int mat,fzk,kmy,trk,trh,mzk;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Matematik notunuzu yazınız: " );
        mat = s.nextInt();
        
        System.out.print("Fizik notunuzu yazınız: " );
        fzk = s.nextInt();
        
        System.out.print("Kimya notunuzu yazınız: " );
        kmy = s.nextInt();
   
        System.out.print("Türkçe notunuzu yazınız: " );
        trk = s.nextInt();
        
        System.out.print("Tarih notunuzu yazınız: " );
        trh = s.nextInt();
        
        System.out.print("Müzik notunuzu yazınız: " );
        mzk = s.nextInt();
        
        //Derslerin ortalamasını hesaplama
        double ort = ((mat+fzk+kmy+trk+trh+mzk) / 6);
        System.out.println("Derslerin ortalaması: " + ort);
        
        // Ortalama 60'dan büyükse geçti küçük ise kaldı
         System.out.println(ort >=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    
}
}