package Q207;

public class Q207 {
    public static void main(String[] args) {
		int[][] arr = new int[2][4];//2 satır, 4 sütun

		arr[0] = new int[]{1, 3, 5, 7};
		arr[1] = new int[]{1, 3};
		//arr.lenght=2;

		for (int[] a : arr) {//length 2 oldugu icin 2 ye kadar olan degerleri veriyor
			for (int i = 0; i < arr.length; i++) {//arr.length=2;
				System.out.print(a[i] + " ");
			}
			System.out.println();
       }
	}
}
  /*
  	1 3
	1 3
   */