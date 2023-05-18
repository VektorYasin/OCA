package q095;
import java.util.*;

	public class Q95 {
	}

	class Product{
		int id;
		String name;

		public Product(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

	class Shop {
	public static void main(String[] args) {
		
		List<Product> st = new ArrayList<>() ;
//		Product p2=new Product(10, "IceCream");
//		Product p3=new Product(11, "Chocolate");
		st.add(new Product(10, "IceCream"));//bu şekilde object yaratır ancak indexOf ile değer return etmez
		st.add(new Product(11, "Chocolate"));

		Product p1 = new Product(10, "IceCream");//bunu add yapmadık, indexi olmaz

		System.out.println(st.indexOf(p1));//-1 doner, value yok

		System.out.println(st.indexOf(new Product(10, "IceCream")));
		System.out.println(st.indexOf(new Product(11, "Chocolate")));
		}
	}

	/*
	 *What is the result?
			A. true
			B. false
			C. -1
			D. 0
			Answer: C
			* IndexOf() method returns -1 if the value is not found
	 */
