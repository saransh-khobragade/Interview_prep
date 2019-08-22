// https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string
import java.util.*;

public class String5 {
    static String findSmallestWindow(String str, String pat) {
      if(str.length() < pat.length())
          return "No window found";

      int[] count_pat = new int[256];
      int[] count_str = new int[256];
      for(int i = 0; i < pat.length(); i++){
            count_pat[pat.charAt(i)]++;
      }
      int start = 0, start_with = -1, win_leng = 256, count = 0;
      for(int i = 0; i < str.length(); i++){
          count_str[str.charAt(i)]++;

          if(count_pat[str.charAt(i)] != 0 && count_pat[str.charAt(i)] >= count_str[str.charAt(i)])
            count++;
          if(pat.length() == count) {
              while(count_pat[str.charAt(start)] == 0 || count_str[str.charAt(start)] > count_pat[str.charAt(start)]){
                if(count_str[str.charAt(start)] > count_pat[str.charAt(start)])
                    count_str[str.charAt(start)]--;
                start++;
              }
              int win_size = i - start + 1;
              if(win_leng > win_size) {
                  start_with = start;
                  win_leng = win_size;
              }
              count = 0;
              count_str = new int[256];
              start = i + 1;
          }
      }
      if(start_with >= 0)
          return str.substring(start_with, start_with + win_leng);
      else
          return "No window found";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str =  sc.nextLine();
        System.out.println("Enter pattern");
        String pat = sc.nextLine();
        System.out.println(findSmallestWindow(str, pat));
        sc.close();
    }

}
