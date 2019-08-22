// https://www.geeksforgeeks.org/program-find-smallest-largest-word-string/
import java.util.*;

public class String9{

    static void findSmallestLargestWord(String str){
      String[] strList = str.split(" ");
      int min = 0, max = 0;
      for(int i = 1; i < strList.length; i++) {
          if(strList[min].length() > strList[i].length())
            min = i;
          if(strList[max].length() < strList[i].length())
            max = i;
      }
      System.out.println("Smallest word: "+strList[min]);
      System.out.println("Largest word: "+strList[max]);
    }
    public static void main(String args[]) {
      Scanner sc =  new Scanner(System.in);
      System.out.println("Enter String: ");
      String str = sc.nextLine();
      findSmallestLargestWord(str);
      sc.close();
    }
}
