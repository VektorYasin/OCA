package q076;

public class Q_76 {

}
abstract class Planet{
    protected void revolve(){
    }

    abstract void rotate();
    }
class Earth extends Planet{
    protected void revolve(){ //protected yap, abstarct ile aynı olmalı line 8
    }

    protected void rotate(){ //make protected line10
    }

}
/*
Which two modifications enable the code to compile? or question might be three modifications
A. Make the method at line 8 protected.
C. Make the method at line 10 protected.
Answer: AC
 */
