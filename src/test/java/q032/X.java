package q032;

 class X {
	int i;
	static int j;//dikkat static,

	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new X();
		x1.i = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		System.out.println(
				x1.i + " " +   //3
				x1.j + " " +   //4; 6 oldu
				x2.i + " " +   //5
				x2.j);         //6
	}
}
// What is the result?
//D.	3 6 5 6
