package q179;

	class Test {
		static int count = 0; //static son degeri aldi
		int i= 0;   //static int i --> olursa 5 : 5 print eder

	public void changeCount () {
		while (i<5) {
			i++;  //i++ ile count++ yerleri degissede ayni sonuc 10:10 verir
			count++;
		}
	}
	public static void main(String[] args) {
			Test check1 = new Test ();
			Test check2 = new Test ();

			check1.changeCount();//count, static oldugu ıcın her obje için değişir. 5 burdan gelir
			check2.changeCount();//5 te burdan gelir, toplam 10 olur
			System.out.println(check1.count + " : "+ check2.count);

			//Answer--> 10 : 10
		}
	}
