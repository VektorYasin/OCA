package q135;


class Planet {
	public String name;
	public int moons;

	public Planet(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}

//		public String toString(){  //toString methodu override yaparsak planet i yazdirabiliriz
//		return name+moons;
//	}
}
public class Question135 {
		public static void main(String[] args) {
			Planet[] planets = {
					new Planet ("Mercury", 0),
					new Planet ("Venus", 0),
					new Planet ("Earth", 1),
					new Planet ("Mars", 2),
			};
			for (Planet p : planets) {
				System.out.println(p);
			}
			System.out.println(planets);//[Lq135.Planet;@2e5d6d97
			System.out.println(planets[2].name);//Earth
		    System.out.println(planets[2].moons);//1

			/*
			System.out.println(planets):
The System.out.println(planets) statement in the given code will print
the array reference of the planets array, not the individual elements of
the array. The output will be a string representation of the array object,
which may not be meaningful or useful
			 */




		}
		
		/*
		 
		 What is the output?  answer B
		 A) planets
		 	Earth
		 	1
		 
		 B) [LPlanets.Planet;@15db9742
		 	Earth
		 	1
		 
		 C) [LPlanets.Planet;@15db9742
		 	Planets.Planet@6d06d69c
		 	1
		 	
		 D) [LPlanets.Planet;@15db9742
		    Planets.Planet@6d06d69c
		    [LPlanets.Moon;@7852e922
		    
		 E) [LPlanets.Planet;@15db9742
		    Venus
		  	0
		 	
		 
		 
		 */

	}

//Answer:  B
/*
[Lq135.Planet;@2e5d6d97
		Earth
		1
 */
