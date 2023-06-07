package Q223;

public class Q223 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        do {
            System.out.println(arr[i] + " ");//1,2,3,4,5, arrayOutOfBound exception
            i++;//1,2,3,4,5
        } while (i < arr.length + 1);//i<6

    }
}
/*What is the result?
A. 1 2 3 4 5 followed by an ArrayIndexOutOfBoundsException
 */