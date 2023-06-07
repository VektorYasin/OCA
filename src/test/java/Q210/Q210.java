package Q210;

import java.util.function.Predicate;

public class Q210 {
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n % 2 == 0;//lambda
        //insert code here


//which code snippet at line 9 prints true?
//  A.
//        Boolean s = p.apply(101);
//        System.out.println(s);
//   B. false
//        Boolean s = p.test(101);
//        System.out.println(s);

//  C.  true
        Boolean s = p.test(101);//101/2!=0 yani false
        if (s == true) {//s false ise else blogu çalışır
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}

