package q047;


class C1{}

class C2 extends C1{}

public class C3 extends C2 {

	public static void main(String[] args) {
		C1 obj1 = (C1) new C2();		// line 16

		C2 obj2 = (C2)new C3();			// line 17

		C2 obj3 = (C2)new C1();			// Line 18 C1 cannot be cast to q047.C2

		C3 obj4 = (C3)obj2; 			// line 19

		//c3< c2< c1
	}//line 18 üst sınıftan alt sınıf yaratabiliriz ancak alt sınıftan üst sınıf yaratamayız.
}
//Which line throws ClassCastException?
/*
A ClassCastException occurs when you try to cast an object to
a type that is not compatible with its actual type

instanceof is a binary operator we use to test if an object is of
a given type. The result of the operation is either true or false.
It's also known as a type comparison operator because it compares
the instance with the type.
Before casting an unknown object, the instanceof check should always be used.
Doing this helps to avoid a ClassCastException at runtime.

The instanceof operator's basic syntax is:
(object) instanceof (type)

 */
//A.	line 18
//B.	line 17
//C.	line 19
//D.	line 16
