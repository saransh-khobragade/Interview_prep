package amazon;

class Binary
{
	int value;
	Binary left;
	Binary right;

	Binary(int value) {
		this.value = value;
	}
}

public class MirrorBinaryTree {

	static void mirror(Binary root) {
		if (root != null) {
			mirror(root.left);
			mirror(root.right);
			Binary temp = root.left;
			root.left = root.right;
			root.right = temp;
		}
	}

	public static void main(String[] args) {
		Binary root = new Binary(1);
		root.left = new Binary(2);
		root.right = new Binary(3);
		root.right.left = new Binary(4);
		root.left.left = new Binary(5);
		mirror(root);
		System.out.println(root.value);
		System.out.println(root.left.value);
		System.out.println(root.right.value);
		System.out.println(root.left.left);
		System.out.println(root.left.right.value);
		System.out.println(root.right.left);
		System.out.println(root.right.right.value);

	}

}
