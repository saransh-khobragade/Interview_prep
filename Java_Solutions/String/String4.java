// https://www.geeksforgeeks.org/calculate-sum-of-all-numbers-present-in-a-string/
import java.io.*;

public class String4{
    static int stringSum(String input){
        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i)))
              sum += Character.getNumericValue(input.charAt(i));
        }
        return sum;
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string: ");
        String input = br.readLine();
        System.out.println("Sum is: "+ stringSum(input));
        br.close();
    }

}
