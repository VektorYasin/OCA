package q015;

public class Q015 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        /* insert code here*/
        String str2 = str1; // the objects are equalized
        System.out.println(str1 == str2); // == checks if the objects are equal(reference and value), not their values
    }
}
// Which code fragment, when inserted at line 9, enables the code to print true?

//A.	String str2 = str1;

//stringBuilder mutable, string immutable, hafıza açısından stringBuilder daha iyi

