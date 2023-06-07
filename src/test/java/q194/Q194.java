package q194;

import java.lang.reflect.Array;

    public class Q194 {
    }

    class Test{
        public static void main(String[] args) {
            //insert code here    //line 3
    //    	int [] array;
    //    	array = new int [2];
            int [] array = new int[2];
            array [0]= 10;
            array [1]= 20;
            System.out.println(array[0] + " : " + array[1] );
        }
    }

//Which code fragment, when inserted at line 3, enables the code to print 10:20?

/*
int[] numbers = new int[5];
the array "numbers" can hold five integer values, and
they will be initialized with the default value of 0

int[] numbers = {1, 2, 3, 4, 5};
The array "numbers" will be created with five elements and
initialized with the provided values.
 */