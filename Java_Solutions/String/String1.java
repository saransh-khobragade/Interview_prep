// https://www.geeksforgeeks.org/removing-punctuations-given-string/

import java.util.*;

public class String1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine();
        input = input.replaceAll("\\p{Punct}", "");
        System.out.println("After removing punctuations: "+input);
        sc.close();
    }

}
