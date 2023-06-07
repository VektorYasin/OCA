package q158;

public class Q158a {
	public static void main (String[]args) {
		int aVar=9;
		System.out.println(aVar++);//önce aVar=9 yazdırır, degerini 10 yapar

		if (aVar <10) {
			System.out.println(aVar +"Hello Universe!");
		}else {
			System.out.println(aVar +"Hello World!");

			}
					//9
					//10Hello World!
		}
	}

 class Q158b {
	public static void main (String[]args) {
		int aVar=9;
		System.out.println(aVar++);//önce aVar=9 yazdırır, degerini 10 yapar

		if (aVar++ <10) {//10<10 değil, değerini 11 yapar else blokuna gider
			System.out.println(aVar +"Hello Universe!");
		}else {
			System.out.println(aVar +"Hello World!");

			//9
			//11Hello World!
		}
	}
}

