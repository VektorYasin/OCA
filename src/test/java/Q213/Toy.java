package Q213;

abstract class Toy {
    int price;
    //line n1;

//  which code fragments are valid at line n1?
//  A.
    public static void insertToy() {
    }

//  B.
//    final Toy getToy() {
//        return new Toy(); // We cannot create an instance of an abstract class.
//                            //abtsract classtan obje üretilemez.
//    }
//    c
//        public void printToy(); // abstract değil ve mothod body yok, body ekle

//    D.
        public int calculatePrice () {
            return price;
        }
//    E.
        public abstract int computeDiscount ();//absract ve metod bodysi yok.dogru

    }
//}
//    A. Option A
//    D. Option D
//    E. Option E
//Answer: A D E

