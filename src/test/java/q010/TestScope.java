package q010;

public class TestScope {
	public static void main(String[] args) {
		int var1 = 200;

		System.out.print(doCalc(var1));//400
		// prints the returned var from doCalc()

		System.out.print(" " + var1);//200
		// prints the local var
	}
	static int doCalc(int var1) {
		var1 = var1 * 2;
		return var1;
	}
}
//What is the result?
//A.	400 200

