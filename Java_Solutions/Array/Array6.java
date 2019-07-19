// https://www.geeksforgeeks.org/rearrange-positive-and-negative-numbers-publish/
// Alternate negative and positive numbers rearrange
import java.util.*;

public class Array6{

  static void rearrangeArray(int[] arr){
    int index = 0;
    int size = arr.length;
    for(int i = 0; i < size; i++){
      index = 0;
        if(i % 2 == 0 && arr[i] >= 0){
            index = -1;
            for(int j = i+1; j < size; j++){
                if(arr[j] < 0){
                  index = j;
                  arr[i] = arr[i] + arr[j];
                  arr[j] = arr[i] - arr[j];
                  arr[i] = arr[i] - arr[j];
                  break;
                }
            }
        } else if(i % 2 != 0 && arr[i] < 0){
            index = -1;
            for(int j = i+1; j < size; j++){
                if(arr[j] > 0){
                  index = j;
                  arr[i] = arr[i] + arr[j];
                  arr[j] = arr[i] - arr[j];
                  arr[i] = arr[i] - arr[j];
                  break;
                }
            }
        }
        if(index == -1)
          break;
    }
  }
  static void printArray(int[] a){
      for(int i = 0; i < a.length; i++){
          System.out.print(a[i] + " ");
      }
      System.out.println();
  }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the Array: ");
        int size = sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        rearrangeArray(arr);
        printArray(arr);
    }
}
