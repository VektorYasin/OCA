package Q222;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q222 {
    public static void main(String[] args) {

//        int array1[] = new int[]{1, 2, 3};

        List<String> lst = Arrays.asList("EN", "FR", "CH", "JP");

        Iterator<String> itr = lst.iterator();

        while (itr.hasNext()) {

            String e = itr.next();//EN,FR, CH

            if (e == "CH") {
                break;
            }
            System.out.println(e + " ");//EN, FR
        }
    }
    /*
    What is the result?
     A. EN FR JP
     B. EN FR
     C. CH
     D. EN FR CH
     Answer: B  --isteyen pdf te explanition a baksin

     The Iterator interface provides a way to iterate over the elements of
     a collection in a sequential manner. It allows you to traverse the
     elements one by one and perform operations on them.
     enhanced loop da kullanılabilir
     */
}
