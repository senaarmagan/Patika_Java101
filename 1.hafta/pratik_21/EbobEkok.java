package pratik_21;
 
import java.util.Scanner;

/**
Java ile iki sayının EBOB ve EKOK değerlerini bulan program.
*/
public class EbobEkok {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int number1, number2 ;
        int i = 1; int ebob=1;
        
        System.out.print("1.Sayıyı Yazınız: ");
        number1 = s.nextInt();
        System.out.print("2.Sayıyı Yazınız: ");
        number2 = s.nextInt();
        
        while(i <= number1 && i <= number2){
            if(number1 % i == 0 && number2 % i == 0){
                ebob = i;
            }
            i++;       
        }   
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ((number1*number2)/ebob));
    }
}
