import java.util.Stack;

public class ReverseStack {

	static void popFromStack(Stack<Integer> stk, int i) {
		if(i < stk.size() - 1) {
			pushToStack(stk, stk.pop(), i);
			popFromStack(stk, i+1);
		}
	}

	static void pushToStack(Stack<Integer> stk, int top, int i) {
		int cur;
		if (stk.size() == i)
			stk.add(top);
		else if(stk.size() > i) {
			cur = stk.pop();
			pushToStack(stk, top, i);
			stk.add(cur);
		}

	}

	public static void main(String args[]) {
		Stack<Integer> stk = new Stack<>();
		stk.add(1);
		stk.add(2);
		stk.add(3);
		stk.add(4);
		popFromStack(stk, 0);
		System.out.println(stk);
	}

}
