package pratik_10;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int num1,num2,num3 ;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı yazınız: ");
        num1= s.nextInt();

        System.out.print("İkinci sayıyı yazınız: ");
        num2= s.nextInt();
        
        System.out.print("Üçüncü sayıyı yazınız: ");
        num3= s.nextInt();
        
        // 3 sayıyı küçükten büyüğe sıralama 
        
        if ((num1 < num2) && (num1 < num3)) {
            if (num2 < num3) {
                System.out.println(num1 + " < " + num2 + " < " + num3);
            }else {
                System.out.println(num1 + " < " + num3 + " < " + num2);
            }
        }else if ((num2 < num1) && (num2 < num3)) {
            if (num1 < num3) {
                System.out.println(num2 + " < " + num1 + " < " + num3);
            }else {
                System.out.println(num2 + " < " + num3 + " < " + num1);
            }    
        }else if ((num3 <num1)&&(num3 < num2)){
            if (num1 < num2){
                System.out.println(num3 + " < " + num1 + " < " + num2);
            }else {
                System.out.println(num3 + " < " + num2 + " < " + num1);
            }
        }
    }
}
