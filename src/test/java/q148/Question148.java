package q148;

public class Question148 {//150 ile yer degistirmis
}

class MyFile{
    public static void main(String[] args) {
        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];
        System.out.println("Arg is "+ arg3);
    }
}
// and this output:
// Arg is 2

//Which command should you run to obtain this output?
//C. java MyFile 1 2 2
//Answer: C

//second version

//public static void main(String[] args) {
//    String arg1 = args[1];
//    String arg2 = args[2];
//    String arg3 = args[3];
//    System.out.println("Arg is "+ arg3);
//}


//Answer javaMyFile 1 3 2 2
