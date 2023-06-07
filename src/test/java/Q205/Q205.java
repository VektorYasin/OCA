package Q205;

import java.time.LocalDate;

public class Q205 {
    //given the code fragment
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 30);
        date.plusDays(10);//NO ASSIGNMENT, NO CHANGE
        System.out.println(date);
    }
    /*whats the result?

    2012-01-30

     */
}
