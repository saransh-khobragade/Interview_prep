// https://www.geeksforgeeks.org/minimum-swaps-required-bring-elements-less-equal-k-together/
import java.util.*;

public class Array7{

    static int minSwapCount(int arr[], int k) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= k)
              count++;
        }
        int[] counts = new int[arr.length - count + 1];
        int swaps = 0;
        for(int i = 0; i < arr.length - count + 1; i++){
            swaps = 0;
            for(int j = i; j < i+count; j++){
                if(arr[j] > k)
                  swaps++;
            }
            counts[i] = swaps;
        }
        swaps = 0;
        for(int i = 0; i < counts.length; i++){
              if(counts[i] < counts[swaps])
                  swaps = i;
        }
        return counts[swaps];
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
        System.out.println("Enter element k: ");
        int k = sc.nextInt();
        System.out.println("Minmum swaps required "+minSwapCount(arr, k));

    }
}
