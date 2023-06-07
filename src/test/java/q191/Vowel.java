package q191;

 class Vowel{
    private char var;
    public static void main(String[] args) {
        char var1 = 'a';
        char var2 = var1; //var2'nin ilk değer ataması
        var2 = 'e';  //var2'ye yeni atama yapıldı.

        Vowel obj1 = new Vowel();
        Vowel obj2 = obj1;
        // both obj1 and obj2 are referencing the same object.
       // Vowel obj2 = new Vowel();
        // object are equalized, so change on any one of them will affect both
        obj1.var = 'o';  // both are o
        obj2.var = 'i'; // both are i
        
        System.out.println(var1+ ", " +var2 );//a, e
        System.out.println(obj1.var+ ", " +obj2.var);//i, i
    }
}

/*
* What is the result?
* A.    a, e
*       i, i

* Answer: A
* */
