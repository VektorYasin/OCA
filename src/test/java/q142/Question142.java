package q142;

public class Question142 {

	public static void main(String[] args) {

		int wd = 0;//-1,-2,0,-1
        String[] days = {"sun", "mon", "wed", "sat"};

        for (String s: days){
            switch (s){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd-=1;
                    break;
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);//-1
    }
/*
This is because "sun" and "sat" trigger wd to be decremented twice by 1
(once for each case). Additionally, "mon" triggers wd to be decremented by 1
 again. Finally, "wed" triggers wd to be incremented by 2.
 Therefore, the final value of wd is -3.
 */
}


