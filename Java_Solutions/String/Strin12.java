// https://www.geeksforgeeks.org/convert-string-binary-sequence/
import java.util.*;

public class Strin12{
    public static void main(String argd[]){
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i < str.length(); i++) {
            int num = str.charAt(i)+0;
            int[] bin = {0,0,0,0,0,0,0,0};
            int j=0;
            while(num > 0){
                bin[j]= num % 2;
                num = num/2;
                j++;
            }
            for(int k = 7; k >=0; k--)
              System.out.print(bin[k]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
