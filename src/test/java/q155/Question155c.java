package q155;
public class Question155c {


    public static void main(String[] args) {

    int wd = 0;
          String days[] = {"sun", "mon", "wed", "sat"};

          for (String s: days){
              switch (s){
                  case "sat"://burda işlem yapmıyor, boş işlem
                  case "sun"://-1,-1
                      wd-=1;
                      break;
                  case "mon"://1
                      wd++;
                      break;
                  case "wed"://+2
                      wd+=2;
              }
          }
          System.out.println(wd);
      }

  }
//cevap 1
