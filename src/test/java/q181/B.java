package q181;

public class B {
    private int doStuff(){
        int x = 100; //only final is permitted
//  variable declaration "private int x = 100;" is incorrect because
//  local variables cannot have access modifiers.
        return x++;
    }

 //  }
}
