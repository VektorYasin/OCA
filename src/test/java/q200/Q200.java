package q200;

import java.util.ArrayList;
import java.util.List;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}

public class Q200 {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);

        //int f = ps.indexOf(p2);
        // f'nin int tipinde bir degisken oldugunu
        // f>=0 dan anliyoruz. O zaman bize int donduren bir method
        // akla getirmeli o da indexOf(p2)tur. bir elemanin indexsini bulur
        //  indexlerde integerdir

        int f = ps.indexOf(p2);
        if (f >= 0) {
            System.out.println("Mike found");
        }
    }
}
      /*
		 Patient p = new Patient("Mike");
		 ps.add(p);
		 int f = ps.indexOf(p);
		 System.out.println(ps.indexOf(p));

		 bu sonuc -1 veriyor, yani bu deger burada yok ancak
		 D secenegine ps.add(p); eklenseydi bize Mike found verirdi

   */