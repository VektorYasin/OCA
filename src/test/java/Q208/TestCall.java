package Q208;

class Caller {
    private void init() {//private method sadece aynı classta geçerlidir.
        System.out.println("Initialized");
    }

    private void start() {//private method diğer classlarda kullanılamaz.
        init();
        System.out.println("Started");
    }
}

public class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
//        c.start(); //line 1
//        c.init(); //line 2
    }
}
/*
Whats the result?
A. Compilation fails at line n1.

 */
