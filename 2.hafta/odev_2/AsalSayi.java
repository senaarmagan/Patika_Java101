package pratik_5;

import java.util.Scanner;

/**
"Recursive" metot kullanarak, kullanıcıdan alınan sayının 
"Asal" sayı olup olmadığını bulan program
*/
public class AsalSayi {
    static boolean AsalMi(int num,int counter){
        if(num <= 1 ){
            return false;
        }
        if(num == 2 ){
            return true;
        }
        if(num % counter == 0){
            return false;
        }
        if(counter * counter > num){
            return true;
        } 
        
        return AsalMi(num, counter +1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sayı yazınız: ");
        int num = s.nextInt();
        
        if(AsalMi(num,2)){
            System.out.println(num + " asal sayıdır");
            
        }else{
            System.out.println(num + " asal sayı değildir");
        }
    }
}
