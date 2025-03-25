package Gun10;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 456 67

       // sayıları giriniz= 23 2378
       // sayılar aynı anda yan yana boşluklu girilmesi lazım

        Scanner oku=new Scanner(System.in);
        System.out.print("Yan Yana 1 boşluk ile 2 adet sayı giriniz=");
        String strSayilar=oku.nextLine(); //4567 6

//        int boslukIndex= strSayilar.indexOf(" ");  // busluk uğun index ini bulduk
//        String strSayi1= strSayilar.substring(0, boslukIndex); //4567  1.Sayıyı bulduk
//        String strSayi2= strSayilar.substring(boslukIndex+1);  //6     2.Sayıyı bulduk
//
//        if (strSayi1.equals(strSayi2))  // sayı görünümlü olsa da STRİNG olduklarından equals kullanılabilir
//            System.out.println("Eşit");
//        else
//            System.out.println("Değil");

        int boşlukIndex=strSayilar.indexOf(" ");
        String s1=strSayilar.substring(0,boşlukIndex);
        String s2=strSayilar.substring(boşlukIndex+1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
