package q087;


public class Q87 {

}
class MarkList{
    int num ;
    public static void graceMarks(MarkList obj4){

        obj4.num += 10;
    }

        public static void main(String[] args) {
            MarkList obj1 = new MarkList();
            MarkList obj5 = new MarkList();
            MarkList obj2 = obj1;//obj2 is not explicitly created, but it refers to the same instance as obj1, which was created earlier.
            MarkList obj3 = null;//obj3 is a reference variable that is assigned null and does not point to any instance.
            obj2.num = 60;
            obj5.num = 80;
            graceMarks(obj2);

        }
    }

    /*
    How many MarkList instances are created in memory at runtime?
    A. 1
    B. 2
    C. 3
    D. 4
    Answer: B
    Three MarkList instances are created in memory at runtime: obj1, obj5.
    obj1 is created when the statement MarkList obj1 = new MarkList(); is executed.
    obj5 is created when the statement MarkList obj5 = new MarkList(); is executed.
     */

