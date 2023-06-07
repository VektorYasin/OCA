package Q221;

import java.util.ArrayList;
import java.util.List;

public class Q221 {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("green");//0
        colors.add("blue");//1
        colors.add("red");//2
        colors.add("yellow");
        colors.remove(2);//elemanı sildi.

        System.out.println(colors);//[green, blue, yellow]

        colors.add(2, "cyan");
        System.out.println(colors);//[green, blue, cyan, yellow]

        colors.set(2,"magenta");//set() remove gibi, elemanı silip yenisini ekledi
        System.out.println(colors);//[green, blue, magenta, yellow]

        colors.add(2, "brown");//add() ekler, eleman silmez.
        System.out.println(colors);//[green, blue, brown, magenta, yellow]
    }
}
//    What is the result?
//        A. [green, red, yellow, cyan]
//        B. [green, blue, yellow, cyan]
//        C. [green, red, cyan, yellow]
//        D. An IndexOutOfBoundsException is thrown at runtime.
//        Answer: D  ama cevap B cikti
