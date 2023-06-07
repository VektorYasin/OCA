package q023;

public class Q023 {

	public static void main(String[] args) {
		char colorCode = 'y';

		switch (colorCode) {
		case 'r':
			int color = 100;
			break;
		case 'b':
			color = 10; // doesn't result error because color is initialized in the switch block
			break;
		case 'y':
			color = 1;
			// doesn't result error because color is initialized in the switch block
			System.out.println(color);
		}
	 // cannot read the variable, created in the switch block
	}
}
//What is the result?
//C.	It prints : 1


