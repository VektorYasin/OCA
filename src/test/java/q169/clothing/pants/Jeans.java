package q169.clothing.pants;



//line 1

//import static q169.clothing.Shirt.getColor;//methodu çağırdık
//              package       class  method
//import static q169.clothing.Shirt;//methodu çağırdık



import static q169.clothing.Shirt.getColor;

public class Jeans {

    public void matchShirt() {
        String color= getColor();//line n2
        if(color.equals("Green")) {//color variable tanımla, green veren methodu çağır
            System.out.println("FIT");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();

    }
}
//Answer
//A). At line n1 insert: import clothing.Shirt;
// At line n2 insert: String color = Shirt.getColor();

//C). At line n1 insert: import static clothing.Shirt.getColor;
// At line n2 insert: String color = getColor();
