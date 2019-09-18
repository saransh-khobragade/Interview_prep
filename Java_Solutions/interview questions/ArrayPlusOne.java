//increment 1 to an array
import java.util.Scanner;

 public class ArrayPlusOne{

    static void printArray(int[] output) {
        for(int i = 0 ; i < output.length ; i++)
          System.out.print(output[i]+" ");
    }

    static int[] incrementOne(int[] input){
        int sum = 0;
        int carry = 1;
        int size = input.length;
        int[] output = new int[size];
        for(int i = size-1; i >= 0; i--){
            sum = input[i] + carry;
            output[size-1 - i] = sum % 10;
            if(sum == 10)
              carry = 1;
            else
              carry = 0;
        }
        if(size >0 && carry == 1){
          int[] newOut = new int[size + 1];
          newOut[0] = 1;
          for(int i = 1; i < size+1; i++)
            newOut[i] = output[i-1];
            return newOut;
        }
        return output;
    }

    public static void main(String args[]) {

        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for(int i =0; i < size; i++){
            input[i] = sc.nextInt();
        }

        int[] output = incrementOne(input);
        printArray(output);
        sc.close();
    }
 }
