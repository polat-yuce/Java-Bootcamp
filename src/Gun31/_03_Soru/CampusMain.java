package Gun31._03_Soru;

import java.util.Scanner;

public class CampusMain {
    public static void main(String[] args) {
        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        Okul okul1=new Okul();
        okul1.setAd("Yıldırım Ortaokulu");
        okul1.setKontenjan(3);

        do{
            System.out.print("Ögr.Adi=");String ad=okuStr.nextLine();
            System.out.print("Ögr.Soyadi=");String soyad=okuStr.nextLine();
            System.out.print("Ögr.Yaş=");int yas=okuInt.nextInt();

            if (yas <= 15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas); //her döngüde yeni ogr
                okul1.getOgrencileri().add(ogr);
            }
            else
                System.out.println("Öğrenci yaşı bu okul için uygun değil");

        }while (okul1.getOgrencileri().size()< okul1.getKontenjan());

        System.out.println("okul1 = " + okul1);
    }
}
