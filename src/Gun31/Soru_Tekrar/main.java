package Gun31.Soru_Tekrar;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        okul okul1 = new okul("Bisaş Ortaokulu", 2);
        do {
            System.out.print("Ogr adı :");
            String ad = okuStr.nextLine();
            System.out.print("Ogr soyadı :");
            String soyad = okuStr.nextLine();
            System.out.print("Ogr yas :");
            int yas = okuInt.nextInt();

            if (yas <= 15) {
                Ogrenci ogr = new Ogrenci(ad, soyad, yas);
                okul1.getÖğrencileri().add(ogr);
            } else
                System.out.println("Öğrenci yaşı bu okul için uygun değil");
        } while (okul1.getÖğrencileri().size() < okul1.getKontenjan());
        System.out.println("okul1 = " + okul1);


    }
}
