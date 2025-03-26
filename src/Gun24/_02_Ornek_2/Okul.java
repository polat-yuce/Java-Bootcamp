package Gun24._02_Ornek_2;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci();

        ogr1.okulNo=5;
        ogr1.ad="İsmet";
        ogr1.soyad="Temur";
        ogr1.sinif=7;
        ogr1.adres="Çekmeköy";

        System.out.println(ogr1.okulNo);
        System.out.println(ogr1.ad);
        System.out.println(ogr1.soyad);
        System.out.println(ogr1.sinif);
        System.out.println(ogr1.adres);
    }
}
