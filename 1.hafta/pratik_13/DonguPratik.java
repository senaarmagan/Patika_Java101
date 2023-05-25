
package pratik_13;

import java.util.Scanner;

/**
 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul 
 * eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana yazma
 */

public class DonguPratik {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        int n, toplam = 0;
        
        do { 
            System.out.println("Sayı yazınız: ");
            n = s.nextInt();
            if((n % 2 == 0) && (n % 4 == 0)) {
                toplam += n;
        }
        }while(n % 2 == 0) ;
            System.out.println("Toplam: " + toplam);
           
        }
    }

