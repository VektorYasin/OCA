package q180;

public class CCMask {
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
//	line n1

	StringBuilder sb = new StringBuilder(x); //--> Answer C
	sb.append(creditCard, 15, 19);//append 15 ve 19 inclusive
	return sb.toString();

//	return x + creditCard.substring(15, 19); // -->Answer B

	}


public static void main(String[] args) {
System.out.println(maskCC("1234-5678-9101-1121"));
		

	}
}