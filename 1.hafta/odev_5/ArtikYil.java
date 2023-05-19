
package odev_5;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        
        int year ;
        Scanner s=new Scanner(System.in);
        
        System.out.print("Please Write a year: ");
        year = s.nextInt();
        
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println( year + " is a Leap Year !");
                
            } else {
                System.out.println( year + " is not a Leap Year !");
            }
        } else if (year % 4 == 0) {
            System.out.println( year + " is a Leap Year !");
        } else {
            System.out.println( year + " is not a Leap Year !");
        }
    }
}
