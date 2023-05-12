package pratik_3;

import java.util.Scanner;

public class AlanHesapla {
    public static void main(String[] args) {
        // Dik üçgenin alanını hesaplma 
        Scanner s=new Scanner(System.in);
        double a,b,c,u,alan;
        
        System.out.println("Birinci kenarı yazınız: ");
        a = s.nextDouble();
        
        System.out.println("İkinci kenarı yazınız: ");
        b = s.nextDouble();
       
        c=Math.sqrt(a * a + b * b);
        System.out.println(" Üçgenin hipotenüsü: " + c);
         
        u = (a+b+c) / 2;
        alan = u * (u - a) * (u - b) * (u - c);
        
        System.out.println("Üçgenin alanı: " + alan);
        
        
    }
 
}
