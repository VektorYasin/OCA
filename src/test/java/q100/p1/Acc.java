package q100.p1;

public class Acc {


	    int p;          //DEFAULT not visible outside of the package ONLY SAME PACKAGE
	    private int q;  //only visible WITHIN THE CLASS
	    protected int r; //visible from DIFFERENT PACKAGE via INHERITANCE only!
	    public int s;   // visible in universe
	}

	class Test extends Acc{
		public static void main(String[] args) {
		Acc obj = new Test();
		//obj.s;obj.r; obj.p olur; ama obj.q olmaz class dışından ulaşılamaz.
	}
}
	/*
	"Protected" is inheritable to sub class (outside the package) so therefore if
	 the sub class’ object was created then you could access to the protected variable.
	 But the object was created from "super" class
			  Acc obj = new Test();

 Which statement is true?
 A. Both p and s are accessible via obj.  //p only in same class
 B. Only s is accessible via obj.   "public" can be reached from anywhere....
 C. Both r and s are accessible via obj.//r only inheritance from different package
 D. p, r, and s are accessible via obj.

 Answer: B
 ** "public" can be reached from anywhere....
 ** "protected" can be reached from the same package,
 	and if we need to reach from another package,
 	it needs to be extended from parent AND needs to
 	create an object from the child class...
 ** "Default" only can be reached from same package...
 ** "Private" only from same class.
 */
