package q056;

public class Q056 {

	public static void main(String[] args) {
		String string = " "; // there is white space, not empty

		string.trim(); 	// it is not assigned to string variable,
						// so there is no affect

		System.out.println(string.contentEquals("") + " " + string.isEmpty());
							//false								false
	}
}
/*
string.contentEquals("") compares the content of the string variable with
an empty string. Since the string variable still contains a whitespace
character, the comparison returns false


 */

//What is the result?
//A.	true true
//B.	true false
//C.	false false
//D.	false true

