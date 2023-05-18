package q021;

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
		Vehicle v = new Vehicle();//constructor cagirinca Vehicle yazdırdı
	}
}
//What is the result?
//A.	Vehicle 
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
