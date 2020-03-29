//find middle element in linked List
import java.util.*;
class LinkedList{
  Node head;
  class Node{
    int value;
    Node next;
    Node(int value){
      this.value = value;
      this.next = null;
    }
  }
  public void add(int value){
      Node n = new Node(value);
      Node cur = this.head;
      if(cur == null)
        this.head = n;
      else {
          while(cur.next != null)
            cur = cur.next;
          cur.next = n;
      }
  }
  public int print(int index){
    Node cur = this.head;

    for(int i = 1; cur != null && i < index; i++, cur = cur.next){}
    return cur.value;
  }
}

class FindMiddleElement{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int N = sc.nextInt();
            int mid = N/2 + 1;
            LinkedList list = new LinkedList();
            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }
            System.out.println(list.print(mid));
        }
    }
}
