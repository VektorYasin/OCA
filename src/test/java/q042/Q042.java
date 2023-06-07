package q042;

public class Q042 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("A");

		System.out.println("before delete: " + sb);//before delete: AA

		sb.delete(1, sb.length());//after delete:A

		System.out.println("after delete: " + sb);//after delete: A

	}
}
