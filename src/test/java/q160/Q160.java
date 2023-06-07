package q160;

public class Q160 {

    public static void main(String[] args) {
	int	x;
    /*insert code here to print "****"  */

        //A.
        x = 3;
        do {
            System.out.print("*");
            x--;
        } while (x>=0);

        //B.
//        x = 0;
//        do {
//            System.out.print("*");
//            x++;
//        } while (x>=3);

        //C.
//        x = 0;
//        do {
//            System.out.print("*");
//            ++x;
//        } while (x>3);

        //D.
//        x = 3;
//        do {
//            System.out.print("*");
//            x--;
//        } while (x!=1);


// * E dogru
        x = 0;
        do {
            System.out.print("*");//****
        } while (x++ < 3);//123
    }

}