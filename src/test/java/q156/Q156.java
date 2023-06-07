package q156;

public class Q156 {

    public static void main(String[] args) {
        // Which statement best describe encapsulation?
        //Encapsulation ensures that class can be designed so that only certain fields and methods of
        //an object are acesible from other objects....
        //157
        int num[][] = new int[3][1];//3 row 1 column
		//three subarrays, each containing one element.

        for (int i = 0; i < num.length; i++) {//outer loop for row
            for (int j = 0; j <num[i].length; j++) {//inner loop for column
                num[i][j] = 10;

            }
        }

    }
}
			/*
			num[0][0] = 10
			num[1][0] = 10
			num[2][0] = 10

			 */

