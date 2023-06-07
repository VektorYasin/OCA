package q039;

class Animal {
	String type = "Canine";
	int maxSpeed = 60;

	Animal() {//bu contructor çalışınca String type = "Canine" ve int maxSpeed = 60 olan obje üretilir.
			  //Animal will be initialized with their default values, which are "Canine" and 60 respectively
	}

	Animal (String type, int maxSpeed) {//bu contructor çalışınca String type ve int maxSpeed değerini biz atarız ve o değerlerle obje üretilir.
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
	class WildAnimal extends Animal {
		String bounds;

		WildAnimal(String bounds) {//long
			// line n1
			super(); // parent class'ın parametresiz constructorunu çalıştır ve class seviyesinde atanan değerlerle obje üret.
			//** if constructor is not created gives compilation error	**
			this.bounds = bounds;//bizim atadığımız bounds değerini bounds'a ata demek.
		}

		WildAnimal(String type, int maxSpeed, String bounds) {
			// line n2
 			super(type, maxSpeed);//Animal will be initialized with the provided values. Parametreli constructor bu şekilde çağrılır/çalıştırılır.
			this.bounds = bounds;
		}

		public static void main(String[] args) {
			WildAnimal wolf = new WildAnimal("Long");
			WildAnimal tiger = new WildAnimal("Feline", 80, "Short");

			System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);//Canine 60 Long
			System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);//Feline 80 Short
		}
	}

/* 
Which two modifications enable the code to print the following output? (Choose Two)
	Canine 60 Long
	Feline 80 Short

A. Replace line n1 with: 
	super(); 
	this.bounds = bounds;

B. Replace line n1 with: 
	this.bounds = bounds; 
	super (); 							// super() and this() should be the first statement following constructor  --> compilation error

C. Replace line n2 with: 
	super(type, maxSpeed); 
	this (bounds); 					// super() and this() should be the first statement following constructor  --> compilation error

D. Replace line n1 with: 
	this("Canine", 60); 			// should've been defined as this -- ("Canine", 60, bounds);--  to call current class's 3 parameter constructor
	this.bounds = bounds;

E. Replace line n2 with: 
	super(type, maxSpeed);  
	this.bounds = bounds;

Answ: A, E
*/