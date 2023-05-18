package q052;

public class Test {

	public static void main(String[] args) {
		String [] [] chs = new String [2] []; // chs.length =2
		chs[0] = new String [2];
		chs[1] = new String[5];
		//chs=[  {1,2},     {1,2,3,4,5}]
		//		chs[2]         chs[5]

		int i =97;		
		for (int a = 0; a < chs.length; a++) { //chs.lenght=2, chs.lenght=5,
			for (int b = 0; b < chs.length; b++) {//length e kadar istemis 2 ye kadar
				chs [a][b]= " " + i;// a=97 ascii de A=65  [0][0]=97, [0][1]=98
				i++;				//	[1][0]=99, [1][1]=100,[1][2]=null,[1][3]=null,[1][4]=null
			}
		}

		for (String[] ca : chs) {
			for (String c : ca) {
				System.out.print(c + " ");
			}
			System.out.println();
		}


	}
}

//What is the result?
//A. 97 98
//    99 100 null null null 
//B. 97 98
//    99 100 101 102 103
//C.	Compilation fails.
//D.	A NullPointerException is thrown at runtime.
//E.	An ArraylndexOutOfBoundsException is thrown at runtime.
