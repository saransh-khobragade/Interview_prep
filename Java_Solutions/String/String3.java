// https://www.geeksforgeeks.org/python-check-substring-present-given-string/
import java.io.*;

public class String3 {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter String: ");
    String input = br.readLine();
    System.out.println("Enter substring: ");
    String str = br.readLine();
    if(input.contains(str))
        System.out.println("Substring present");
    else
        System.out.println("Substring not present");
    br.close();
  }
}
