package q081;

public class Q_81 {
    //81. Which two code fragments cause a compilation error? (Choose two.)
    public static void main(String[] args) {
        //A.
        float flt = 100.00F;//True

        //B.
        float flt2 = (float) 1_11.00;//True; double cast yapılmıs floata

        //C.
//        Float flt3 = 100.00;// False (Wrapper class'ta da F i kullanmak gerekiyor.)
        Float flt3 = 100.00F;// dogrusu bu sekilde

        //D.
        double y1 = 203.22;
//        float flt4 = y1;  y1 double; casting gerekir
        float flt4 = (float) y1;//dogrusu bu; double cast yapılmıs floata

        //E.
        int y2 = 100;
        float flt5 = (float) y2;//true; int cast yapılmış floata

    }//C D
}