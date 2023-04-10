    package q062;

    public class Q_62 {

    // In interface we can create abstract method in two ways  1) with abstract keyword. 2) without abstract keyword
    // when a class implements an abstract class, methods need to be initialized.

    }
    interface Downloadable {
        public void download();
    }

    interface Readable extends Downloadable {   //line n1
        public void readBook();  //downloadi var sen implement etmesen de ediyor
    }

    abstract class Book implements Readable {   //line n2
        public void readBook(){System.out.println("Read Book");}
    }

    class EBook extends Book {       //line n3
    // classin icine interface'deki methodlari implement etmek zorundasin
        public void download(){} //soruda bu metod verilmemiş. bu nedenle burda complialtion fails olur.
        public void readBook() {System.out.println("Read E-Book");}

    public static void main(String[] args) {
	    Book book1 = new EBook();
        book1.readBook();
    }
}
        /*
        What is result?
        A.Compilationfailsatlinen2.
        B.ReadBook
        C.ReadE-Book
        D.Compilationfailsatlinen1
        E.Compilation fails at line n3.   answer E
        we need to add absract method in nonabstract class
        public void download(){ }
        */






