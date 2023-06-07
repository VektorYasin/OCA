package q154;
import java.util.ArrayList;


public class Question154 {
	    public static void main(String[] args) {
	        ArrayList myList = new ArrayList();
	        String[] myArray;
	        try{
	            while(true){
				//infinite doner.
				// Memoriden kaynaklanan mainde bir hata olusur.
				//Memory overflow da hata yani.
	                myList.add("My String");
//	                System.out.println("While loop");
	            }
	        }catch (RuntimeException re){
	            System.out.println("Cought a RuntimeException");
	        }catch (Exception e){
	            System.out.println("Cought an Exception");
	        }
	        System.out.println("Ready to use");
	    }
	    //Exception in thread "main" java.lang."OutOfMemoryError":
		// Java heap space

	}/*
	Within the loop, the statement myList.add("My String") adds
	a string element to the myList ArrayList indefinitely.
Since there is no termination condition for the loop, it will continue
running endlessly, causing the program to consume more and more memory.
Eventually, the program will encounter an OutOfMemoryError due to
exceeding the available heap space, resulting in a runtime exception.

The catch blocks are defined to handle potential exceptions. However,
in this case, they won't be able to catch the OutOfMemoryError because
it is an Error subclass, not an Exception subclass. Therefore,
the program will terminate without executing the catch blocks.
	/*
	What is the result?
	C.	A runtime error is thrown in the thread "main".
	Answer: C

	 */
