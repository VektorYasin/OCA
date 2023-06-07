package q193;

public class Q193_2 {
    public static void main(String[] args) {

        int sum = 0;
        int xVal;
        for (xVal = 1; xVal <= 5; xVal++) {//for loop, süslü ayıraç içinde döner, en son çıkar
            sum = sum + xVal;
        }
        System.out.println("The sum of " + xVal + " number is: " + sum);
    }
}
//*answer==The sum of 6 number is: 15
