package q057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{

	String nameString;
	int age;
	
	public Person (String n, int a) {
		nameString = n;
		age =a;
	}

	public String getName() {
		return nameString;
	}

	public int getAge() {
		return age;
	}
}

public class Test {
	public static void checkAge(List<Person> list, Predicate<Person> predicate) {
		for (Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p.nameString + " ");
			}
		}
	}

	public static void main(String[] args) {
		List<Person> iList = Arrays.asList(new Person("Hank",  45),
								new Person("Charlie", 40),
								new Person("Smith", 38));
		// Line n1
		
// Which code fragment, when inserted at line n1, enables the code to print Hank?
		
//		checkAge (iList, () -> p.getAge() > 40);
//		checkAge (iList, Person p -> p.getAge() > 40);
		checkAge (iList, p-> p.getAge() > 40);
//		checkAge (iList, (Person p) -> {p.getAge() > 40});
	}
}
/*
The checkAge method takes a list of Person objects and a Predicate<Person> as
arguments. The Predicate<Person> is used to test each person in the list based
on a condition. Only the persons that satisfy the condition will be printed.

In this case, the condition is p.getAge() > 40, which checks if the age of
a person is greater than 40. By using the lambda expression p -> p.getAge() > 40,
we define a predicate that tests if a person's age is greater than 40.
This lambda expression is passed as the argument to checkAge method.

Therefore, when you insert the code fragment checkAge(iList, p -> p.getAge() > 40);
at line n1, it will enable the code to print "Hank" because "Hank" is the
only person in the list with an age greater than 40.
 */