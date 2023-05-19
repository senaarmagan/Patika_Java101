package odev_4;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int birthYear;
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Doğum tarihinizi yaznınız: ");
        birthYear = s.nextInt();
        
        int sonuc = (birthYear % 12);
        
        switch(sonuc) {
            case 0:
                System.out.println("Çin zodyağı Burcunuz: Maymun" );
                break;
            case 1:
                System.out.println("Çin zodyağı Burcunuz: Horoz" );
                break;
            case 2:
                System.out.println("Çin zodyağı Burcunuz: Köpek" );
                break;
            case 3:
                System.out.println("Çin zodyağı Burcunuz: Domuz" );
                break;
            case 4:
                System.out.println("Çin zodyağı Burcunuz: Fare" );
                break;
            case 5:
                System.out.println("Çin zodyağı Burcunuz: Öküz" );
                break;
            case 6:
                System.out.println("Çin zodyağı Burcunuz: Kaplan" );
                break;
            case 7:
                System.out.println("Çin zodyağı Burcunuz: Tavşan" );
                break;
            case 8:
                System.out.println("Çin zodyağı Burcunuz: Ejderha" );
                break;
            case 9:
                System.out.println("Çin zodyağı Burcunuz: Yılan" );
                break;
            case 10:
                System.out.println("Çin zodyağı Burcunuz: At" ); 
                break;
            case 11:
                System.out.println("Çin zodyağı Burcunuz: Koyun" ); 
                break;
        
        default : System.out.println("Hatalı tarih girdiniz...");
        }
    }
}
