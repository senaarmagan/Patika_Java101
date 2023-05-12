package pratik_5;

import java.util.Scanner;

public class daireAlani {
    public static void main(String[] args) {
       //yarı çapını kullanıcıdan alan dairenin alanını ve çevresini hesaplama 
       double r,alan,cevre,pi=3.14 , a,alan2;
       
       
       Scanner s = new Scanner(System.in);
       
        System.out.println("Dairenin yarıçapını yazınız: ");
        r = s.nextDouble();
         
        cevre = (2*pi*r);
        alan = (pi* r*r);
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        
        //daire diliminin alanını bulma 
        System.out.println("Dairenin merkez açısının ölçüsünü yazınız: ");
        a = s.nextDouble();
        
        alan2 = (pi * (r*r)*a)/360;
        System.out.println("Daire diliminin alanı: " + alan2);
        
       
    }
}
