package q018;//bu soru çıktı

class Vehicle{
	String type = "4W";
	int maxSpeed = 100;
	
	Vehicle(String type, int maxSpeed){ //constructor;
		this.type = type;//4W
		this.maxSpeed = maxSpeed;//150
	}
	Vehicle(){//default constructor with no parameters.
	}
}

public class Car extends Vehicle {
	String trans;
	
	Car(String trans){//conctructor
		// line n1
		this.trans = trans;//auto
	}

	Car(String type, int maxSpeed, String trans){ //constructor
		super(type, maxSpeed);	// line n2;   // super(type, maxSpeed) statement to call the constructor of the superclass Vehicle
		this.trans =trans;//Manual
	}
	public static void main(String[] args) {
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W",  150, "Manual")	;
						    //4W			//100			//Auto
		System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
		//Yeni bir değer ataması yapılmadıgından class seviyesindeki default values'ları kullanır.
		//String type = "4W";  int maxSpeed = 100;   default values
						   //4W			    150					Manual
		System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
	}
}
//What is the result?
//A.	4W 100 Auto
//		4W 150 Manual

