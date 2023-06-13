package pratik_1;

public class Pratik_1 {
    public static String Palindrom(int  number){
        String num= String.valueOf(number);
        char[] charNum= num.toCharArray();
        for (int i = 0; i < num.length();) {
            if(charNum[i]==charNum[num.length()-1-i]){
                return number + " Sayısı palindrom";
            }else {
                return number + " Sayısı palindrom değildir";
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Palindrom(2547));
        System.out.println(Palindrom(454));
    }
    
}