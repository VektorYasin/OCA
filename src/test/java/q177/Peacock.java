package q177;

 class Bird {//parent class
	public void fly() {
		System.out.println("Fly.");
	}
}
 public class Peacock extends Bird {//subclass; extend olunca parenttaki metodları kullanabilir.
		public void dance() {
			System.out.println("Dance.");
		}

		public static void main(String[] args) {
			//	/* insert code snippet here */
			Bird b = new Peacock();
			//Since Peacock is a subclass of Bird, it can be assigned
			// to a variable of type Bird due to polymorphism.

			Peacock p = (Peacock) b;
			//The object b is explicitly casted to type Peacock and
			// assigned to a variable p of type Peacock.
			p.fly();
			p.dance();
		}
 }
//			Bird.fly();//methodlar static olsaydı class ismi ile çağırabilirdik.
//			Peacock.dance();


	//Which code snippet can be inserted to print Fly.Dance. ?
//answer D.
// Bird b = new Peacock ();
// Peacock p = (Peacock) b;

	