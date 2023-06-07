package q046;

public class Q046 {

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;
        int r1 = a * b / c + 1;//7
        int r2 = a / b * c + 1;//a/b=3/2=1,5=int 1  1+1=2
        int r3 = a * (b / (c + 1));
        System.out.println(r1 + " : " + r2 + " : " + r3);
    }
}
//int sadece tam kısmını alır, küsüratları almaz.(1.5=1 gibi)
//What is the result?
//D.	7 : 2 : 3
