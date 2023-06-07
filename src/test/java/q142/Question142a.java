package q142;

public class Question142a {

	public static void main(String[] args) {
   int wd = 0;//-1,-2,0,-1
         String days[] = {"sun", "mon", "wed", "sat"};

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

  }
 /*
 * C. -1
 * D. Compilation fails.
    */

