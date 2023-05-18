package q075;

public class Test75 {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading Card");
        //exception hem run time da hem de complie time a bakiyor
    }

    void checkCard(int cardNo) throws RuntimeException {// line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) throws Exception {//Exception; must be caught or declared to be thrown
        // yukarida yazildigi icin buraya da atmak gerek Exception i
        Test75 ex = new Test75();
        int cardNo = 12344;
        ex.readCard(cardNo);   // line n2

        ex.checkCard(cardNo);  // line n3
    }
}
