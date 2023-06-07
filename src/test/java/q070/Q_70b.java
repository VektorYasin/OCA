package q070;

public class Q_70b {
    public static void main(String[] args) {
        int x = 10;
        int y= ++x; //11
        int z = 0;

        if (y >= 10 | z <= ++x) {  //x=12 burası çalışır.
            z = x; //12

        } else {
            z = x++;
        }
        System.out.println(z);//12


    }
}
   /*
What is the result?
C. 12
 */