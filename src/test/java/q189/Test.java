package q189;

public class Test {

    public static int stVar = 100;//Since stVar is a static variable, it is shared among all instances of the class.
    public int var = 200;// each instance has its own copy of the var variable.

    public String toString() {
        return stVar + ":" + var;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.var = 300;//var=300; stVar=100
        System.out.println(t1);//implicitly call toString().
        Test t2 = new Test();
        t2.stVar = 300;//var=200; stVar=300
        System.out.println(t2);//implicitly call toString().
    }
}
/*
Since var is a non-static instance variable, each object has its
own copy of this variable. Therefore, t1.var is assigned a value of 300.

*When t1 is printed using System.out.println(t1),
the toString() method is implicitly called. The toString() method
returns the concatenation of stVar and var as a string,
which results in "100:300".

 */
/*
What is the result?
D. 100:300
    300:200
Answer: D
 */