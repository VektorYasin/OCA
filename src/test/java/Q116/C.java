package Q116;
class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
public class C extends A {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1=new A();//instance of class A
        A b2=new C();//instance of class C

        b1=(A)b2;      //line1  A parent class olduğu cast yapılabilir.
        A b3= (B)b2;   //line2 C is not subclass of B, can not be "casted".
        b1.test();
        b3.test();
        /*
        (B) b2; attempts to cast the object referenced by b2 to type B
        and assigns it to the variable b3. However, the object
        referenced by b2 is an instance of class C,
        which is not a subclass of B. Therefore, the casting is not valid
        and will throw a ClassCastException at runtime.
         */
    }
}
/*What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.
Answer: e

 */