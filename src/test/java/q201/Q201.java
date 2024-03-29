package q201;

import java.util.Arrays;

public class Q201 {
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {

        Student[] students = new Student[3];
//        students[0] = new Student("A");
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");

        for (Student s : students) {
            System.out.println(" " + s.name);
            /*
            student[0] is not assigned. NullPointerException
            NullPointerException: Cannot read field "name" because
            "s" is null
            NullPointerException is a runtime exception in Java that occurs
            when a variable is accessed which is not pointing to any object
            and refers to nothing or null.
             */
        }
    }

//second way
//
//        Student [] students= new Student[3];
//        students[1]=;hfder


//        students[2]=new Student("Donald");
//        for( Student s:students){
//            System.out.println(" "+s.name);
//        }
//    }
}

// What is the result?
/*
*A. nullRichardDonald
B. RichardDonald
C. Compilation fails
D. An ArrayOutOfBoundException is thrown at runtime
E. A NullPointerException is thrown at runtime.
*/


