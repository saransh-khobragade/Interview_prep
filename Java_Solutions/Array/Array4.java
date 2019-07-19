// https://www.geeksforgeeks.org/rearrange-array-arri/
import java.util.*;

public class Array4 {
  static int[] reArrangeArray(int[] arr){
      int[] a = new int[arr.length];
      for(int i = 0; i < arr.length; i++){
          a[i] = -1;
      }
      for(int i = 0; i < arr.length; i++){
          if(arr[i] != -1){
              a[arr[i]] = arr[i];
          }
      }
      return a;
  }

  static void printArray(int[] a){
      for(int i = 0; i < a.length; i++){
          System.out.print(a[i] + " ");
      }
      System.out.println();
  }

  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size = sc.nextInt();
      System.out.println("Enter elements");
      int[] arr = new int[size];
      for(int i = 0; i < size; i++){
          arr[i] = sc.nextInt();
      }
      int a[] = reArrangeArray(arr);
      printArray(a);
      sc.close();

  }
}
