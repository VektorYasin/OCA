package q126;

public class Q126 {

	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50};
		int x = array.length;//5
		// line n1

		/*
		Which two code fragments can be independently inserted at line n1
		to enable the code to print the elements of
		the array in reverse order? (Choose two.)
		 */

//A.
	while (x>0) {//5, 4, 3,
	x--;  //Decrement oldugu icin reverse print ediyor
		  //4,3,2,1,0
			System.out.print(array[x]);
		}

//B.
//	do {
//	x--;
//	System.out.print(array[x]);//ArrayIndexOutOfBoundsException
//			            //Index -1 out of bounds for length 5
//	}while (x>=0);


//C.
//	 while (x>0) {    // ArrayIndexOutOfBoundsException
//	System.out.print(array[x]);
////		Index 5 out of bounds for   length 5
//	x--;
//	}

//D.

//	do {
//	System.out.print(array[x]);// ArrayIndexOutOfBoundsException
//	--x;                       // Index 5 out of bounds for length 5
//	}while (x>=0);


		while (x > 0) {//5,4,3,2,1
			System.out.print(array[--x]);//4,3,2,1,0

			//Answer A ve E print eder ve 50 40 30 20 10 reverse olarak
		}
	}
}
