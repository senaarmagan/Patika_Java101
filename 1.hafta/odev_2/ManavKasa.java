package odev_2;

import java.util.Scanner;

 /**
 * Manav Kasa Programı
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 *
 * Meyveler ve KG Fiyatları
 *
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 *
 * Örnek Çıktı;
 *
 * Armut Kaç Kilo ? :0
 * Elma Kaç Kilo ? :1
 * Domates Kaç Kilo ? :1
 * Muz Kaç Kilo ? :2
 * Patlıcan Kaç Kilo ? :3
 * Toplam Tutar : 21.68 TL
 */  
public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates= 1.11, muz= 0.95, patlıcan=5.00, toplam;
     
        Scanner s = new Scanner(System.in);
     
        System.out.print("Armut Kaç Kilo: ");
        armut *= s.nextDouble();
        
        System.out.print("Elma Kaç Kilo: ");
        elma *= s.nextDouble();
        
        System.out.print("Domates Kaç Kilo: ");
        domates *= s.nextDouble();
        
        System.out.print("Muz Kaç Kilo: ");
        muz *= s.nextDouble();
        
        System.out.print("Patlıcan Kaç Kilo: ");
        patlıcan *= s.nextDouble();
        
        toplam = (armut+elma+domates+muz+patlıcan);
        System.out.println("Ödemeniz Gereken Toplam Tutar: " + toplam + " TL");
    }
    
}
