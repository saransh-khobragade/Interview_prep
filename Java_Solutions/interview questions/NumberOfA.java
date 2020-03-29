//B*A*C* - count A's- google

import java.util.*;
public class NumberOfA {
    static int countAs(String a) {
        int l = 0;
        int s = a.length();
        int mid = 0;
        int h = s - 1;
        int b,e;
        if(a.charAt(l) == 'a' && a.charAt(h) == 'a')
          return s;
        while(l <= h) {
            mid = (l+h)/2;
            if(a.charAt(mid) == 'a') {
              b = processLeft(a,l,mid);
              e = processRight(a,mid,h);
              if(b != -1 && e != -1)
                return e - b + 1;
              return 1;
            } else if(a.charAt(mid) == 'b') {
              l = mid+1;
            } else if(a.charAt(mid) == 'c'){
              h = mid-1;
            }
        }
        return 0;
    }

    static int processLeft(String a, int l, int h){
      int mid=0;
        if(l==h || (a.charAt(l) == 'a' && a.charAt(h) == 'a'))
          return l;
        else if(a.charAt(h-1) != 'a')
          return h;
        else{
            while(l<h) {
                mid = (l+h)/2;
                if(a.charAt(mid) == 'b')
                  l = mid+1;
                else
                  return processLeft(a,l,mid);
            }
        }
        return -1;
    }

    static int processRight(String a, int l, int h){
      int mid=0;
        if(l==h || (a.charAt(l) == 'a' && a.charAt(h) == 'a'))
          return h;
        else if(a.charAt(l+1) != 'a')
          return l;
        else{
            while(l<h) {
                mid = (l+h)/2;
                if(a.charAt(mid) == 'c')
                  h = mid-1;
                else
                  return processRight(a,mid,h);
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(countAs(a));
        sc.close();
    }
}
