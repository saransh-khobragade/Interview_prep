package amazon;

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}

}

public class IntersectingLL {

	static int findIntersection(Node l1, Node l2, int l1Size, int l2Size) {
		int ans = -1;
		int cnt = 1;
		if (l1Size < l2Size) {
			return findIntersection(l2, l1, l2Size, l1Size);
		}
		while (cnt < l1Size - l2Size + 1) {
			l1 = l1.next;
			cnt++;
		}
		while (l2.next != null && !l1.next.equals(l2.next)) {
			l1 = l1.next;
			l2 = l2.next;
		}
		if (l2.next != null) {
			ans = l2.next.value;
		}

		return ans;
	}

	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(6);
		head.next.next = new Node(7);
		head.next.next.next = new Node(8);
		head.next.next.next.next = new Node(9);
		head.next.next.next.next.next = new Node(10);

		Node tail = new Node(1);
		tail.next = new Node(2);
		tail.next.next = new Node(3);
//		tail.next.next.next = head.next.next.next.next;

		System.out.println(findIntersection(tail, head, 3, 6));
	}
}
