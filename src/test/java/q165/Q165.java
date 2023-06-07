package q165;

 	public class Q165 {
	//}
	public static class OraString {
	String s;

	public boolean equals(OraString str) {
		return this.s.equalsIgnoreCase(str.toString());
	}

	OraString(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		String s1 = "Moon";
		OraString s2 = new OraString("Moon");

		if ((s1 == "Moon") && (s2.equals("Moon"))) {//== deger ve refereans kıyaslaması yapar.
			System.out.println("A");
		} else {
			System.out.println("B");
		}

		if (s1.equals(s2.s)) {//equals sadece deger kıyaslaması yapar.
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
	 }


