package q166;

import java.util.Scanner;

public class Q166b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen pozitif bir sayı giriniz");
        int sayi = input.nextInt();
        System.out.println("ternary ile çoz");

        String sonuc =
        (sayi > 0) ? (sayi > 99 & sayi < 1000) ?
                ("3 basamaklı 0'dan büyük sayi") :
                (sayi % 2 == 0) ? ("3 bas olm sayi") :
                        ("3 bas olm tek sayi") :
                ("lütfen pozitif bir sayı girin");

    }
}
//değişkeni null'a atayarak reference bağlantısı acıkta bırakılır
// bu sayede garbage collector onu silmesi gerektiğini anla
