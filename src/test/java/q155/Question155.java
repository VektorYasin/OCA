package q155;
public class Question155 {


    public static void main(String[] args) {


        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s: days){
            switch (s){
                case "sat"://boş geçer, break'e kadar devam eder.
                case "sun"://-1,-1
                    wd-=1;
                    break;
                case "mon"://1+2
                    wd++;
                case "wed"://2
                    wd+=2;
            }
        }
        System.out.println(wd);//3
    }

}


