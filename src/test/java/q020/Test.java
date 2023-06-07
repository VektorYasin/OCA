package q020;//cikti

public class Test {//123 v14
    int a1;

    public static void doProduct(int a) {
        a = a * a;
    }

    public static void doString(String s) {
        s.concat(" "+s);
    }

    public static void main(String[] args) {
        Test item = new Test();
        item.a1 = 11;
        String sb = "Hello";
        Integer i = 10;//in i =10 olsa da snuç aynı çıkıor
        doProduct(i);
        //the doProduct method is not able to modify the value of i
        // because Java passes arguments by value. Therefore,
        // the value of i remains unchanged
        doString(sb);
        //The doString method concatenates the string " Hello" to
        // the existing sb string, but the result is not assigned back
        // to sb. Therefore, the value of sb remains unchanged as "Hello".
        doProduct(item.a1);
        // a is a local variable within the method, the change does not affect
        // the value of item.a1.
        // Therefore, the value of item.a1 remains unchanged as 11.
        System.out.println(i + " " + sb + " " + item.a1);
    }
}
//What is the result?
//A.	10 Hello Hello 11
//B.	10 Hello Hello 121
//C.	100 Hello 121
//D.	100 Hello Hello 121
//E.	10 Hello 11
