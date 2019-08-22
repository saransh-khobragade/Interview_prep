// https://www.geeksforgeeks.org/identify-mark-unmatched-parenthesis-expression/
//not correct
import java.util.*;

public class String13{
      static String checkParenthesis(String str){
          Stack<Character> stk = new Stack<>();
          String res = "";
          for(int i = 0; i < str.length(); i++) {
              System.out.println("char is "+str.charAt(i));
              if(str.charAt(i) == '(')
                  stk.push('(');
              else if(str.charAt(i) == '[')
                  stk.push('[');
              else if(str.charAt(i) == '{')
                  stk.push('{');
              else if(str.charAt(i) == '<')
                  stk.push('<');
              else if(str.charAt(i) == ')') {
                    res = ")" + res ;
                    System.out.println(res);
                    while(!stk.isEmpty() && (stk.peek() != '(' && stk.peek() != '[' && stk.peek() != '<' && stk.peek() != '{')){
                        res = res + Character.toString(stk.pop());
                    }
                    System.out.println(res);
                    if(!stk.isEmpty()){
                        if(stk.peek() == '(') {
                            res = res + "0";
                            res = res.replace(")", "1");
                            System.out.println(res);
                            stk.pop();

                        } else{
                            res = res.replace(")", "1-");
                        }
                    }
              } else if(str.charAt(i) == '}') {
                    res = "}" + res;
                    while(!stk.isEmpty() && (stk.peek() != '(' && stk.peek() != '[' && stk.peek() != '<' && stk.peek() != '{')){
                        res = res + Character.toString(stk.pop());
                    }
                    if(!stk.isEmpty()){
                        if(stk.peek() == '{') {
                            res = res + "0";
                            res = res.replace("}", "1");
                            stk.pop();

                        } else{
                            res = res.replace("}", "1-");
                        }
                    }
              } else if(str.charAt(i) == ']') {
                    res = "]" + res;
                    while(!stk.isEmpty() && (stk.peek() != '(' && stk.peek() != '[' && stk.peek() != '<' && stk.peek() != '{')){
                        res = res + Character.toString(stk.pop());
                    }
                    if(!stk.isEmpty()){
                        res = res + "0";
                        if(stk.peek() == '[') {
                            res = res + "0";
                            res = res.replace("]", "1");
                            stk.pop();

                        } else{
                            res = res.replace("]", "1-");
                        }
                    }
              } else if(str.charAt(i) == '>') {
                    res = ">" + res;
                    while(!stk.isEmpty() && (stk.peek() != '(' && stk.peek() != '[' && stk.peek() != '<' && stk.peek() != '{')){
                        res = res + Character.toString(stk.pop());
                    }
                    if(!stk.isEmpty()){
                        if(stk.peek() == '<') {
                            res = res + "0";
                            res = res.replace(">", "1");
                            stk.pop();

                        } else{
                            res = res.replace(">", "1-");
                        }
                    }
              } else
                  stk.push(str.charAt(i));

          }
          while(!stk.isEmpty()){
              if(stk.peek() != '(' && stk.peek() != '[' && stk.peek() != '<' && stk.peek() != '{'){
                  res = res + stk.pop();
              } else {
                stk.pop();
                res = "1-" + res;
              }
          }

          String finalRes = "";
          for(int i = res.length() - 1; i >= 0; i--){
            finalRes = finalRes + res.charAt(i);
          }
          return finalRes;

      }

      public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter string");
          String str = sc.nextLine();
          System.out.println(checkParenthesis(str));
          sc.close();
      }

}
