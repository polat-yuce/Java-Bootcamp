package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son karakterini yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir cumle giriniz=");
        String cumle=oku.nextLine(); //okuma kursörü burada çalışıyor

        int uzunluk=cumle.length(); // uzunluğunu buldum
        char sonKarakter= cumle.charAt(uzunluk-1); // uzunluğu buldum

        System.out.println("sonKarakter = " + sonKarakter); // son karakteri yazdırdım

        //2.Yol
        System.out.println("sonKarakter = " + cumle.charAt(cumle.length()-1)  );
    }
}

//Bu gün hava güzel
//01234567890
//
//        0 dan başlayan oda numaralarına
//        INDEX denir, ve karakterin yerini
//yani hafıza oda numarasını belrtir.
//
//charAt(3) -> g
//charAt(8) -> a
//charAt(1) -> u
//charAt(0) -> B
//charAt(length-1) -> l