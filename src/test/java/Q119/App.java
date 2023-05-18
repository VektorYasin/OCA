package Q119;

public class App {
    String greet = "Welcome!";

    public App() {
        String greet = "Hello!";
    }

    public void setGreet() {
        String greet = "Good Day!";
    }

    public static void main(String[] args) {
        App t = new App();
        String greet = "Good Luck!";
        System.out.println(t.greet);//t objesi ile Instance variable çağrılıyor.
        // Welcome

    }
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
answer C

When the main() method is executed,
an instance of the App class is created with App t = new App();.
Then, System.out.println(t.greet);
prints the value of the instance variable greet, which is "Welcome!".

The local variables defined within the constructor,
method, and main() method have no impact
on the value of the instance variable greet because
they are separate variables with limited scope.
 */
