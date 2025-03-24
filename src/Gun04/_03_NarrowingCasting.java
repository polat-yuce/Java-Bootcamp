package Gun04;

public class _03_NarrowingCasting {
    public static void main(String[] args) {
        // double -> float -> long-> int -> short -> byte
        // Narrowing Casting (manually)  -> Büyük kova -> Küçük kovaya boşaltılıyor

        int toplam=6750;   // 2.5 milyon
        byte sayi=5;       // -127 - 128

        sayi = (byte)toplam;   // Veri kaybı olmasa bile dikkatli olunmalı
        System.out.println("sayi = " + sayi); // veri kaybı var

        double oran=3.7;
        toplam = (int)oran;  // double -> int
        System.out.println("toplam = " + toplam);
        // veri kaybı var, ondalık kısım kayboldu
    }
}
