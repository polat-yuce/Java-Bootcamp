package Gun06;

public class _03_StringLength {
    public static void main(String[] args) {
        // StringLength  -> bir Stringin uzunluğunu verir.(Kaç tane harf var)

        String cumle="Bu gün hava hem yağmurlu hem güneşliydi"; //boşluk da bir harf gibidir.

        int uzunluk= cumle.length(); // cumlenin içindeki değerin kaç karakter olduğunu verir

        System.out.println("uzunluk = " + uzunluk);
    }
}
