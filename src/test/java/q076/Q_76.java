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

    protected void rotate(){ //make a protected line10
    }

}
/*
Which two modifications enable the code to compile? or question might be three modifications
A. Make the method at line 8 protected.
B.	Make the method at line 8 public.
C.	Make the method at line 10 protected.
D.	Make the method at line 4 public.
E.	Make the method at line 2 public.
Answer: AC veya BC ikiside calisir
 */
