//reverse phrase without reversing words
import java.util.*;

class ReversePhrase{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = Integer.parseInt(sc.nextLine());
      while(t --> 0){
          String[] words = sc.nextLine().split("[.]");	// [.] this is regex
//	      String[] words = sc.nextLine().split("\\.");	this will also work. Dot is an escaped character
          String temp;
          int size = words.length;
          if(size > 0) {
              for(int i = 0; i < size/2; i++){
                  temp = words[i];
                  words[i] = words[size - 1 - i];
                  words[size - 1 - i] = temp;
              }
              for(int i = 0; i < size-1; i++){
                  System.out.print(words[i]+".");
              }
             System.out.println(words[size - 1]);
          } else
              System.out.println("Nothing to print");
      }
  }
}
