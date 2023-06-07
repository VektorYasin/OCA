package q053;

import java.util.Arrays;

public class Q053 {

	public static void main(String[] args) {

		int[][] num = new int [1][3]; //[{2,4,8}]
		//System.out.println(num.length);
		
		for (int i = 0; i<num.length; i++) {  // num.length = 1

			for (int j = 0; j<num[i].length; j++) {  // num[i].length =3

				num [i][j]= 10;  
			}
		}
		System.out.println(Arrays.deepToString(num));
		//multidimensional array yazdırmak için deepToString() kullanılır
	}
}

/*
Which option represents the state of the num array after
uccessful completion of the outer loop?

A. num [0] [0] = 10;
	num [0] [1] = 10;
	num [0] [2] = 10;
*/