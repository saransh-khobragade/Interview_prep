// https://www.geeksforgeeks.org/recursive-function-check-string-palindrome/
import java.util.*;

public class String11 {
    static boolean isPallindrome(String str, int i, int j) {
        if(i >= j)
          return true;
        else {
          if(str.charAt(i) == str.charAt(j)) {
              return isPallindrome(str, i + 1, j - 1);
          }
          else
           return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPallindrome(str, 0, str.length() - 1));
    }

}
