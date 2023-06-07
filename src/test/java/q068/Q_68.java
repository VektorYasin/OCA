package q068;
//bu soru çıktı

import java.io.IOException;

class MyException extends RuntimeException {
}

public class Q_68 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
            //The catch block for MyException is not executed
            // since no MyException is thrown
        }
    }

    public static void method1() { // line n1
        try {
            throw 3 == 10 ? new MyException() : new IOException();
        } catch (IOException ie) {
            System.out.println("I");//more specific, this printed

        } catch (Exception re) {
            System.out.print("B");//more general, parent; not printed
        }
        //The catch block for MyException is not executed since
        // no MyException is thrown
    }
}

//What is the result?
//E. I
// Answer: E
/*
Note that the catch block for Exception is not executed because
IOException is a subclass of Exception, and it is more specific.
 */


//second way:

//	        try {
//	            method1();
//	        }
//	        catch(MyException ne){
//	            System.out.print("A");
//	        }
//	    }

//	    public static void method1(){ // line n1
//	        try {
//	            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
//
//	        } catch (RuntimeException re) {
//	            System.out.print("B");
//	        }
//
//	    }
//}

// Answer: B
//
//
//	        third way:
//	         catch (RuntimeException re) {
//	            System.out.print("I");
//	        }
//
//	    }
//}
// Answer: "I"
	

