package q049;

public class Q049 {

	public static void main(String[] args) {
		int[][] n = {{1, 3}, {2, 4}};

		for(int i = n.length-1; i >= 0; i--) {//n.length-1)=1

			for (int y : n[i]) {//n[1] = {2, 4};   n[0] = {1, 3}
				System.out.print(y+" ");
			}
		}
	}//2 4 1 3
}

//What is the result?
//A.	1324
//B.	2313  // 2413
//C.	3142
//D.	4231
