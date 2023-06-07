package q136;

import java.util.ArrayList;
import java.util.List;

public class Question136 {
	public static void main(String[] args) {
		
	List<String> arrayList=new ArrayList<>();
	arrayList.add("Tech ");
	arrayList.add("Expert ");
		System.out.println(arrayList);//[Tech , Expert ]

	arrayList.set(0,"Java ");
		System.out.println(arrayList);//[Java , Expert ]

	arrayList.forEach(a-> a.concat("Forum"));
		System.out.println(arrayList);//[Java , Expert ]
		/*
		The arrayList.forEach(a -> a.concat("Forum"));
		uses forEach() method and a lambda expression,
		but it doesn't update the elements of the arrayList.
		The lambda expression performs a concatenation operation,
		but it doesn't assign the result back to the element.
		So, the elements remain unchanged.
		 */
	arrayList.replaceAll(s-> s.concat("Group"));
	/*
	The arrayList.replaceAll(s -> s.concat("Group"));
	line uses replaceAll() method and a lambda expression to concatenate
	the string "Group" to each element of the arrayList.
	The replaceAll() method modifies the elements in place.
	 */
		System.out.println(arrayList);//[Java Group, Expert Group]
	}	
}
/*
What is the result?
A. [JavaForum, ExpertForum]
B. [JavaGroup, ExpertGroup]
C. [JavaForumGroup, ExpertForumGroup]
D. [JavaGroup, TechGroup ExpertGroup]
Answer: B
*/