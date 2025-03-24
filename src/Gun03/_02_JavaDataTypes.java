package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {

        int sayac=3;  // hafızada INT yani tam sayı saklayacak kadra RAM den yer ayırdı
        // ve adına sayac dedi

        //tam sayılar
        byte byteDeger=7;    // -128  ,  127  arası kadar değerler alabilir
        short shortDeger=1645;   // -32000, 32000 arası
        int intDeger=2500000;  // -2,5 mil,  +2,5 mil arası
        long longDeger= 33333344444444L;  // default olarak rakamları int kabul ettiğinden
        // uzun rakamlarda mutlak sonuna L konulmalı.

        // Ondalıklı, küsüratlı sayılar
        double doubleDeger= 3.1455566666677777; // 14 haneye kadar hassasiyeti var
        float floatDeger= 3.141234F; // ondalıklı sayı default DOUBLE olarak görüldüğünden
        // float olacaksa sonuna F konur

        // kelime, harf
        char basHarf='A';  // harfler tek tırnak arasında gösterilir
        String isim="Ahmet"; // kelimeler çift tırnak arasında gösterilir.

        // so ya bastığınızda soutv seçilirse , değişken yazılacağınız anlar, ve kendisi formatlı yazdırır
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);

        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);

        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);

        // Notlar
        //1-  float işlemlerde ve literatürde kararsız sayı olarak adlandırılır, genelde kullanılmaz.
        //2-  Genelde en iyi kullanım açısından TAM SAYILAR İÇİN : int kullanılır
        //                                      Ondalıklı sayılar için : double kullanılır
        // Bu sebeple Genelde kullanılacak olan : int,double,char,String

    }
}
