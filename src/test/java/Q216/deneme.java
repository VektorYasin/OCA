package Q216;

class Urun {
    double fiyat;//200
}

 class Kontrol {
    public void updateFiyat(Urun urun, double fiyat) {
        fiyat = fiyat * 2;//100*2=200
        urun.fiyat = urun.fiyat + fiyat;//200+200=400
    }

    public static void main(String[] args) {
        Urun elma = new Urun();
        elma.fiyat = 200;
        double yeniFiyat = 100;

        Kontrol k = new Kontrol();
        k.updateFiyat(elma, yeniFiyat);//updatePrice metodu çalıştırıldı
        System.out.println(elma.fiyat + ":" + yeniFiyat);
        //the updated price of the product (prt.price) and
        // the original value of newPrice are printed to the console.
    }
}
/*
What is the result?
 C. 400.0 : 100.0
 */
