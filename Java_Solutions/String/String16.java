// https://www.geeksforgeeks.org/maximum-number-characters-two-character-string/
import java.util.*;

public class String16 {
    static int charBtnString(String str) {
      int max = -1;
      for(int i = 0; i < str.length() - 1; i++){
          String[] list = str.split(Character.toString(str.charAt(i)));
          if((str.charAt(i) == str.charAt(str.length() - 1) && list.length >= 2) || list.length >= 3){
            for(int j = 1; j < list.length; j++){
                if(max < list[j].length())
                    max = list[j].length();
            }
          }
      }
      return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println(charBtnString(str));
    }
}
