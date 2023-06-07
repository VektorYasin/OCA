package Q209;

public class Test {
    int x, y;

    public Test(int x, int y) {
        initialize(x, y);//9, 5
    }

    public void initialize(int x, int y) {
        this.x = x * x;//81
        this.y = y * y;//25
    }

    public static void main(String[] args) {
        int x = 9, y = 5;
        Test obj = new Test(x, y);//Test constructor çalıştırılır.

        System.out.println(x + " " + y);//9 5
        System.out.println(obj.x+" "+obj.y);//81 25
    }
}



