package q013;

class Vehicle{
	int x;
	Vehicle(){
		this(10);			// line n1
	}

	Vehicle(int x){//30
		this.x= x;//30
	}
}

class Car extends Vehicle{
	int y;
	Car(){
		super(10);			// line n2
	}

	Car(int y){//20
		super(y); 
		this.y =y;//20
		System.out.println(x);//20
	}

	public String toString() {
		return super.x + " : " + this.y;
	}

	 public static void main(String[] args) {
		Vehicle y = new Car(20);
		// in another version 20 is deleted ==> 10:0
		System.out.println(y);
	}
}
 
// What is the result?
//		 C.	20:20


