package Gun13;

public class _04_For {
    public static void main(String[] args) {
        // 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        int sayac=1;
        while(sayac<=5)
        {
            System.out.println(sayac);
            sayac++;
        }

        // Java yı yazan abiler, ablalar demişler ki
        // bir döngünü başlangıcı belli, son bitişi belli ve artışı belli
        // ise DAHA KOLAYI var
        for(sayac=1;sayac<=5;sayac=sayac+1) // başlangıcı belli, şartı belli, artışı belli
        {
            System.out.println(sayac);
        }

        // Döngü Kuralı :
        // bir döngünün kaç kere döneceği belli ise : FOR
        // bir döngünü kaç kere döneceği belli DEĞİL ise : WHİLE
        // while durumnda Kontrol SONDA ise : DO_WHİLE
    }
}
