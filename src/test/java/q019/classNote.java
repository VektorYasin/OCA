package q019;

public class classNote {
    String classNote;
}

/*
19. Which three statements are true about the structure of a Java class?
(Choose three.)
A. A class cannot have the same name as its field.  FALSE  field yani variable class ile aynı isme sahip olabilir.

B. A public class must have a main method.  FALSE main method zorunlu değil.

C. A class can have final static methods.  TRUE
This statement is true. In Java, a class can have final static methods.
Final methods cannot be overridden in subclasses, and
static methods are associated with the class itself rather than
instances of the class.

D. A class can have overloaded private constructors.   TRUE
 In Java, a class can have multiple constructors, including private constructors.
 Overloading the constructors allows different ways to create objects of the class.

E. Fields need to be initialized before use.  TRUE
In Java, instance variables (fields) of a class must be initialized before they are
accessed or used. If not explicitly initialized, they are assigned default values
(e.g., 0 for numeric types, null for reference types) by the compiler.

F. Methods and fields are optional components of a class.FALSE
 */