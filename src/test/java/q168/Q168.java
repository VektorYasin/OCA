package q168;

public class Q168 {

	public static void main(String[] args) {
		String[] names = {"Thomas","Peter","Joseph"};
		String[] pwd =new String [3];
		//An empty string array pwd is created with a length of 3 to store
		//substrings of the names.
		int idx=0;//1

		try {
			for (String n:names) {//thomas,
				pwd[idx]=n.substring(2,6);//pwd[0]=exception,
				idx++;//1
			}
		}
		catch (Exception e) {
			System.out.println("Invalid name");
		}
		for (String p:pwd) {
			System.out.println(p);
		}
	}
}

			/*
			Invalid name
			omas
			null
			null
			 */
