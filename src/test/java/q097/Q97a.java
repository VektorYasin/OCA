package q097;

    public class Q97a {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder(5);
            String s = "";
            System.out.println(s);//boşluk yazdırır
            if (sb.equals(s)) {//sb.nin toString yapılması gerekir.
                System.out.println("Match 1");
            } else if (sb.toString().equals(s.toString())) {//s.toString redundant. ama kd çalışır
                System.out.println("Match 2");
            } else {
                System.out.println("Not Match");
            }
        }
    }

    //answer Match 2

//third virdsion
//StringBuilder sb = new StringBuilder("Java");
//String s = "Java";
//if(sb.equals(s)){
//  System.out.println("Match 1");
//}else {
//  System.out.println("Not Match");
//}

