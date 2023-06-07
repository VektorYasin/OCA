package q018;

public class Superr {
}
class Arac{
    String cekis="4W";
    int maxHiz=100;

    Arac(String cekis,int maxHiz){
        this.cekis=cekis;
        this.maxHiz=maxHiz;
    }

    public Arac() {
    }
}

class Otomobil extends Arac{
    String trans;
    Otomobil(String trans){
        this.trans=trans;
    }

    Otomobil(String cekis, int maxHiz, String trans){
        super(cekis, maxHiz);
        this.trans=trans;
    }

    public static void main(String[] args) {
        Otomobil c1=new Otomobil("AUto");
        Otomobil c2=new Otomobil("4w",150, "Manual");

        System.out.println(c1.cekis+" "+c1.maxHiz+" "+c1.trans);
        System.out.println(c2.cekis+" "+c2.maxHiz+" "+c2.trans);
    }



}