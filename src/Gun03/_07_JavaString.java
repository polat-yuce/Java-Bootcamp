package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {

        int sayi=0;   // int : değişkenin tipin, sayi: değişkenin adını,
        // 0 : başlangıç değerini gösterir

        String ad="İsmet";

        System.out.println("sayi = " + sayi);
        System.out.println("ad = " + ad);

        String soyad="Temur";

        String tamAd=ad+" "+soyad;   // İsmet Temur
        System.out.println("tamAd = " + tamAd); // 1.Yöntem
        System.out.println("Tam Ad = "+ ad+" "+soyad); // 2.Yöntem
    }
}
// çift tırnak arasındaki ifadeler aynen ekrana yazılır, diğerlerinin ise
// değeri ekrana çıkar, + ise bunları yan yana birleştirir.
// String : kelimeleri saklamak için, int ise sayıları saklamak için kullanılır
