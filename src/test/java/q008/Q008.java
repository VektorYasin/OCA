package q008;

public class Q008 {

	public static void main(String[] args) {

		String [] [] arr = {{"A","B","C"}, {"D","E"}};
		System.out.println();

		for (int i=0; i<arr.length; i++) {	//arr.length=2

			for (int j = 0; j<arr[i].length; j++) {	//arr[i].length=3
				System.out.print(arr[i][j]+ " " );  //[0][0], [0][1], [0][2]  A B C
													//[1][0], [1][1], [1][2]

				if (arr[i][j].equals("B")) {
					continue; //bir etkisi yok
				}
			}
		continue;
		}	
	}
}
//What is the result? 
//A.    A B C
//B.	A B C D E
//C.	A B D E
//D.	Compilation fails.


//continue; cannot be used outside of a loop
//break; can be used outside of a loop
