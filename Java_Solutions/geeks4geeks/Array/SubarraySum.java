//find continuos subarray which has sum S
import java.util.*;

class SubarraySum{

  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t --> 0){
          int N = sc.nextInt();
          int S = sc.nextInt();
          int[] arr = new int[N];
          for(int i = 0; i < N; i++)
              arr[i] = sc.nextInt();

          int temp = 0;
          int low = 0, j, high = -1;
          for(int i = 0; i < N; i++){
              temp = arr[i];
              if(temp == S){
                low = high = i+1;
                break;
              } else if (temp < S){
                  low = i + 1;
                  for(j = i+1; j < N & temp < S; j++){
                      temp += arr[j];
                  }
                  if(temp == S){
                    high = j;
                    break;
                  }
              }
          }
          if(high == -1)
            System.out.println(high);
          else
            System.out.println(low+" "+high);
      }
  }
}
