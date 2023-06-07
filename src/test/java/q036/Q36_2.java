package q036;

public class Q36_2 {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + " "); //1. arr[0] =String "A"

            if (arr[i].equals("C")) {

                continue;
            }

            System.out.println("Work Done");  // printed out
            break;
        }


    }
}//A Work done
