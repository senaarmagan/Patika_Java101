package pratik_20;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String userName, password;
        int right =3;
        int balance =1500;
        int select;
        int price;
        
        while(right > 0) {
            System.out.print("Kullanıcı Adınız:  ");
            userName = s.nextLine();
            System.out.print("Şifreniz: ");
            password = s.nextLine();
            
            if(userName.equals("patika") && password.equals("java123")){
                System.out.println("Merhaba, Patika Bankasına Hoşgeldiniz...");
            
                do {
                    System.out.println("1-Para yatırma\n" +
                                        "2-Para Çekme\n" +
                                        "3-Bakiye Sorgula\n" +
                                        "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = s.nextInt();  
                    
                    switch(select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = s.nextInt();
                            balance += price;
                        break;    
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = s.nextInt();
                                if (price > balance) {
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                    balance -= price;
                                }
                            break;    
                        case 3:  
                            System.out.println("Bakiyeniz : " + balance);
                        break;    
                    }
                }while(select !=4);
                    System.out.println("Tekrar görüşmek üzere...");
                break;    
            }else {
                right -- ;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyiniz: ");
                if(right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz...");    
                }else {
                    System.out.println("Kalan Hakkınız: " + right);
                    
                }
            }
        }
    }
    
}
