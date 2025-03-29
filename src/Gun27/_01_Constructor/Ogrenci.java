package Gun27._01_Constructor;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

   //Bu özel metodlara YAPICI metodlar denir : Constructor
   //nesne oluşturulurken yapılmasını istediklerimizi
   // burada yaptırabiliriz.
    Ogrenci(){// Çocuğun dünyaya gelme anı
        System.out.println("Nesne oluşturulma anı");
        System.out.println("denize git");
    }

    Ogrenci(int id, String ad, String soyad, int sinif){
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=sinif; //kendi sınıfına gelen sınıfı ata
    }


}
