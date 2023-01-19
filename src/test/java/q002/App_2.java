package q002;

public class App_2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = j += i / 5 ;  //first i / 5 = 2 ;  j+=2 demek j'y2 2 ekle demek, j=22 olur

		// k ==> j = j + i / 5 ==> first i / 5 = 2, then k = j = j + 2 => 22

		System.out.println(i + " : " + j + " : " + k);
	}
}//10 : 22 : 22
