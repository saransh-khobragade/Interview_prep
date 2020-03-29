//Top view of the binary tree

class Node {
  char value;
  Node left;
  Node right;
  Node(char a){
    this.value = a;
  }
}

static void preorder(Node root) {
  if(root != null){
      System.out.println(root.value);
      preorder(root.left);
      preorder(root.right);
  }

}

class TopView {
    public static void main(String args[]) {
      Node n1 = new Node('a');
      Node n2 = new Node('b');
      Node n3 = new Node('c');
      n1.left = n2;
      n1.right = n3;
      Node n4 = new Node('d');
      Node n5 = new Node('e');
      n2.left = n4;
      n2.right = n5;
      Node n6 = new Node('f');
      Node n7 = new Node('g');
      n3.left = n6;
      n3.right = n7;
      Node n8 = new Node('h');
      Node n9 = new Node('i');
      n4.left = n8;
      n4.right = n9;
      Node n10 = new Node('j');
      Node n11 = new Node('k');
      n5.left = n10;
      n5.right = n11;
      Node n12 = new Node('l');
      Node n13 = new Node('m');
      n6.left = n12;
      n6.right = n13;
      Node n14 = new Node('n');
      Node n15 = new Node('o');
      n7.left = n14;
      n7.right = n15;

      Map<Integer, Node> ans = new HashMap<>();
      ans.put(0, n1);
    }
}
