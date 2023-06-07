package q186;

class S1{
    public void display(int x){
        System.out.println("Parent" +x);//Parent 100
    }
}
class S2 extends S1 {
    public void display(int x, int y){
        this.display(x);//Child 10
        display(y);//Child 100
        super.display(y);//Parent classtaki display() çalıştırır.
    }
    public void display(int x){
        System.out.println("Child " +x);
    }
    public static void main(String[] args) {
        S2 sobj = new S2(); 
        sobj.display(10, 100);
    }
}

/*
What is the result?
A.  Child 10
    Child 100
    Parent 100
* */
