package q187;

public class Test{

    public static void main(String[] args) {
        if (args[0]=="Hello" ? true : false){
            System.out.println("Success");
        }else {
            System.out.println("Failure");
        }
    }
}

// And given the commands :
// javac Test.java  -->test classı çalıştırıldı
// Java Test Hello  --> Hello değeri girildi.

// What is the result?
// A Success

/*
Second Version
changed
inside if statement true and false is switched
answer is
succes
*/
/*
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
Komut satırında aşağıdaki şekilde "javac" komutunu kullanarak "derleme" işlemini
gerçekleştirebilirsiniz:

javac HelloWorld.java     javaC: C compiler demek
javac className.java--> komutu derler ve className.class uzantılı dosya oluşturulur.

Bu komut, "HelloWorld.java" dosyasını derleyerek "HelloWorld.class" adında
bir byte kodu dosyası oluşturacaktır. Ardından, elde edilen byte kodu
dosyasını çalıştırmak için java komutunu kullanabilirsiniz. Örneğin:
ClassName.class uzantılı dosyayı:

"java ClassName" komutu ile çalıştırırız.
java HelloWorld

Bu komut, HelloWorld sınıfının main metodu içindeki kodu yürüterek
"Hello, World!" çıktısını verecektir.
 */

