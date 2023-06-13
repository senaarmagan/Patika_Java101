package pratik_3;

import java.util.Scanner;

public class Calculator {
    static void toplama() {
        Scanner s =new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int counter = s.nextInt();
        int number, result=0;
        for (int i = 1; i <=counter; i++) {
            System.out.println(i+". sayi");
            number=s.nextInt();
            if(i==1) {
                result +=number;
                continue;
        }
            result += number;
            }
        System.out.println("Sonuç: " + result);
    }
    static void cikarma() {
        Scanner s=new Scanner(System.in);
        System.out.println("Kaç adet sayı girilecek: ");
        int counter  =s.nextInt();
        int number, result=0;
        for (int i = 1; i <=counter; i++) {
            System.out.println(i+". sayı: ");
            number = s.nextInt();
            if(i==1) {
                result += number;
                continue ;
            }
            result -= number;
        }
        System.out.println("sonuç: " + result);
    }
    static void carpma(){
        Scanner s=new Scanner(System.in);
        System.out.println("Kaç adet sayı girilecek: ");
        int counter  =s.nextInt();
        int number, result=0;
        for (int i = 1; i <=counter; i++) {
            System.out.println(i+". sayı: ");
            number = s.nextInt();
            if(i==1) {
                result += number;
                continue ;
    }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void bolme(){
        Scanner s=new Scanner(System.in);
        System.out.println("Kaç adet sayı girilecek: ");
        int counter  =s.nextInt();
        double number, result=0.0;
        for (int i = 1; i <=counter; i++) {
            System.out.println(i+". sayı: ");
            number = s.nextInt();
            if(i != 1 && number == 0) {
                System.out.println("Bölen 0 olamaz...");
                break;
            }if(i==1){
                result += number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void usAlma() {
        Scanner s = new Scanner(System.in);
        System.out.print("Taban değerini yazınız :");
        int base = s.nextInt();
        System.out.print("Üs değerini yazınız :");
        int exponent = s.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
     static void faktoriyel() {
        Scanner s = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number = s.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
      static void modAlma() {
        Scanner s = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz :");
        int n1 = s.nextInt();
        System.out.print("2.Sayıyı giriniz :");
        int n2 = s.nextInt();

        System.out.println("Sonuç : " + n1%n2);
    }
    static void DikdortgenAlani() {
        Scanner s = new Scanner(System.in);
        System.out.print("Uzun kenarı yazınız :");
        int n1 = s.nextInt();
        System.out.print("Kısa kenarı yazınız: :");
        int n2 = s.nextInt();

        System.out.println("Dikdörtgen Alanı : " + n1*n2);
        System.out.println("Dikdörtgen Çevresi : " + (2*(n1+n2)));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    DikdortgenAlani();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}

