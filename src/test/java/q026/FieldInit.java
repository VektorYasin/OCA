package q026;

public class FieldInit {
	Character c;//null
	boolean b;//false
	float f;//0.0

	void printAll() {
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
	public static void main(String[] args) {
		FieldInit f = new FieldInit();
		f.printAll();
	}
}

		/*
		c = null
		b = false
		f = 0.0
		*/
		//What is the result?
		//A. c=null b=true f=0.0
		//B. c= b=false f=0.0
		//C. c=null b=false f=0.0
		//D. c=0 b=false f=0.0F

