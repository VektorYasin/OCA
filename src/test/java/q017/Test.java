package q017;

class Test {
	int x, y;
	
	public Test(int x, int y) {//3,5
		initialize(x, y);//9,25
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;//9
		this.y = y * y;//25
	}
	
	public static void main(String[] args) {
		int x = 3, y =5;
	Test objTest = new Test(x, y);
									    //5
	System.out.println(objTest.x + " " + y);//9, 5

	System.out.println(objTest.x + " " + objTest.y);//9 25

	// prints the local variables
	//objTest.y yi yazdırmamış, scope'taki y'yi yazdırıyor. O nedenle 5
	}
}
//What is the result?
//A.	Compilation fails.
//B.	3 5
//C.	0 0
//D.	9 25
