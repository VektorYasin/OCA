package q195;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Q195 {
    public static void main(String[] args) {
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";

        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        System.out.println(Arrays.deepToString(shirts));
        //[[red, blue], [small, medium]]

        for (String[] c : shirts) {
            for (String s : c) {
                System.out.print(s + ":");

            }

        }
        System.out.println("\n");//red:blue:small:medium:
    }
}
//Which code fragment prints red: blue: small: medium?
////A
//        for(int index = 1; index <2; index++){
//            for(int idx = 1; idx <2; idx++){
//                System.out.print(shirts[index][idx]+":");
//            }
//        }

////B
////        for(int index = 0; index <2; ++index){
////            for(int idx = 0; idx <index; ++idx){
////                System.out.print(shirts[index][idx]+":");
////            }
////        }

////C
//        for(String [] c : shirts){
//            for (String s : c){
//                System.out.print(s+":");
//            }
//        }

////D
//        for(int index = 0; index <2; ){
//            for(int idx = 0; idx <2; ){
//                System.out.print(shirts[index][idx]+":");
//                idx++;
//            }
//            index++;
//        }
//    }
//}


