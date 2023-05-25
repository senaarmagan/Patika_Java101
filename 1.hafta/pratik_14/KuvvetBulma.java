
package pratik_14;

import java.util.Scanner;

/**
 Java döngüler ile girilen sayıya kadar olan 4 ve 5'in 
 * kuvvetlerini ekrana yazdırma.
 */

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayı yazınız: ");
        int n = s.nextInt();
        
        for (int i = 1; i <= n;i*=4){
            System.out.println("4'ün kuvvetleri:  " + i );
        }    
        for (int j = 1; j <= n; j*=5) {
            System.out.println("5'in kuvvetleri: "  + j);
        }
    }       
}
