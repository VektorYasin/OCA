package Q114;

public class Q114 {
    public static void main(String[] args) {
        String[][] arr={{"A","B","C"},{"D","E"}};

        for (int i=0; i<arr.length; i++){//2

            for (int j = 0; j < arr[i].length; j++) {// 3

                System.out.println(arr[i][j]+" ");//00A, 01B, 10D, 11E

                if(arr[i][j].equals("B")){
                    break;//ILK LOOPA GİDER
                }
            }
            continue;
        }
    }
    /*What is the result?
     A. A B C
     B. A B C D E
     C. A B D E
    D. Compilation fails.
    Answer: C

     */
}
