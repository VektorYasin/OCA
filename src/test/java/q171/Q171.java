package q171;

public class Q171 {

}
/*
 * 
 171. Which three statements are true about exception handling? (Choose three.) A. Only unchecked exceptions can be rethrown.
B. All subclasses of the RuntimeException class are not recoverable.
C. The parameter in a catch block is of Throwable type. 
D. All subclasses of the RuntimeException class must be caught or declared to be thrown. 
E. All subclasses of the RuntimeException class are unchecked exceptions.
F. All subclasses of the Error class are not recoverable. 
//Answer CEF (I Think)

 */
/*
C. The parameter in a catch block is of Throwable type.
The catch block can specify the type of exception it can handle by
using a parameter. The parameter type can be any class that is a
superclass of the caught exception, including Throwable.
This allows catching and handling specific types of exceptions or
their superclasses.

E. All subclasses of the RuntimeException class are unchecked exceptions:
RuntimeException and its subclasses are indeed unchecked exceptions.
Unchecked exceptions do not need to be declared in a method's throws
clause or explicitly caught.

F. All subclasses of the Error class are not recoverable: Error and its s
ubclasses represent serious, unrecoverable problems that typically occur
at a system level. Examples include OutOfMemoryError, StackOverflowError,
and VirtualMachineError. These exceptions usually indicate severe
problems that cannot be handled programmatically, and attempting
to recover from them is not recommended.
 */
