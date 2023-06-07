package q026;

public class FieldInit2 {
	byte by;//0
	short sh;//0
	int i;//0
	long l;//0
	float f;//0.0
	double d;//0.0
	boolean bo;//false
	char c;

	String s;//null
	StringBuilder sb;//null
	StringBuffer sBuf;//null
	Byte byte1;//null
	Short short1;//null
	Integer integer1;//null
	Long long1;//null
	Float float1;//null
	Double double1;//null
	Boolean boolean1;//null
	Character character1;//null
	int[] intarray;//null
	String [] strarr;//null
	void printAll() {
		System.out.println("byte = " + by);//0
		System.out.println("short= " + sh);//0
		System.out.println("int = " + i);//0
		System.out.println("long = " + l);//0
		System.out.println("float = " + f);//0.0
		System.out.println("double = " + d);//0.0
		System.out.println("boolean = " + bo);//false
		System.out.println("char = " + c);//
		
		System.out.println("Byte = " + byte1);
		System.out.println("Short = " + short1);
		System.out.println("Integer = " + integer1);
		System.out.println("Long = " + long1);
		System.out.println("Float = " + float1);
		System.out.println("Double = " + double1);
		System.out.println("Boolean = " + boolean1);
		System.out.println("Character = " + character1);
		System.out.println("String = " + s);
		System.out.println("StringBuilder = " + sb);
		System.out.println("StringBuffer = " + sBuf);
		System.out.println("String array = " + strarr);
		System.out.println("int array = " + intarray);
		
	}

	public static void main(String[] args) {
		FieldInit2 f = new FieldInit2();
		f.printAll();
	}
}
//What is the result? 
//A. c=null b=true f=0.0 
//B. c= b=false f=0.0 
//C. c=null b=false f=0.0 
//D. c=0 b=false f=0.0F

