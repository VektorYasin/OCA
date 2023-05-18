package q122;

public class Q122 {
	public static void main(String[] args) {

		Short s1 = 200;
		Integer s2 = 400;
		//String s3 = (String) (s1+s2));//line n1 (Cannot cast from int to String)
		String s3 = String.valueOf(s1+s2);
		Long s4 = (long)s1+s2; //line n2
		System.out.println("Sum is " + s3);

		//Answer B  Compilation fails at line n1
		}

	}
/*
string valueOf() method converts different types of values into string.
By the help of string valueOf() method, you can convert int to string,
long to string, boolean to string, character to string, float to string,
double to string, object to string and char array to string.
 */