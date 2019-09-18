// Find a pair whose sum is equal to given sum input in a sorted array
import java.io.*;
import java.util.*;

public class FindPair {
    static boolean appraoch1(int[] arr, int sum){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if(arr[i] + arr[j] == sum)
                  return true;
            }
        }
        return false;
    }

    static boolean appraoch2(int[] arr, int sum) {
        int size = arr.length;
        int low = 0;
        int high = size - 1;
        int mid = 0;
        int comp = 0;
        for(int i = 0; i < size; i++){
            low = i+1;
            comp = sum - arr[i];
            // binary search
            while(low <= high){
              mid = (low+high)/2;
                if(arr[mid] == comp)
                  return true;
                else if (arr[mid] > comp){
                    high = mid - 1;
                } else
                    low = mid + 1;
            }
        }
        return false;
    }

    static boolean appraoch3(int[] arr, int sum) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            if(arr[low] + arr[high] == sum)
              return true;
            else if (arr[low] + arr[high] > sum)
              high--;
            else
              low++;
        }
        return false;
    }

    static boolean appraoch4(int[] arr, int sum){
        Set<Integer> lookup = new HashSet<>();
        int comp = 0;
        for(int i = 0; i < arr.length; i++){
          comp = sum - arr[i];
          if(lookup.contains(comp))
            return true;
          lookup.add(arr[i]);
        }
        return false;
    }


    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        boolean isSorted = Boolean.parseBoolean(br.readLine());
        if(isSorted){
          // Approach 1 : Array is sorted. Iterating over pairs to find sum - o(n^2)
          System.out.println("Approach 1 : Array is sorted. Iterating over pairs to find sum - o(n^2): "+appraoch1(arr, sum));
          // Approach 2: Array is sorted. Searching a compliment value in rest of the array - o(nlog n)
          System.out.println("Approach 2: Array is sorted. Searching a compliment value in rest of the array - o(nlog n): "+appraoch2(arr, sum));
          // Approach 3: Array is sorted. Adding low and high pointer and move the pointer to find the sum - o(n)
          System.out.println("Approach 3: Array is sorted. Adding low and high pointer and move the pointer to find the sum - o(n): "+appraoch3(arr, sum));
        } else{
          // Approach 4: Array is unsorted. Create a compliment set while reading each element and match it with sum - o(n)
          System.out.println("Array is unsorted. Create a compliment set while reading each element and match it with sum - o(n): "+appraoch4(arr, sum));
        }


        br.close();

    }

}
