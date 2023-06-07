package q021;//cikti

class Vehicle {
	Vehicle(){
		System.out.println("Vehicle");
	}
}

class Bus extends Vehicle{
	Bus(){
		System.out.println("Bus");
	}
}

public class Transport {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		// it invokes the constructor of the Vehicle class.
		//The Vehicle constructor prints "Vehicle" using
		// the System.out.println statement
	}
}
//What is the result?
//A.	Vehicle 
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
