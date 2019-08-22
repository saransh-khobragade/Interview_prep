// https://www.geeksforgeeks.org/program-credit-card-number-validation/
import java.util.*;

public class String15{
    static boolean checkValidity(String card) {
        int sum = 0;
        for(int i = card.length() - 2; i >= 0; i = i-2){
            int num = 2 * Character.getNumericValue(card.charAt(i));
            if(num > 9){
                while(num > 0){
                    sum = sum + (num % 10);
                    num = num / 10;
                }
            } else
                sum += num;
        }
        System.out.println("even sum"+sum);
        for(int i = card.length() - 1; i >= 0; i = i-2){
            sum = sum + Character.getNumericValue(card.charAt(i));
        }
          System.out.println("even+odd sum"+sum);
        if(sum % 10 == 0)
            return true;
        else
            return false;

    }
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter credit card number");
        String card = sc.nextLine();
        if(card.length() <= 16 && card.length() >= 13) {
            if(checkValidity(card)){
                if(card.startsWith("4"))
                    System.out.println("Visa Card");
                else if(card.startsWith("5"))
                    System.out.println("Master Card");
                else if(card.startsWith("37"))
                    System.out.println("American Express Card");
                else if(card.startsWith("6"))
                    System.out.println("Discover Card");
                else
                    System.out.println("Some other Card");
            } else
                System.out.println("Invalid card");
        } else
            System.out.println("Invalid card");
    }

}
