package Q216;

class Product {
    double price;//200
}

public class Test {
    public void updatePrice(Product product, double price) {
        price = price * 2;//100*2=200
        product.price = product.price + price;//200+200=400
    }

    public static void main(String[] args) {
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Test t = new Test();
        t.updatePrice(prt, newPrice);//updatePrice metodu çalıştırıldı
        System.out.println(prt.price + ":" + newPrice);
        //the updated price of the product (prt.price) and
        // the original value of newPrice are printed to the console.
    }
}
/*
What is the result?
 A. 200.0 : 100.0
 B. 400.0 : 200.0
 C. 400.0 : 100.0
 D. Compilation fails.
  Answer: C

 */
