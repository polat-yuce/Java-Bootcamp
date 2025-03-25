package Gun11;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // Math.Random() : double sayı üretir. 0-0.99999999 arası bir sayı üretir
        // 0.23434343, 0.6767676,  0.988888

        System.out.println(Math.random());

        int randomTamSayi = (int)(Math.random()*10);
        System.out.println(  randomTamSayi  );  // 1-9 : 10 a kadar

        int randomTamSayi2 = (int)(Math.random()*100);
        System.out.println(  randomTamSayi2  );  // 1-99 : 100 a kadar

        int randomTamSayi3 = (int)(Math.random()*20);
        System.out.println(  randomTamSayi3  );  // 1-19 : 20 ye kadar

    }
}
// Kural: Kaça kadar random TAM sayı istiyorsan onunla çarp, INT e çevir.
