package q071;

public class Q_71 {
}

interface I {
    public void displayI();
}

class C2 {
    public void displayC2() {
        System.out.println("C2");
    }
}

class C1 extends C2 implements I {//inheriting from class C2 and also implementing interface I
    public void displayI() {
        System.out.println("C1");
    }

    public static void main(String[] args) {
        C2 obj1 = new C1();//obj1 is of type C2
        I obj2 = new C1();// obj2 is of type I

        C2 s = (C2)obj2;//C2 s = obj2; obj2 is of type I which is not a superclass of C2; C2'ye cast edilmeli.
        I t = (I)obj1;// I t = obj1 --> obj1 C2 tipinde.

        t.displayI();
        s.displayC2();
    }
}

