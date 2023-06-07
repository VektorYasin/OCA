package q028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q028 {

    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};

        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        if (arrList.removeIf(s -> {
            System.out.print(s);//HiHowAreYou

            return s.length() <= 2;})) { // true if any elements were removed
            System.out.println(" removed");
            //If the length of s is less than or equal to 2,
            // the predicate returns true, indicating that the element
            // should be removed.

            //The "removeIf" method removes the elements from arrList for
            // which the predicate returns true.

            //if (arrList.removeIf(...)) evaluates to true because
            // elements were removed from arrList.
        }
    }
}
//HiHowAreYou removed

//What is the result?
//A.	Compilation fails.
//B.	The program compiles, but it prints nothing.
//C.	HiHowAreYou removed
//D.	An UnsupportedOperationException is thrown at runtime.
