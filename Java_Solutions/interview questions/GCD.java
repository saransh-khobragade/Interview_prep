//Greatest common divisor
import java.util.*;
public class GCD {

    static int findGCD(int a, int b){
        if(a < b){
          a = a + b;
          b = a - b;
          a = a - b;
          return findGCD(a, b);
        }
        else if (b == 0)
          return a;
        else
          return findGCD(b, a % b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a,b));
        sc.close();
    }

}
