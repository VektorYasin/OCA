package q159;

public class q159 {}

class Book {int pages;//instance variable
}
class App {
    int count;//instance variavle
    public void method(Book x, int k) {
        x.pages = 100;// sets the pages of the Book object
        k=200;//assigns the value of k to the count instance variable of the q159_App object.
    }
    public static void main(String[] args) {
        App obj = new App();//an instance of the q159_App class named obj is created
        Book objBook = new Book();//an instance of the Book class named objBook is created

        System.out.println(objBook.pages + ":" + obj.count);
        //The initial values of objBook.pages and obj.count are printed,
        // which are both 0.
        obj.method(objBook, obj.count);
        //The method is called on obj with objBook and obj.count
        // as arguments. This updates the pages of objBook to 100 and
        // leaves obj.count unchanged at 0.
        System.out.println(objBook.pages + ":" + obj.count);
        //the updated values of objBook.pages and obj.count are printed,
        // which are 100 and 0, respectively.
    }
}
//	A. 0:0
//	100:0

