package odev_1;

import java.util.Scanner;

public class VKitleIndeksi {
    public static void main(String[] args) {
// Vücüt kitle indeksini hesaplayan program        
        
        double boy, kilo, sonuc;
        
        // kullanıcıdan boy ve kilo değerlerini alma
        Scanner s = new Scanner(System.in);
        
        System.out.print("Lütfen Boyunuzu metre cinsinden yazınız: ");
        boy = s.nextDouble();
        
        System.out.print("Lütfen Kilonuzu yazınız: ");
        kilo = s.nextDouble();
        
        sonuc = (kilo) / ((boy) * (boy));
        System.out.println("Vücut Kitle İndeksiniz: " + sonuc);
    }
}
