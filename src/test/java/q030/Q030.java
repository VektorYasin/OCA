package q030;

import java.util.ArrayList;
import java.util.List;

public class Q030 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");

		if (names.remove("Bran")) {//remove();1st occurence removed
			names.remove("Jon");
		}
		System.out.println(names);//Bran hariç listeyi yaz
	}
}	/*
	The remove method is called on names with the argument "Bran".
	The first occurrence of "Bran" is removed from the list.
	Since the remove method returns true when an element is
	successfully removed, the condition if (names.remove("Bran"))
	evaluates to true.

Inside the if block, the remove method is called again on names with
the argument "Jon". However, "Jon" is not present in the list,
so no element is removed.

The System.out.println(names) statement prints the contents of
the names list after the removals. The remaining elements in the list
are "Robb", "Rick", and the second occurrence of "Bran".
			 */

		//[Robb, Rick, Bran]
//What is the result?
//A.	[Robb, Rick, Bran]
//B.	[Robb, Rick]
//C.	[Robb, Bran, Rick, Bran]
//D.	An exception is thrown at runtime.
