//package q185;
//
//    package p1;
//    public class A {
//    }
//
//    package p1.p2;
//    //line 1
//    // import p1.A;(import kuralı:   package.class name)
//    public class B{
//        public void doStuff(){
//            A b= new A();//A classını kullanmak için package ile birlikte import et
//        }
//    }
//
//    package p3;
//    //line 2
//    import p1.A;
//    import p1.p2.B;
//    public class C{
//        public static void main(String[] args) {
//            A o1= new A();//import et A classını
//            B o2 = new B();//B classını import et
//        }
//    }
//
///*
//replace line 1 with:
//import p1.A;
//
//replace line 2 with;
//import p1.A;
//import p1.p2.B;
// */
