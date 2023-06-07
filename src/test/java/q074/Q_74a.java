package q074;

public class Q_74a {};

    class Test{
        void readCard(int cardNo) throws Exception {//a checked exception. try-catch or add metod signature to main
            System.out.println("Reading Card");//it does not throw the exception explicitly within the method body.
        }
        void checkCard(int cardNo) throws RuntimeException {//line n1 unchecked exceptions
            System.out.println("Checking card");
        }

    public static void main(String[] args) throws Exception {
            Test ex = new Test();//an instance of the Test class is created
            int cardNo= 1234;
            ex.readCard(cardNo);        //line n2 checked exception
        //checked exception try-catch ile handle edilmediyse, main metod signature exception eklenmeli

            ex.checkCard(cardNo);       // line n3

        }
    }
//what s the result?
/*
Runtime Exceptions:
Also known as unchecked exceptions.
They inherit from the RuntimeException class or its subclasses.

"They do not need to be declared in the method signature or explicitly
handled using try-catch blocks."

They typically indicate programming errors or unexpected conditions.
Examples include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.

Checked Exceptions:
They are exceptions other than runtime exceptions.
They inherit from the Exception class (but not from RuntimeException).

"They must be declared in the method signature using the throws keyword",
or "they must be caught using try-catch blocks."

They represent anticipated exceptional conditions that a method may encounter.
Examples include "IOException", SQLException, and "ClassNotFoundException"
 */


