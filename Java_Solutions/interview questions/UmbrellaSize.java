//return -1 is no umberalla(s) can fit n people otherwise return min number of umbrella required
import java.util.*;

public class UmbrellaSize{
  static int umberlla(int n, List<Integer> p){
      Collections.sort(p);
      int min = -1;
      int count = 0;
      int tempSum = 0;
      int k = 0;
      for(int i = 0; i < p.size(); i++){
        tempSum = p.get(i);
        count = 1;
        if(tempSum == n){
            return 1;
        } else if(tempSum < n){
            for(int j = i+1; j < p.size(); j++){
                if(tempSum + p.get(j) <= n){
                    if(count == 1)
                      k=j;
                    tempSum += p.get(j);
                    count++;
                    if(tempSum == n){
                        if(min == -1 || min > count)
                          min = count;
                        tempSum = p.get(i);
                        count = 1;
                        j = k;
                        continue;
                    }

                } else{
                    if(count > 1)
                      j = k;
                    tempSum = p.get(i);
                    count = 1;

                }
            }
        }
      }
      return min;
  }
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of people: ");
      int n = sc.nextInt();
      System.out.println("Number of umberlla size available: ");
      int num = sc.nextInt();
      List<Integer> p = new ArrayList<>();
      for(int i = 0; i < num; i++){
          p.add(i,sc.nextInt());
      }

      System.out.println("For "+n+":"+umberlla(n, p));
      sc.close();

      //test case
      // List<Integer> p = new ArrayList<>();
      // p.add(0,1);
      // p.add(1,2);
      // p.add(2,3);
      // p.add(3,4);
      // p.add(4,6);
      // System.out.println("For 1:"+umberlla(1, p));
      // System.out.println("For 2:"+umberlla(2, p));
      // System.out.println("For 3:"+umberlla(3, p));
      // System.out.println("For 4:"+umberlla(4, p));
      // System.out.println("For 5:"+umberlla(5, p));
      // System.out.println("For 6:"+umberlla(6, p));
      // System.out.println("For 7:"+umberlla(7, p));
      // System.out.println("For 8:"+umberlla(8, p));
      // System.out.println("For 9:"+umberlla(9, p));
      // System.out.println("For 10:"+umberlla(10, p));
      // System.out.println("For 11:"+umberlla(11, p));
      // System.out.println("For 12:"+umberlla(12, p));
      // System.out.println("For 13:"+umberlla(13, p));
      // System.out.println("For 14:"+umberlla(14, p));
      // System.out.println("For 15:"+umberlla(15, p));
      // System.out.println("For 16:"+umberlla(16, p));
      // System.out.println("For 17:"+umberlla(17, p));
      // System.out.println("For 18:"+umberlla(18, p));
      // System.out.println("For 19:"+umberlla(19, p));

  }


}
