package q088;

public class Q88 {
	public static void main(String[] args) {
        int x = 6;//5
        while (isAvailable (x)) {   //ln5  isAvailable() true dondugu muddetce metodun ıcıne gırer.
            System.out.print(--x);  //ln6
                                    //ln7
        }
    }
        public static boolean isAvailable (int x) {//bu methoddan sadece true false doner, x değerini etkilemez.
            return --x > 0? true:false; //ln12
        }
	}

	//which modification enables the code to print 54321?
	/*
	 *  A. Replace line 6 with System.out.print (--x);
		B. At line 7, insert x --;
		C. Replace line 5 with while (is Available(--x)) {
		D. Replace line 12 with return (x > 0) ? false : true;
		
		Answer: a
	 * 
	 */
