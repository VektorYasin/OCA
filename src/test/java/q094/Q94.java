package q094;
    public class Q94 {
    }

    class Person {
    String name;
    int age = 25;

    Person(String name) {    // line n1
        setName(name);
    }

    public Person(String name, int age) {    // line n2
        setName(name);
        setAge(age);
    }

    // setter and getter methods go here
    public void setName(String name) {
        this.name = name;//Jesse
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter", 52);

        System.out.println(p1.show());//Jesse 25

        System.out.println(p2.show());//Walter 52
    }
}
//Jesse 25
//Walter 52

/*
What is the result?
D. Jesse 25Walter 52
 */
