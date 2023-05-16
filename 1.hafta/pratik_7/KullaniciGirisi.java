package pratik_7;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String password, accountName,select,newPassword;
        
        
        Scanner s= new Scanner(System.in);
        
        System.out.print("Kullanıcı adınızı yazınız: ");
        accountName = s.nextLine();
        System.out.print("Şifrenizi yazınız: ");
        password = s.nextLine();
        
        if (password.equals("java+123") && accountName.equals("patika")) {
            System.out.println("Başarılı giriş yaptınız....");
        }
        if (!(password.equals("java+123")) && accountName.equals("patika")) {
            System.out.println("Şifre Hatalı. Şifreyi sıfırlamak ister misiniz ? ");
            System.out.println("1: Şifreyi değiştir \n2: Şifreyi değiştirme");
            select = s.nextLine();
        
            if (select.equals("1")){
                System.out.print("Yeni şifreyi yazınız: ");
                newPassword = s.nextLine();
                
                if( newPassword.equals("java+123")){    
                    System.out.println("Şifre oluşturulamadı.Tekrar yazınız."); 
                }
                else {
                    System.out.println("Yeni Şifre Oluşturuldu");
                }    
            }else if (select.equals("2")) {
                System.out.println("Şifreyi değiştirmek istemediniz.");
            }
        }
    }
}    