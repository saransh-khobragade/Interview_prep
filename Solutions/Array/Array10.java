// https://www.geeksforgeeks.org/replace-every-array-element-by-multiplication-of-previous-and-next/
import java.util.*;

public class Array10 {

    static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static int[] multiplyNeighbour(int[] arr){
        int[] res = new int[arr.length];
        int f,b;
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
              f = i;
              b = i + 1;
            } else if(i == arr.length - 1) {
              b = i;
              f = i - 1;
            }else {
              b = i + 1;
              f = i - 1;
            }
            res[i] =  arr[f] * arr[b];
        }
        return res;
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
        int[] res = multiplyNeighbour(arr);
        printArray(res);
        sc.close();
    }

}
