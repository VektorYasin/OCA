package q085;

class MyException extends RuntimeException {
}

public class Q_85 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException ne) {
            System.out.print("A");
        }
    }

    public static void method1() {//throws RuntimeException line n1
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException re) {
            System.out.print("B");
            //The Math.random() method in Java produces a random double
            // value between 0.0 (inclusive) and 1.0 (exclusive)
            /*
            In the catch block, the code always prints "B" when it catches
            a RuntimeException, regardless of whether it's a MyException
            or a RuntimeException. Therefore, in this case, the output
            will always be "B" when an exception is thrown. Because
            class MyException extends RuntimeException
             */
        }
    }
}

//What is the result?
//B. B

	
	    



