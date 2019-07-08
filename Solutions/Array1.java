//Rotation of array - https://www.geeksforgeeks.org/array-rotation/

import java.util.*;

public class Array1{
  static void printArray(int[] arr) {
  		for (int i = 0; i < arr.length; i++) {
  			System.out.print(arr[i] + " ");
  		}
  	}

  	static int[] rotateArray(int[] arr, int n) {
  		int i = 0, p = 0;
  		i += n;
  		int[] newArr = new int[arr.length];
  		while (p < arr.length) {
  			newArr[i] = arr[p];
  			if (i + 1 == arr.length) {
  				i = 0;
  			} else
  				i++;
  			p++;
  		}
  		return newArr;
  	}

  	public static void main(String args[]) {
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter size of array");
  		int size = sc.nextInt();
  		System.out.println("Enter elements");
  		int[] arr = new int[size];
  		for (int i = 0; i < size; i++) {
  			arr[i] = sc.nextInt();
  		}
  		System.out.println("Rotate Array by:");
  		int n = sc.nextInt();
  		int[] newArr = rotateArray(arr, n);
  		printArray(newArr);
  		System.out.println();
  		sc.close();
  	}
}
