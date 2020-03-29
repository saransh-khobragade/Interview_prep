// coin problem
import java.util.*;
public class CoinProblem {

    static int findMinCoin(int[] coins, int sum, int[] cur){
        if(sum == 0) {
            return 0;
        }
        if(sum < 0)
          return -1;
        if(cur[sum] != 0)
          return cur[sum];
        int min = Integer.MAX_VALUE;
        int combo = 0;
        for(int coin : coins){
            combo = findMinCoin(coins, sum - coin, cur);
            if(combo >= 0 && combo < min)
              min = 1 + combo;
        }
        cur[sum] = min == Integer.MAX_VALUE?-1:min;
        return cur[sum];

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++){
          coins[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int[] cur = new int[sum+1];
        System.out.println("Minimum coins required: "+findMinCoin(coins, sum, cur));
        System.out.println(cur);
        sc.close();
    }
}
