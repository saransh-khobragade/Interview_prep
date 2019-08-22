// https://www.geeksforgeeks.org/minimum-number-deletions-make-string-palindrome/
import java.util.*;

public class String17{
    static int minDelPalindrome(String str) {
        int count = 0; int min = 0, p=0;
        int r = -1;
        for(int i=0; i < str.length(); i++){
            p=i;
            count = 0;
            r = -1;
            for(int j = str.length() - 1; j > p; j--){
                if(str.charAt(p) == str.charAt(j)){
                    count += 2;
                    r = j;
                    p++;
                }
                if (p >= j - 1 && r >= p+1){
                    count++;
                }
            }
            if(min < count)
              min = count;
        }

        return str.length() - min;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println(minDelPalindrome(str));
        sc.close();

    }

}
