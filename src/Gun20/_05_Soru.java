package Gun20;

import java.util.ArrayList;
import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        String tercih = "";
        int toplam = 0;

        do {
            System.out.print("Not girigiz :");
            int not = okuInt.nextInt();
            notlar.add(not);
            toplam = toplam + not;
            System.out.print("Devam etmek istiyormusunuz (E/H) :");
            tercih= okuStr.nextLine();

        } while (tercih.equalsIgnoreCase("e"));
        System.out.println("toplam = " + toplam);

        int ort = toplam / notlar.size();
        System.out.println("ort = " + ort);

        int gecenSayı = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>ort)
                gecenSayı++;
        }
        System.out.println("gecenSayı = " + gecenSayı);

//        ArrayList<Integer> notlar = new ArrayList<>();
//        Scanner okuInt = new Scanner(System.in);
//        Scanner okuStr = new Scanner(System.in);
//        int toplam = 0;
//        String cevap = "";
//
//        do {
//            System.out.print("Not giriniz=");
//            int not = okuInt.nextInt();
//
//            notlar.add(not);
//            toplam = toplam + not;
//
//            System.out.print("Devam Etmek istiyor musunuz ? (E/H)");
//            cevap = okuStr.next();
//
//        } while (cevap.equalsIgnoreCase("E"));
//
//        int ort = toplam / notlar.size();
//
//        int gecenSayisi = 0;
//        for (int i = 0; i < notlar.size(); i++) {
//
//            if (notlar.get(i) >= ort)
//                gecenSayisi++;
//        }
//
//        System.out.println("gecenSayisi = " + gecenSayisi);

    }
}
//ArrayList<Integer> notlar=new ArrayList<>();
//Scanner okuInt=new Scanner(System.in);
//Scanner okuStr=new Scanner(System.in);
//int toplam=0; String cevap="";
//
//        do{
//                System.out.print("Not giriniz=");
//int not= okuInt.nextInt();
//
//            notlar.add(not);
//toplam=toplam+not;
//
//            System.out.print("Devam Etmek istiyor musunuz ? (E/H)");
//cevap=okuStr.next();
//
//        }while (cevap.equalsIgnoreCase("E"));
//
//int ort= toplam / notlar.size();
//
//int gecenSayisi=0;
//        for (int i = 0; i < notlar.size(); i++) {
//
//        if (notlar.get(i) >= ort)
//gecenSayisi++;
//        }
//
//        System.out.println("gecenSayisi = " + gecenSayisi);
