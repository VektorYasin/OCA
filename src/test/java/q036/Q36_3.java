package q036;

public class Q36_3 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D"};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " " );

			if (arr[i].equals("A")) {
				continue;
//continue:  It causes the program to skip the rest of the loop body and
//jump to the next iteration of the loop.
			}
			System.out.println("Work Done");
			continue;
		}//loop
	}//main
}//class

/*
			A
			B
			Work Done
			C
			Work Done
			D
			Work Done
			*/
