// https://www.geeksforgeeks.org/second-repeated-word-sequence-python/
import java.io.*;
import java.util.*;

class WordComparator implements Comparator<WordFreq> {

  public int compare(WordFreq w1, WordFreq w2) {
      if(w1.freq < w2.freq)
        return 1;
      else if(w1.freq > w2.freq)
        return -1;
      else
        return 0;
  }
}

class WordFreq{
  String word;
  int freq;
  WordFreq(String word, int freq){
    this.word = word;
    this.freq = freq;
  }
}

public class String6{

    static void findSecondLargest(String str) {
      String[] strList = str.split(" ");
      Map<String, Integer> freq = new LinkedHashMap<>();
      for(int i = 0; i < strList.length; i++){
          if(freq.containsKey(strList[i])){
              freq.replace(strList[i], freq.get(strList[i])+1);
          } else
            freq.put(strList[i], 1);
      }

      PriorityQueue<WordFreq> pq = new PriorityQueue<>(new WordComparator());
      for (String name : freq.keySet()){
          pq.add(new WordFreq(name, freq.get(name)));
      }
      int i=0;
      WordFreq res = null;
      while(pq.size() != 0 && i < 2){
        res = pq.poll();
        i++;
      }
    if(res != null)
      System.out.println("result "+res.word +" "+res.freq);
    else
      System.out.println("result not found");
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        findSecondLargest(str);
        br.close();
    }

}
