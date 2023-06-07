package q092;

public class Q92 {}

    class Test{
    public static void main(String[] args) {
        //line n1
//      short x = 1;
//    	Integer x = new Integer("1");
        byte x = 1;
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }

    }
}
//CIBSS  ==> Char, Integer, Byte, String, Short u switch te kullanabiliriz
// Boolean, long, float, double we can not use with; long flat doublex bouldum.
//(String x = "1") is not valid because the variable x is a String, not a numeric type, and cannot be used in a switch statement.

/*
*Which three code fragments can be independently inserted at line n1 to enable the code to print One?
(Choose three.)
A. byte x = 1; ok
B. short x = 1; ok
C. String x = "1";
D. long x = 1;
E. double x = 1;
F. Integer x = new Integer("1"); x=1 demek
Answer: ABF
*  */


