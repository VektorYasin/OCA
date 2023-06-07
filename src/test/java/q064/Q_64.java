package q064;

    //MyString.Java:
    //package p1;

    class MyString {
        String msg;

        MyString(String msg){
            this.msg =msg;

        }
    }
    //Test.java:
    //package p1;
    public class Q_64 {
        public static void main(String[] args) {
            System.out.println("Hello "+ new StringBuilder("Java SE 8"));
        /*
        new StringBuilder("Java SE 8") creates a StringBuilder object.
        The toString() method of the StringBuilder class is invoked implicitly,
        resulting in the string "Java SE 8". Therefore, the output will be
        "Hello Java SE 8".
         */

            System.out.println("Hello "+ new MyString("Java SE 8"));
        /*
         new MyString("Java SE 8") does not override the toString() method
         from the Object class. As a result, the default implementation of
         toString() in the Object class is used, which returns
         a string representation of the object's class name followed by
         the object's hashcode.
         */

//          System.out.println("Hello "+ new MyString("Java SE 8").msg);
//          soruda .msg yok. O durumda hash code yazdirir

        }
    }

    /*

NOT: Q49_60.Q57 --> soruda p1 yani package name olarak verilmis
    What is the result?
    C
    Hello Java SE 8
    Hello Q49_60.Q57.MyString@<<hashcode1>>
*/