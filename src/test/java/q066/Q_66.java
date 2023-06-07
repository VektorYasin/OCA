package q066;

interface I {
  public void displayI();
}

abstract class C2 implements I {
  public void displayC2() {
      System.out.print("C2");
  }
}

class C1 extends C2 {
  public void displayI() {
      System.out.print("C1");
  }
}

public class Q_66 {
  public static void main(String[] args) {

      C2 obj1 = new C1();
      I obj2 = new C1();

      C2 s = (C2) obj2; // obj2 is referenced as I,
                        // it needs to be explicitly cast to C2
      I t = obj1;

      t.displayI();//C1
//    The variable t is of type I and is assigned the value of obj1,
//    which is a C1 object. Since C1 implements the displayI method
//    from the I interface, calling t.displayI() will invoke
//    the displayI method in the C1 class and print "C1"

      s.displayC2();//C2
//    The variable s is of type C2 and is assigned the value of obj2,
//    which is a C1 object. However, since obj2 is referenced as I,
//    it needs to be explicitly cast to C2 in order to access
//    the displayC2 method in the C2 class. Calling s.displayC2() will
//    invoke the displayC2 method in the C2 class and print "C2".
  }
}
//What is the result?
//A. C1C2
//Answer: A

