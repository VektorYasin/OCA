package q162;

class Q162Student {
    String name;
    int age;
}


class Test {
    public static void main(String[] args) {
        Q162Student s1 = new Q162Student();
        Q162Student s2 = new Q162Student();
        Q162Student s3 = new Q162Student();
        s1 = s3;//both s1 and s3 refer to the same object
        s3 = s2;//s3 now refers to the object initially referred to by s2, and s1 still refers to the object initially referred to by s2.
	    s2=null;//line 11; makes s2 no longer reference any object;eligible for garbage collection
        System.out.println();

    }

}
/*
Which statement is true?
A. After line 11, three objects are eligible for garbage collection.
B. After line 11, two objects are eligible for garbage collection.
C. After line 11, one object is eligible for garbage collection.
D. After line 11, none of the objects are eligible for garbage collection.
 */
