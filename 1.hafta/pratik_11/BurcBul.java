package pratik_11;

import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
       //Burçları Bulma 
       String month;
       int day;
       boolean isError = false;
       
       Scanner s = new Scanner(System.in);
        System.out.print("Ay yaz: ");
        month = s.nextLine();
        System.out.print("Günü yaz: ");
        day = s.nextInt();
        
        if(month.equalsIgnoreCase("Ocak")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 22) {
                    System.out.println("Oğlak Burcu");
                }else {
                    System.out.println("Kova Burcu");
                }
            }
        
        }else if (month.equalsIgnoreCase("Şubat")) {
            if((day >=1) && (day <= 29 )) {
                if(day < 20) {
                    System.out.println("Kova Burcu");
                }else {
                    System.out.println("Balık Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Mart")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 21) {
                    System.out.println("Balık Burcu");
                }else {
                    System.out.println("Koç Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Nisan")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 21) {
                    System.out.println("Koç Burcu");
                }else {
                    System.out.println("Boğa Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Mayıs")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 23) {
                    System.out.println("Boğa Burcu");
                }else {
                    System.out.println("İkizler Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Haziran")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 23) {
                    System.out.println("İkizler Burcu");
                }else {
                    System.out.println("Yengeç Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Temmuz")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 23) {
                    System.out.println("Yengeç Burcu");
                }else {
                    System.out.println("Aslan Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Ağustos")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 23) {
                    System.out.println("Aslan Burcu");
                }else {
                    System.out.println("Başak Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Eylül")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 23) {
                    System.out.println("Başak Burcu");
                }else {
                    System.out.println("Terazi Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Ekim")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 23) {
                    System.out.println("Terazi Burcu");
                }else {
                    System.out.println("Akrep Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Kasım")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 22) {
                    System.out.println("Akrep Burcu");
                }else {
                    System.out.println("Yay Burcu");
                }
            }
        }else if (month.equalsIgnoreCase("Aralık")) {
            if((day >=1) && (day <= 31 )) {
                if(day < 22) {
                    System.out.println("Yay Burcu");
                }else {
                    System.out.println("Oğlak Burcu");
                }
            }
        
      
        }else {
            System.out.println("Hatalı işlem...");
        }
    }
}
