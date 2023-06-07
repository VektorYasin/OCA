package q007;

public class X {
	static int i; // static fields get changed for every object
	int j;
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new X();
		x1.i= 3;
		x1.j = 4;
		x2.i= 5;
		x2.j = 6;
		System.out.println(
				x1.i + " " + //5
				x1.j + " " + //4
				x2.i + " " + //5
				x2.j);//6
	}
}
//What is the result?

//C.5 4 5 6

