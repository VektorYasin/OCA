package q058;

class Product {
    double price;
}
public class Test{
    public void updatePrice(Product product, double price) {
        price = price * 2;  //100*2=200
        product.price = product.price + price;//
    }

    public static void main(String[] args) {
        Product prt=new Product();
        prt.price=200;
        double newPrice=100;

        Test t=new Test();
        t.updatePrice(prt, newPrice);
        System.out.println(prt.price+ ": "+newPrice);
    }
}
//400,0 : 100,0