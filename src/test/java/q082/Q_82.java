package q082;

public class Q_82 {
}

class Alpha{
    int ns; //başlangıcta 0; ref1.ns=50; ref2.ns=125;  ref3.ns=100
    static int s; //baslangıcta 0; dikkat statik 50, 125

    Alpha(int ns){//constructor
        if(s<ns){//0<50, 50<125, 125<100 false
            s = ns;//50, 125 s değişmez
            this.ns = ns;//50, 125, değişmez 0
        }
    }

    void doPrint(){
        System.out.println("ns = "+ns+" s = "+s);
    }
}

 class TestA{
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);

        ref1.doPrint();//ns = "+50+" s = "+125
        ref2.doPrint();//ns = "+125+" s = "+125
        ref3.doPrint();//ns = "+0+" s = "+125
    }
}
//What is the result?
//B
//            ns = 50  s = 125
//            ns = 125  s = 125
//            ns = 0  s = 125
/*
static; tüm objeler için değişir, static olmayan obje değişkenleri değişmez.

Alpha ref1 = new Alpha(50); creates an instance of the Alpha class
with ns value of 50. Since s is initially 0, the condition s < ns is true,
and s is updated to 50. Therefore, the output is ns = 50 s = 50 for
ref1.doPrint().

Alpha ref2 = new Alpha(125); creates another instance with ns value of 125.
Since s is now 50, the condition s < ns is true, and s is updated to 125.
Therefore, the output is ns = 125 s = 125 for ref2.doPrint().

Alpha ref3 = new Alpha(100); creates a third instance with ns value of 100.
However, since s is already 125, the condition s < ns is false, and
no update is made to s or ns. Therefore, the output is ns = 0 s = 125
for ref3.doPrint(), where ns remains at its default value of 0.
 */

