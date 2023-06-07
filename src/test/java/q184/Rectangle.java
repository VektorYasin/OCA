package q184;

public class Rectangle {
    private double length;
    private double heigth;
    private double area;

    public void setLength(double length) {
        this.length = length;
        setArea();
//        By calling the setArea() method within the setter methods,
//        you update the area value whenever the length or height is
//        modified.
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
        setArea();
    }

    private void setArea() {
        area = length * heigth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setHeigth(20);
        System.out.println(r.area);
    }
}

/*
Which two changes would encapsulate this class and ensure that the area field is always equal to length * height whenever the Rectangle class is used?
A.	Call the setArea method at the end of the setHeight method.
C.	Call the setArea method at the end of the setLength method.
Answer: AC

 */
