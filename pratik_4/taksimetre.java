package pratik_4;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int a = 10, yol;
        double b = 2.20, tutar;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi yazınız: ");
        yol = s.nextInt();
        
        tutar = (yol*b) + a ;
        
        tutar = (tutar <20) ? 20 : tutar;
        System.out.println("Toplam tutar: " + tutar);
        
    }
}
