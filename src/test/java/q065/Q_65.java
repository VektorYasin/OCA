package q065;
//bu soru cıktı
public class Q_65 {

	public static void main(String[] args) {

        float var1 = (12_345.01 <= 123_45.00)? 12_456 : 124_56.02f;
        //12_345.01 is greater than 123_45.00;
        //12_345.01=12345.01    123_45.00 = 12345.00

        float var2 = var1 + 1024;
        //The value 124_56.02f is assigned to the variable var1.
        //The expression var1 + 1024 = 124_56.02f + 1024= 13480.02

        System.out.println(124_56.02f);//12456.02

        System.out.print(var2);//13480.02
    }

}
//Answer D
/**
 * What is the result?
D. 13480.02
Answer: D
 In Java, the underscore character (_) is used as a separator for improving readability of numeric literals. It has no effect on the actual value of the literal.

 Therefore, 12_345.01 is equivalent to 12345.01. The underscore is simply used
 as a visual separator to make the number easier to read. When the code is
 compiled, "the underscore is ignored", and the numeric value is treated
 as 12345.01.
 */
 
