//top view of Tree tree
import java.util.*;
class Tree {
  int value;
  Tree left;
  Tree right;
  Tree(int value) {
    this.value = value;
  }
}

public class ViewBinaryTree {
  static Map<Integer, Integer> lookup = new LinkedHashMap<>();

	static void topView(Tree root, int level) {
		if (root != null) {
      if(!lookup.containsKey(level)){
          lookup.put(level, root.value);
      }
			topView(root.left, level-1);
			topView(root.right, level+1);
		}
	}

  static void leftView(Tree root, int level) {
		if (root != null) {
      if(!lookup.containsKey(level)){
          lookup.put(level, root.value);
      }
			leftView(root.left, level+1);
			leftView(root.right, level+1);
		}
	}

  static void rightView(Tree root, int level) {
    if (root != null) {
      if(!lookup.containsKey(level)){
          lookup.put(level, root.value);
      }
      rightView(root.right, level+1);
      rightView(root.left, level+1);
    }
  }

  static void bottomView(Tree root, int level) {
    if (root != null) {
      bottomView(root.right, level-1);
      bottomView(root.left, level+1);
      if(!lookup.containsKey(level)){
          lookup.put(level, root.value);
      }
    }
  }

	public static void main(String[] args) {
		Tree root = new Tree(1);
		root.left = new Tree(2);
		root.right = new Tree(3);
		root.right.right = new Tree(4);
		root.left.left = new Tree(5);
    if(root != null) {
		  bottomView(root, 0);
    }
    for(Integer e : lookup.keySet())
			System.out.println(lookup.get(e));
  }
}
