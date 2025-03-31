package Gun31._01_Encapsulation;

public class ToplulukMain {
    public static void main(String[] args) {
        Kisi k1=new Kisi();
        k1.ad="İsmet";
        k1.soyad="Temur";
        //k1.yas=-2;

        k1.setYas(-2);
        k1.setYas(40);

        //yani değerler nesneye atanırken
        // kontrolden geçmeli doğru DATA için

        System.out.println(k1.getYas());

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gonderme
        // ve alma
        // işlemine Encapsulation denir.
    }
}
