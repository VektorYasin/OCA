package q037;

public class Q37_2 {

	public static void main(String[] args) {
		int data [] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;

		for (int e : data) {//data'ların hepsini tek tek al, dene
			if (e != key) {
				count++;//1,2,3
				continue;
			}
		}//loop

		System.out.println(count + " Found");
		
	}//3 Found
}
