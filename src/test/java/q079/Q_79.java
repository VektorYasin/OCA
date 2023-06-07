package q079;

public class Q_79 {
}

class C {
    public C() {
        System.out.print("C ");
    }
}

    class B extends C {
        public B(){     //line n1  the default implicit call to the superclass constructor
            // parametresiz constructor varsa super() vardır,
            // bir üste gider
            System.out.print("B ");
        }
    }

    class A extends B {
        public A(){      // line n2 the default implicit call to the superclass constructor
        // parametresiz constructor varsa super() vardır,
        // bir üste, parenta gider
            System.out.print("A ");
        }
        public static void main(String[] args) {
            A c = new A(); //constructor run edilirken parent to child class gider
        }
    }
    /*
    What is the result? 
    A. C B A
     */

