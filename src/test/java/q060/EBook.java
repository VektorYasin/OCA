package q060;

interface Readable {
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable {  // line n1
	public void readBook() { }
	// line n2
	// abstract class oldugu icin setBookMark() methodunu
	// implement etmesine gerek yok.
}
class EBook extends Book { 	// line n3
	// Book classındaki ve interface'deki tüm metodları
	// implement yapmak zorunda; extend olduğu için.

	public void readBook() { }

	@Override
	public void setBookMark() { // line 4 cevap bu
	}

	public static void main(String[] args) {
		Book book1 = new EBook();
	}

}
//normal(concrete) class, interfacedeki tüm metotları implement etmek zorundadır.
//abtsract class, interface deki tüm metotları implement etmek zorunda değildir.

/* 
* Which option enables the code to compile?
* abstract classlar, tüm metodları implement etmek zorunda değildir.
* normal(concrete) classlar, interface'deki tüm metodları implement etmek zorundadır.
	
D. At line n4 insert:  cevap bu
	public void setBookMark(){}

*/