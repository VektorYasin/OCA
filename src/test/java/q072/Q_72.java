package q072;

public class Q_72 {
}
	/*
	önce statik blok çalışır ve isAvailabe="false" atanır.
	 */
class Test2 {
	 public static void main(String[] args) {
	        Test2 ts = new Test2();
	        System.out.print(isAvailable+"");//false

	        isAvailable = ts.doStuff();
	        System.out.println(isAvailable);

	    }

	    public static boolean doStuff(){
	        return !isAvailable;//true
	    }

	    static boolean isAvailable = false; //önce isAvailable yazdiriyor sonra doStaff
	}
	/*
	What is the result?
	A.	Compilation fails.
	B.	false true
	C.	true false
	D.	true true
	E.	false false
	Answer: B

	 */

