package q129;

public class Q129a {
    public static void main(String[] args) {
        int ans = 0; // Initialize ans outside the try block

        try {
            int num = 10;
            int div = 0;
            ans = num / div; // May throw ArithmeticException
        } catch (ArithmeticException ae) {
            ans = 0; // Handle the exception by assigning 0 to ans
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }

        System.out.println("Answer = " + ans); // ans is accessible here
    }

}
