package q072;

public class Q_72 {
}
	/*
	önce statik blok çalışır ve isAvailabe="false" atanır.
	 */
class Test2 {
	 public static void main(String[] args) {
	        Test2 ts = new Test2();
	        System.out.print(isAvailable +" ");//false

	        isAvailable = ts.doStuff();//true
	        System.out.println(isAvailable);

	    }

	    public static boolean doStuff(){
	        return !isAvailable;//!isAvailable=true
	    }

	    static boolean isAvailable = false;
	 //önce static blok çalışır
	}
	/*
	What is the result?
	B.	false true
	Answer: B

	 */

