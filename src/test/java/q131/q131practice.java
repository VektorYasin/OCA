package q131;

public class q131practice {
}

class Vehicle{
    int x;//0

    public Vehicle() {
        this(10);//line n1
    }

    public Vehicle(int x) {
        this.x = x;//10
    }
}

class Car extends Vehicle{
    int y;//0
    Car() {
        super(10);
//        this(20);//line n2
        // Call to 'super()' must be first statement in constructor body
        // Call to 'this()' must be first statement in constructor body
    }
    Car(int y) {
        this.y = y;//
    }

    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();//car constructor calıştırıldı
        System.out.println(y);
    }
}
/*
Compilation fails at line n2
 */