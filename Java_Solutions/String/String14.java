// https://www.geeksforgeeks.org/find-maximum-depth-nested-parenthesis-string/
import java.util.*;

public class String14 {
    static int checkParaenthesis(String str) {
        Stack<Character> stk = new Stack<>();
        int max = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(')
              stk.push('(');
            else if(str.charAt(i) == ')') {
              if(!stk.isEmpty() && stk.peek() == '('){
                  if(max < stk.size())
                    max = stk.size();
                  stk.pop();

              }
              else
                return -1;
            }
        }
        if(!stk.isEmpty())
            return -1;
        else
            return max;

    }
    public static void main(String ards[]) {
      Scanner sc =  new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(checkParaenthesis(str));
    }

}
