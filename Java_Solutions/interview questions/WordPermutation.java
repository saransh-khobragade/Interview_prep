//Word Permutation using recurssion
import java.util.*;
public class WordPermutation {

  static Set<String> res = new HashSet<>();

  static void findPerm(String str, int l, int r){
      if(res.size() >= 6)
        return;
      if(l == r ){
          System.out.println(str);
          res.add(str);
      } else {
        for(int i = l; i <= r; i++){
            str = swap(str, i, l);
            findPerm(str, l+1, r);
            str = swap(str, i, l);
        }
      }
  }

  static String swap(String a, int i, int j) {
    char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
  }

  public static void main(String RGA[]){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      findPerm(str, 0, str.length()-1);
      sc.close();
  }
}
