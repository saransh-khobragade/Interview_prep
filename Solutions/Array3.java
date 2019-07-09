//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
import java.util.*;

public class Array3{

  static int findRotate(int[] arr) {
		int i = 0;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				break;
		}
    if(i+1 == arr.length)
      return 0;
    else
      return i+1;
  }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter size of array");
      int size = sc.nextInt();
      System.out.println("Enter elements");
      int[] arr = new int[size];
      for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
      }
      int rotates = findRotate(arr);
      System.out.println("Array rotated "+rotates+" times");
      sc.close();

    }
}
