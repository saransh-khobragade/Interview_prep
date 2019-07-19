// https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
import java.util.*;

public class Array9 {

    static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void quickSort(int[] arr, int l, int h){
        int index;
        if(l < h){
            index = partition(arr, l, h);
            quickSort(arr, l, index-1);
            quickSort(arr, index+1, h);
        }
    }

    static int partition(int[] arr, int l, int h){
        int index = (l+h)/2;
        int i = l; int j = h;
        while(i < j){
            while(arr[i] > arr[index] && i < j){
              i++;
            }
            while(arr[j] <= arr[index] && i < j){
              j--;
            }
            if(i < j){
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        if(index != j) {
          arr[index] = arr[index] + arr[j];
          arr[j] = arr[index] - arr[j];
          arr[index] = arr[index] - arr[j];
        }
        return j;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, size-1);
        printArray(arr);
        sc.close();
    }

}
