// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
import java.util.*;

public class Array5{
    static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        System.out.println("Enter elements");
        int [] arr =    new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    static void reverse(String input){
        int n  = input.length();
        String c = String.valueOf(input.charAt(n-1));
        for(int i = n-2; i >= 0; i--) {
            c += input.charAt(i);
        }
        System.out.println("Reverse of string "+c);
    }

    static void reverse(int[] arr){
      int n = arr.length;
      int[] a = new int[n];
      //reverse using new array
      for(int i = n-1; i >= 0; i--){
          a[i] = arr[n-1-i];
      }

      // reversing the input array
      int temp;
      for(int i = 0; i < n/2; i++){
          temp = arr[i];
          arr[i] = arr[n - 1 - i];
          arr[n - 1 - i] = temp;
      }
      System.out.println("Method 1:\n");
      printArray(a);
      System.out.println("Method 2:\n");
      printArray(arr);
    }

    static void printArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose 1 or 2 \n 1. Array\n 2. String");
        int opn = Integer.parseInt(sc.nextLine());
        switch(opn){
            case 1:
                int arr[] = inputArray();
                reverse(arr);
                break;
            case 2:
                String input = sc.nextLine();
                reverse(input);
                break;
            default:
                System.out.println("Wrong input!");
        }


        sc.close();
    }

}
