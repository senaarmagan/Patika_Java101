package odev_3;

import java.util.Scanner;

/**

* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
* Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
* Mesafe başına ücret 0,10 TL / km olarak alın. 
* İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
* Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

**/

public class UcakBileti {
    public static void main(String[] args) {
        double distance, netPrice, grossPrice; int age, roadType; 
       
        
        Scanner s= new Scanner(System.in);
        // Kullanıcıdan mesafe yaş ve yolculuğun tipini(gidiş-dönüş, tek yön) alma.
        
        System.out.print("Please write your distance in KM: ");
        distance = s.nextDouble();
        
        System.out.print("Please write your age:");
        age = s.nextInt();
        
        System.out.println("Is your trip one-way or round-trip?  ");
        System.out.println("1: One-Way \n2: Round-Trip");
        roadType = s.nextInt();
        
        if (age > 0 && distance > 0) {
            grossPrice = (distance * 0.1);
            System.out.println("Calculated ticket price:  " + grossPrice);
            switch(roadType) {
                
                case 1 :
                    if (age <= 12){
                        netPrice = (grossPrice- grossPrice*0.5);
                        System.out.println("%50 off price: " + netPrice);
                    }else if(age >12 && age <=24 ){
                        netPrice = (grossPrice- grossPrice*0.1);
                        System.out.println("%10 off price: " + netPrice);
                    }else if(age >= 65) {
                        netPrice = (grossPrice- grossPrice*0.3);
                        System.out.println("%30 off price: " + netPrice);
                    }else {
                        grossPrice = (distance * 0.1);
                        System.out.println("Calculated ticket price:  " + grossPrice);
                    }    
                    break;
                case 2  :
                    double grossPrice1 = (grossPrice- grossPrice*0.2);
                    System.out.println("Claculated ticket price for round-trip: " + grossPrice1);
                    
                    if (age <= 12){
                        netPrice = (grossPrice1 - grossPrice1*0.5);
                        System.out.println("%50 off price: " + netPrice);
                    }else if(age >12 && age <=24 ){
                        netPrice = (grossPrice1- grossPrice1*0.1);
                        System.out.println("%10 off price: " + netPrice);
                    }else if(age >= 65) {
                        netPrice = (grossPrice1- grossPrice1*0.3);
                        System.out.println("%30 off price: " + netPrice);
                    }else {
                        grossPrice = (distance * 0.1);
                        System.out.println("Calculated ticket price:  " + grossPrice);
                    } 
                    break;
                default : System.out.println("You Entered Incorrectly");    
        
                }
            }else { 
                System.out.println("Incorrect Entry");
        }    
        } 
       
    }

