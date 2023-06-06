package pratik_15;

import java.util.Scanner;

/**
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı 
* farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. 
* N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
 */
public class Faktoriyel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,r,n_total=1,r_total=1,c,c_total=1,result;
        
        System.out.print("Kümenin eleman sayısını yazınız: ");
        n=s.nextInt();
        System.out.print("Kaç elemanlı farklı gruplar var: ");
        r=s.nextInt();
        
        for (int i = n; i > 0 ; i--) {
            n_total *= i; 
        }
        for (int i = r; i > 0 ; i--) {
            r_total *= i; 
        }  
        c=n-r;
        for (int i = c; i >0; i--) {
            c_total *= i; 
        }
        result = (n_total / (r_total * (c_total)));
        System.out.println(n+"'in " + r + "'li kombinasyonu: " + result);
    }
}
