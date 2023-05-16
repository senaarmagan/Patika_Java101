package pratik_9;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Hava sıcaklığını yazınız: ");
        heat = s.nextInt();
        
        if(heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
            
        }else if((heat >=5)&& (heat< 15)) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if((heat >=15)&& (heat < 25)) {
            System.out.println("Piknik yapabilirsiniz");
        }else if(heat >25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }else {
            System.out.println("Hatalı giriş...");
        }
    }
}
