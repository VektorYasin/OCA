package q093;

public class Q93 {
}

class Product {
    int id;
    String name;

    public Product(int id, String name) { //void soruda yok
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        //And given the code fragment:
        Product p1 = new Product(101, "Pen");
        Product p2 = new Product(101, "Pen");
        Product p3 = p1;

        boolean ans1 = p1==p2;//false; p1 ve p2 iki faklı obje, referansları farklı, content aynı.
        boolean ans2 = p1.name.contentEquals(p2.name);//true; content aynı

        System.out.println(ans1 + ":" + ans2);
    }
}
	/*
	 * What is the result?
		C. false:true
		Answer: C
		*
		* p1 and p2 refer to two distinct Product objects,
		* even though their fields have the same values.
		* Therefore, p1 == p2 returns false.
	 */
	
	