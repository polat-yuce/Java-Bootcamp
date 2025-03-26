package Gun25._04_ST;

public class Enerjisa {
    public static void main(String[] args) {
        Musteri musteri=new Musteri();
        musteri.name="Polat";
        musteri.aHesabi.TüketimEkle(100);
        musteri.aHesabi.TüketimEkle(200);
        musteri.aHesabi.TüketimEkle(300);

        musteri.aHesabi.ToplamTuketimYaz();
        System.out.println();
        musteri.aHesabi.faturaYaz();




    }
}
