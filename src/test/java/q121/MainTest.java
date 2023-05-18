package q121;

public class MainTest {

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}
	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
	}
	public static void main(String[] args) {
		System.out.println("String main " + args[0]);

	}
}
/*
ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
An exception is thrown at runtime
The main methods with the int[] args and
Object[] args parameters will not be invoked
because they do not match the expected String[] parameter signature.

It's important to note that the main method with the String[] args parameter
is the entry point for executing a Java program.
Other overloaded main methods can be defined,
but they won't be automatically invoked
when running the program from the command line.
 */