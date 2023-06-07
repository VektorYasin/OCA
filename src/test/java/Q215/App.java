package Q215;

class LogFileException extends Exception {
}

class AccessViolationException extends RuntimeException {
}

public class App {
    public static void main(String[] args) throws LogFileException {//line2
        App obj = new App();
        try {
            obj.open();
            obj.process();
            //insert code here//line7
            //throw new LogFileException ();
        } catch (Exception e) {
            System.out.println("completed.");
        }
    }

    public void process() throws LogFileException {//line13
        System.out.println("Processed");
        throw new LogFileException();//checked(compile time) exception, must be handled.
    }

    public void open() {
        System.out.println("Opened.");
        throw new AccessViolationException();//runtime exception
    }
}
//    Which action fixes the compiler error?
//        A. At line 17, add throws AccessViolationException
//        B. At line 13, add throws LogFileException
//        C. At line 2, replace throws LogFileException with throws AccessViolationException
//        D. At line 7, insert throw new LogFileException ();
//Answer: D cvp B i think

// Exp: We have to extend the LogFileException to RunTimeException
//      to fix the error or add an exception to the method.
