package q097;

    public class Q97b {
        public static void main(String[] args) {

            StringBuilder sb = new StringBuilder("Java");//değer Java olan sb objesi oluşturulur,
            String s = "Java";
            if (sb.equals(s)) {//toString yapılmamış
                System.out.println("Match 1");
            } else {
                System.out.println("Not Match");
            }
        }
    }

    //answer Not Match