package Gun04;

public class _02_WideningCasting {
    public static void main(String[] args) {
        //  küçük alan -> büyüğe atılabiliyor (genişleme-Widening)
        // byte-> short-> int-> long-> float-> double
        // veri kaybı kesinlikle yok

        int sayi=9;
        long toplam=500;
        double oran=3.2;

        //sol taraf değer alan taraftır, sağ taraf değer veren tarafır
        oran=sayi;  // int -> double genişleme
        System.out.println("oran = " + oran);  // veri kaybı yok

        toplam=sayi;  // int -> long  genişleme
        System.out.println("toplam = " + toplam);  // veri kaybı yok

        oran=toplam; // long -> double
        System.out.println("oran = " + oran); //veri kaybı yok
    }
}
