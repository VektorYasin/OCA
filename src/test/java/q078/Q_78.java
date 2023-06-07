package q078;

public class Q_78 {
    public static void main(String[] args) {
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";

        for (String str : str2) {
            str3 = str3 + str;
            System.out.println(str3);//Java
        }

        boolean b1 = (str1.equals(str3));//true; just value comparison
        boolean b2 = (str1 == str3);//false, memory location different

        System.out.println(b1 + ", " + b2);
    }
/*
We can use == operators for reference comparison (address comparison)
and .equals() method for content comparison.
In simple words, == checks if both objects point to the same memory location
whereas .equals() evaluates to the comparison of values in the objects.
 */
}
/**
 * What is the result?
 * A. false, false
 * B. false, true
 * C. true, false
 * D. true, true
 */