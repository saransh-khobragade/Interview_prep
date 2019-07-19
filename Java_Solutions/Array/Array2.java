//find pair sum in rotated array - find the pair of element(s) exist whose sum is equal to x
import java.util.Scanner;

public class Array2 {

	static void findSum(int[] arr, int sum) {
		int i = 0;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				break;
		}
		int r = i;
		int l = (i + 1) % arr.length;
		while (l != r) {
			if (arr[l] + arr[r] == sum)
				System.out.println("Found pair (" + arr[r] + "," + arr[l] + ") at indexes (" + (r + 1) + ", " + (l + 1)
						+ ") with sum " + sum);
			if (arr[l] + arr[r] > sum)
				r = (arr.length + r - 1) % arr.length;
			else
				l = (l + 1) % arr.length;
		}
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
		System.out.println("Enter sum");
		int sum = sc.nextInt();
		findSum(arr, sum);
		sc.close();
	}
}
