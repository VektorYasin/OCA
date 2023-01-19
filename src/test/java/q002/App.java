package q002;

public class App {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = (j +=i) / 5;//(j = j+i) = (j = 30) ===> k = 30/5 =6

		System.out.print(i + " : " + j + " : " + k);
	}
}//10 : 30 : 6
