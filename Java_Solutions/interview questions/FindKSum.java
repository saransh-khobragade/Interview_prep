//find k max sum (one element from each array) from 2 array
import java.util.*;
public class FindKSum{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");
        int size = Integer.parseInt(num[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < size; i++){
          for(int j = 0; j < size; j++){
              pq.add(Integer.parseInt(a[i]) + Integer.parseInt(b[j]));
          }
        }

        for(int i = 0; i < Integer.parseInt(num[1]); i++){
            System.out.print(pq.remove()+" ");
        }

    }
}
