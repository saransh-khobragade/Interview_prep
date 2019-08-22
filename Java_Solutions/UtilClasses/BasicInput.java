// This class aims to provide basic inputs line String, int, int array as of window

import java.util.*;
public class BasicInput {

    public static String inputType(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    public static int inputInt(){
      Scanner sc = new Scanner(System.in);
      int in = Integer.parseInt(sc.nextLine());
      sc.close();
      return in;
    }

    public static int[] inputIntArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();
        return array;
    }
}
