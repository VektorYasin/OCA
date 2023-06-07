package Q219;

public class SumTest {//method overloading in Java

//    public static void doSum(byte x, byte y) {
//        System.out.println("byte sum is " + (x + y));
//    }

//    public static void doSum(long x, long y) {
//        System.out.println("long sum is " + (x + y));
//    }

//    public static void doSum(short x, short y) {
//        System.out.println("short sum is " + (x + y));
//    }

//    public static void doSum(int x, int y) {
//        System.out.println("integer sum is " + (x + y));
//    }

    public static void doSum(Integer x, Integer y) {//wrapper class
        System.out.println("Integer sum is " + (x + y));
    }

    public static void doSum(double x, double y) {
        System.out.println("double sum is " + (x + y));
    }

    public static void doSum(float x, float y) {
        System.out.println("float sum is " + (x + y));
    }

    public static void main(String[] args) {
        doSum(10, 20);//float sum is 30.0
        doSum(10.0, 20.0);//double sum is 30.0

    }
}
/*
This invokes the doSum(float x, float y) method because the arguments 10
and 20 are integer literals, which can be "automatically promoted to float"
without any loss of precision
doSum(10.0, 20.0)
This invokes the doSum(double x, double y) method because the arguments 10.0
and 20.0 are floating-point literals of type double.

What is the result?
A  float sum is 30.0
   double sum is 30.0

boolean, byte, char, short, int, float, long, double
byte short int float long double
"bit" "şort" giyip "internete" girmiş, "flüt" çalarken audi "longa" binip "double" burger yemiş
 */
