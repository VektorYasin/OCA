package q067;

public class Q_67 {
}

class Caller {
    //private void init(); private is only accessible within the class itself
    public void init() {
       //private cannot access
        System.out.println("Initialized"); 
    }

    //private void start(); private is only accessible within the class itself
     public void start() {
        init();
        System.out.println("Started");
    }
}

class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
        c.start();//'start()' has private access; not accessible from other classes
        c.init();//init()' has private access;not accessible from other classes
    }
}

//What is the result?
//D. Compilation fails.
//Answer: D

