package q086;


public class Q86 {
}

class A {
    public void test() {
        System.out.println("A ");
    }
}

class B extends A {
    public void test() {
        System.out.println("B ");
    }
}

class C extends A {
    public void test() {
        System.out.println("C ");
    }

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C(); //Since C extends A, b2 can be implicitly cast to A.
        A b3 = (B) b2;  // line n1
        // b2 is actually an instance of C, C can not cast to B
        // so the cast is invalid and a ClassCastException is thrown at runtime.
        // C, A'ya cast edilebilir. cast edilebilmesi için classlar arasında ilişki olmalı;parent-child vs
        b1 = (A) b2;  // line n2
        b1.test();
        b3.test();
    }
}
    /*
    What is the result?
    D. A ClassCastException is thrown only at line n1.

    Answer: D

     */
