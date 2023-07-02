package pratik_9;

import java.util.Arrays;

public class TekrarEdenÇiftSayilar {
    public static void main(String[] args) {
        int[] list = {0,8,2,5,4,2,7,4,8,7};
        int [] duplicate = new int[list.length];
        int startIndex=0;
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(list[i]%2==0){
                    if((i !=j) && (list[i] == list[j])) {
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
                
            }
            
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
