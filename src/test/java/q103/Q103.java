package q103;

public class Q103 {

    public static void main(String[] args) {

        int x;
//	x = 100;
//while (x <= 100) {
//	x++;
//	System.out.println( "Welcome "+x);
//
//}


//which code fragment at line 10 prints Welcome 100?

//A.
//    for(x = 0; x<100; ++x) {
//        System.out.println( "Welcome "+x);//Welocme 1....99
//    }


//B.
	for(x = 100; x<=100; ++x) {
	System.out.println( "Welcome "+x);//Welcome 100
}


//C.
        x = 100;
        while (x <= 100) {
            x++;
            System.out.println("Welcome " + x);//Welcome 101
        }


//D.
        x = 100;
        do {
            ++x;
            System.out.println("Welcome " + x);//Welcome 101
        } while (x < 100);


//			A. Option A
//			B. Option B
//			C. Option C
//			D. Option D
//			Answer: B

    }
}