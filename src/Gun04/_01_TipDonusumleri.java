package Gun04;

public class _01_TipDonusumleri {
    public static void main(String[] args) {

        byte ogrNot1=9;
        byte ogrNot2=9;
        byte ogrNot3=10;
        byte ogrNot4=10;

        // byte ı int atınca herhangi bir problem çıkartmaz
        // küçük kova büyük kovaya aktarılıyor
        int toplamNot= ogrNot1+ogrNot2+ogrNot3+ogrNot4;

        // int i byte atarken , evet belki değeri uygun ama bunu kontrol etmen lazım
        // Büyük kovayı , küçük kovaya direk boşaltamazsın
        byte toplam2 =  (byte)toplamNot;
        // bu aktarımı yapabilmek için başına dönüştürelecek tip yazılır.
    }
}
