package q083;

public class Q_83 {
}

class Test {
	public static void main(String[] args) {
		Test ts = new Test();
		System.out.println(isAvailable);

		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;//false döner
	}
	static boolean isAvailable = true;
}
		/*
		 What is the result?
		C. true false
		Answer: C
		 */

/*
// son kısmı değiştirip sormuşlar dikkat

public static void main(String[] args) {
		Test ts = new Test();
		System.out.println(isAvailable);
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;

	answer: false true
 */

 /*
 canvasta aynı soru şu şekilde;

 public class Test {

 static boolean isAvailable = false;

	public static void main(String[] args) {

		System.out.println( isAvailable + " " );
		isAvailable = doStuff();
		System.out.println( isAvailable );
	}

	public static boolean doStuff() {
		return !isAvailable;
	}

	Answer : false true
}
  */
