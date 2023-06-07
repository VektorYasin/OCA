package q175;

public class App {

	 static int foo;//foo değikeni ancak static yapılırsa kullanılabilir.
	 static int bar;

	static void process() { //static method static olmayan variable cagiramassin
		foo += 10;  //Compile error verir int foo; oldugu      icin,
					//static int foo;yaparsan  --> Cevap: 10, 20
		bar += 10;
	}
	public static void main(String[] args) {
		App firstObj = new App();
		App.process();
		System.out.println(firstObj.bar);

		App secondObj = new App();
		App.process();
		System.out.println(secondObj.bar);

	}
	/*
	static variable'ları sadece static methodlar içinde çağırabilirsiniz.
	static olmayan variable'ları static olmayan metodlar içinde çağırabilirsiniz.
	A compile time error occurs
	 */

}
