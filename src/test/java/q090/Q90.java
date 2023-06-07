package q090;
//type casting
public class Q90 {
    public static void main(String[] args) {
        Short s1 = 200;//otomtaik int e cast olur
        Integer s2 = 400;

        Long s3 = (long) s1 + s2;   // line 1
        // wrapper oldugu icin casting sart.
        // primitive olsaydi casting e gerek yoktu

//        String s4 = (String) (s3 * s2); // line 2
        //numeric data tipleri String e cast olmaz.
        // Sonuc String.valueOf(result) ile kullanılabilir

        //Answer1 String s4 = (String.valueOf(s3 * s2));
        //System.out.println("Sum is "+ s4);
        // Cannot cast from long to String
    }
}
	/*
		 What is the result?
		C. Compilation fails at line n2.
		Answer: C
	 */
