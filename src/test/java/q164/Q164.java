package q164;

import java.util.Arrays;

public class Q164 {

    public static void main(String[] args) {
        int[] intArr = {15, 30, 45, 60, 75};

        intArr[2] = intArr[4];//2.elementin değerine 4.elementin değerini ata
        intArr[4] = 90;//4.elementin değerini 90 yap

        System.out.println(Arrays.toString(intArr));
        //[15, 30, 75, 60, 90]

    }
}
