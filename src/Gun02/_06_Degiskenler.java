package Gun02;

public class _06_Degiskenler {
    public static void main(String[] args) {
        int sayi; // bana int saklayabileceğim kadar hafızada yer ayır.
        // bu hafıza yerinin adına sayi dedik.

        int Sayi; //bu değişken yukarı değişkenden tamamen farklı
        int saYi; // bu da farklı bir değişken

        int toplam = 0;  // ; ben adımı tamamladım işleme al demektir
        int sayac = 0;

        sayi = 5;   // sayinin değer şu anda 5
        sayi = sayi + 1;  // sayinin değeri şu anda 6

        System.out.println("sayi"); // ekrana ne yazar ?  sayi
        System.out.println(sayi); // tırnaksız kullanırsan , yani değişkenin adını yazarsan
        // tırnak görmeyince DEĞERİNİ yazarım

        // sayinin değeri =  6    nasıl yazardım
        System.out.print("Sayının değeri=");
        System.out.println(sayi);

        // tek bir printte nasıl yazardım aynısını ?
        System.out.println("Sayini değeri=" + sayi);
        // + nın manası bir taraf kelime olunca birleştirmedir
    }
}
