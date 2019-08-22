// https://www.geeksforgeeks.org/rearrange-characters-string-no-two-adjacent/
import java.util.*;
//import java.io.*;

class KeyComparator implements Comparator<Key> {

  public int compare(Key key1, Key key2){
      if(key1.freq < key2.freq)
          return 1;
      else if(key1.freq > key2.freq)
          return -1;
      else
          return 0;
  }
}

class Key {
  int freq;
  char ch;
  Key(int freq, char ch){
    this.freq = freq;
    this.ch = ch;
  }
}


public class String2 {
    // static String rearrangeCharacter(String input){
    //   StringBuilder temp = new StringBuilder(input);
    //   for(int i = 0; i < input.length() - 1; i++){
    //       if(input.charAt(i) == input.charAt(i+1)) {
    //           for(int j = i+2; j < input.length(); j++){
    //               if(input.charAt(i) != input.charAt(j)) {
    //                   temp.setCharAt(i+1, input.charAt(j));
    //                   temp.setCharAt(j, input.charAt(i+1));
    //                   input = temp.toString();
    //                   break;
    //               }
    //           }
    //       }
    //   }
    //   return input;
    // }

    static String rearrangeCharacter(String input){
        int[] count = new int[26];

        for(int i = 0; i < input.length(); i++){
            count[input.charAt(i) - 'a']++;
        }

        PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());

        for(char c = 'a'; c <= 'z'; c++){
            if(count[c - 'a'] > 0)
              pq.add(new Key(count[c - 'a'], c));
        }

        String str = "";
        Key prev = new Key(-1, '*');
        while(pq.size() != 0) {

            Key k = pq.poll();
            str += k.ch;

            if(prev.freq > 0)
              pq.add(prev);

            (k.freq)--;
            prev = k;
        }

        if(input.length() != str.length())
          return "Not possible";
        else
            return str;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine();
        System.out.println(rearrangeCharacter(input));
        sc.close();
    }
}
