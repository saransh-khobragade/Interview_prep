package amazon;

public class GCD {

	static int findGCD(int a, int b) {
		if (b == 0)
			return a;
		return a > b ? findGCD(b, a % b) : findGCD(a, b % a);
	}

	public static int generalizedGCD(int num, int[] arr) {
		int res = arr[0];
		for (int i = 1; i < num; i++) {
			res = findGCD(res, arr[i]);
		}
		return res;
	}

	public static void main(String[] a) {
		int[] input = { 4, 12, 24, 6 };
		System.out.print(generalizedGCD(4, input));
	}
}
