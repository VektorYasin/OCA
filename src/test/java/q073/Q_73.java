package q073;

import java.time.LocalDate;

public class Q_73 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 30);

        date.plusDays(10);//atama olmadığı için sonuç değişmez

        System.out.println(date);
    }

}
/**
 * What is the result?
 * B. 2012-01-30
 * Answer: B
 */
