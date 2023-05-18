package q104;



public class Q104 {
}
	
	//Base.java:
	class Base{
	    public void test(){
	        System.out.println("Base ");
	    }
	}

	// DerivedA.java:
	class DerivedA extends Base {
	    public void test() {
	    	System.out.print("DerivedA");
	    }
	}
	//DerivedB.java:
	class DerivedB extends DerivedA {
	    public void test () {
	        System.out.print("DerivedB");
	    }
	    public static void main (String[] args) {
	        Base b1 = new DerivedB();
	        Base b2 = new DerivedA();
	        Base b3 = new DerivedB();
	        Base b4 = b3; //new DerivedB();
	        b1 =  (Base)b2; //new DerivedA();
	        b1.test();//DerivedA classından obje yarattık ve ordaki test() metodunu çağırdık ve o da DerivedA yazdırdı.
	        b4.test();//DerivedB classından obje yarattık ve ordaki test() metodunu cagirdik ve o da DerivedB yazdırdı.
	    }

	}
	/*
	 *What is the result?
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime. 

Answer: DerivedADerivedB
	 */
	
	

