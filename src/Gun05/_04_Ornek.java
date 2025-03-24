package Gun05;

import java.util.Scanner;

public class _04_Ornek {

    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını aynı anda alarak ekrana yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınızı ve soyadınızı giriniz=");
        String adSoyad=oku.nextLine();  // next: SADECE bir KELİME
        // nextLine : satırdaki bütün kelimeleri

        System.out.println("adSoyad = " + adSoyad);
    }
}
