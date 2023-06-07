package q024;

	class A{
		public A() {
			System.out.print("A ");
		}
	}
	class B extends A{
		public B() {
			System.out.print("B ");
		}
	}
	class C extends B{
		public C() {
			System.out.print("C");
		}
		public static void main(String[] args) {
			C c = new C();
			//The constructor of class A is called first
			// because C extends B, which extends A. the output is A B C.

			A a = new A();
			// only the constructor of class A is called. Hence, the output is A
		}
	}

//What is the result?
//C.	A B C A


