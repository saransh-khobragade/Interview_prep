
public class TreeHeightPleasing {
	private static boolean isPleasing(int[] arr) {
		if (arr[0] > arr[1]) {
			boolean flag = true;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] == arr[i - 1])
					return false;
				if (i % 2 == 0) {
					if (arr[i] > arr[i - 1]) {
						if (flag)
							return false;
						else
							flag = true;
					} else
						return false;
				} else {
					if (arr[i] < arr[i - 1]) {
						if (!flag)
							return false;
						else
							flag = false;
					} else
						return false;
				}
			}
		} else {
			boolean flag = false;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] == arr[i - 1])
					return false;
				if (i % 2 == 0) {
					if (arr[i] < arr[i - 1]) {
						if (!flag)
							return false;
						else
							flag = false;
					} else
						return false;
				} else {
					if (arr[i] > arr[i - 1]) {
						if (flag)
							return false;
						else
							flag = true;
					} else
						return false;
				}

			}
		}
		return true;
	}

	public static int solution(int[] A) {
		int ans = 0;
		if (A.length <= 2)
			return ans;
		else if (isPleasing(A))
			return ans;
		else {
			int[] temp = new int[A.length - 1];

			for (int i = 0; i < A.length; i++) {
				int p = 0;
				for (int j = 0; j < A.length; j++) {
					if (j == i) {
						continue;
					}
					temp[p] = A[j];
					p++;
				}
				if (isPleasing(temp))
					ans++;
			}
		}
		if (ans == 0)
			return -1;
		else
			return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 3, 6, 4, 1, 5 };
		System.out.print(solution(arr));

	}

}
