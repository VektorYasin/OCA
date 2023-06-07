package q189;

public class Test2 {
    public static int stVar = 100;//static stVar is shared amoung all objects
    public int var =200;//each object has its own copy

    public String toString () {
        return stVar + ":" + var;
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.var =300;//kendi kopyası olan var değişir, stVar değişmez
        Test2 t2 = new Test2();
        t2.stVar =300;//elindeki var=200 değişmez, stVar=300 olur
        System.out.println(t1);//implicitly call toString()
        System.out.println(t2);//implicitly call toString()
    }
}
/*
What is the result?
D. 100:300
    300:200
Answer: D
 */