package q128;

public class MyField {
    int x;//0
    int y;//0

    public void doStuff(int x, int y) {
        x = x;
        y = this.y;
    }

    public void display() {
        System.out.print(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;

        MyField m2 = new MyField();
        //m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();//instance variable yazılır
//Answer A.  100 200 : 0 0 :
    }
}
/*
The display method is called on both m1 and m2.
Inside the display method, the values of the instance variables x and y
are printed.
Since m1 has x = 100 and y = 200, it prints 100 200 :.
Since m2 has x = 0 and y = 0 (default values for int), it prints 0 0 :.
 */
