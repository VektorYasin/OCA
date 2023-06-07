package q050;

public class Q050 {
//  Which two code fragments cause compilation errors? (Choose two.)

	public static void main(String[] args) {
		//double y1 = 203.22;  float fit = y1;
		//float fit = (float) 203.22;  float fit = (float) y1;
		// Type mismatch: cannot convert from double to float

		float fit1 = (float) 1_11.0;//explicitly casting

		//float fit2  =  100.00;
		// Type mismatch: cannot convert from double to Float

		int y2 = 100; float fit3= (float)y2;
		//kucukten buyuge cast olabilir

		float fit4 = 100.00F;
	}
}
