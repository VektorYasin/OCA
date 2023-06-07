package q166;

public class Q166 {

    public static void main(String[] args) {
        int x = 100;
        int a = x++;//a=100 x=101 a'ya x'i ata, sonra artır.
        int b = ++x;//b=102 x=102 x'i artırıp b'ye ata
        int c = x++;//c=102 x=103 x'i c'ye ata, x'i artır.

        System.out.println("a: "+ a);//100
        System.out.println("b: "+b);//102
        System.out.println("c: "+c);//102
        System.out.println("x: "+x);//103

        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;
        //(a < b) ise (a < c) mi bak
        ////(a < b) değilse x yazdır.

        System.out.println(d);//100
    }
}
//değişkeni null'a atayarak reference bağlantısı acıkta bırakılır
// bu sayede garbage collector onu silmesi gerektiğini anla
