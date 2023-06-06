
package pratik_19;

import java.util.Scanner;

public class ElmasCizimi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        
        System.out.print("Br sayı yazınız: ");
        num=s.nextInt();

        for(int i=1;i <=num;i++) {
            for(int j=1;j <=num-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k <=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num;i>=0;i--){
           for(int j=1;j <=num-i;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=(2*i)-1;k++){
           System.out.print("*");
           }
           System.out.println();
        }
    }
}
