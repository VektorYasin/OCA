package q169.clothing;
//cikmis



public class Shirt {
    public static String getColor() {
        return "Green";
    }

}


//import clothing.Shirt  --->clothing: package name  --->shirt: class name
//import clothing.Shirt;--> class'ı çağıracağız
//import static clothing.Shirt.getColor:  ya da doğrudan methodu çağıracağız
//Answer
//A). At line n1 insert: import clothing.Shirt;At line n2 insert: String color = Shirt.getColor();
//C). At line n1 insert: import static clothing.Shirt.getColor;At line n2 insert: String color = getColor();
