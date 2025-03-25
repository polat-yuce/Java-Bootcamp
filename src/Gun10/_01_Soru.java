package Gun10;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi(büyük veya küçük) geçiyorsa ekrana evet
        // yazdırın,  değilse  hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String cumle=oku.nextLine();

//        Eğer cumle uzunluğu 10 dan büyük ise ve içinde study kelimesi geçiyorsa
//                EVET yaz
//        Değilse
//                HAYIR yaz

        if (cumle.length() > 10 && cumle.toLowerCase().contains("study"))
            System.out.println("EVET");
        else
            System.out.println("HAYIR");

        //2.Yol
        if (cumle.length() > 10 && cumle.toUpperCase().contains("STUDY"))
            System.out.println("EVET");
        else
            System.out.println("HAYIR");

        //kopyalanacak alan seçiliyor sonra ctrl+c
        //yapıştırılacak yer egidilir ctlr+v
    }
}
