package q059;

public class Q059 {

	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		/*Integer.parseInt("string") will convert string argument to number,

		 If given string is not number it will throw exception.
		 Generally java read command line argument in the form of strings
		 so to do any integer manipulations
		 we need to convert string type to integer type*/

		// line n1
		//1st way
		if (qty >= 90) {
			discount = 0.5;}
		if (qty > 80 && qty < 90) {
			discount = 0.2;}

		//2nd way
		 discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
		// If qty is greater than or equal to 90, the discount is set to 0.5.
		// If qty is greater than 80 (but less than 90),
		// the discount is set to 0.2. Otherwise, the discount is set to 0.


	 	System.out.println(discount);
	}
		/*
		And given the requirements:
		If the value of the qty variable is greater than or equal to 90,
		discount = 0.5
		If the value of the qty variable is between 80 and 90, discount = 0.2
		*/
	
//		Which two code fragments can be independently placed at line n1
//		to meet the requirements? (Choose two.)

	/*
	 A. if (qty >= 90) {discount = 0.5;}
	 	 if (qty > 80 && qty < 90) {discount = 0.2;}
	 	    
	 C. discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;

	 */
}
