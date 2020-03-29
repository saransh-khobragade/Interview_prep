//overriding and overloading example
import java.io.*;

class A {

  public void m1() {
    System.out.println("Class A - m1");
  }

  public void m2() throws IOException {
    System.out.println("Class A - m2");
  }

  public void m3() throws NullPointerException {
    System.out.println("Class A - m3");
  }
}

class B extends A {

  public void m1() throws IOException{          //--> Can't override method as parent function doesn't throw checked exception
    System.out.println("Class B - m1");
  }

  public void m1() throws NullPointerException{ //--> Allowed as NullPointer is unchecked exception
    System.out.println("Class B - m1");
  }

  public void m1() {                            //--> Not Allowed as throws is not part of function signature, so it is a duplicate function and not overloading
    System.out.println("Class B - m1");
  }

  public void m1(int a) {                       //--> function overloading
    System.out.println("Class B - m1");
  }

  public int m1(int a) {                        //--> Error, as return type is not part of function signature hence duplicate function error
    System.out.println("Class B - m1");
  }

  public void m2() {
    System.out.println("Class B - m2");
  }

  public void m2() throws Exception{            //--> this overriding is compilation error as it can't throw parent exception
    System.out.println("Class B - m2");
  }

  public void test(){
    m2();
  }
}

public class LoadingExample {

    public static void main(String args[]) {
        A b = new B();  //object of class A with version of B
        b.m1();     // No error, simple method
        // b.m2();  // needs to catch or throw IOException(checked) other wise compilation error
        // b.test();  // Complilation error as parent A doesn't know about B's unoverriden methods
        b.m3();       // No error, as NullPointer is an unchecked exception

        A a = new A();  //object of class A with version of A
        a.m1();   // No error, simple overriding of the m1()
        // a.m2();   // needs to catch or throw IOException(checked) other wise compilation error
        // b.test();  // Complilation error as parent A doesn't know about B's unoverriden methods
        b.m3();       // No error, as NullPointer is an unchecked exception

        B c = new B();  //object of class B with version of B
        c.m1();   // No error, simple overriding of the m1()
        c.m2();   // no error, simple overriding of the m2()
        c.test();  // no error, as for B m2() is normal method
        c.m3();    // calling parent non-overriden method
    }
}
