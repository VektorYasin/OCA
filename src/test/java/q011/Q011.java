package q011;

public class Q011 {

	public static void main(String[] args) {

		String[] strs = {"A", "B"};
		int idx = 0;

		for (String s : strs) {//bu loopun hiç bir fonksiyonu yok
			strs[idx].concat(" element " + idx);
			idx++;
		}

		for (idx = 0; idx <strs.length; idx++) {//strs.length=2
			System.out.println(strs[idx]);
		}
	}
}
//What is the result?
//A.	A
//		B

// idx is incremented in the loop but
// nothing is affected outside of the loop
// there is no syso nothing is printed from this loop
/*
the result is not assigned back to the array. Therefore,
the original elements in the array remain unchanged.
 */
