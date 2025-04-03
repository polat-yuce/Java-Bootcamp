package Gun34._02_PolySoru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public void KimlikYaz(Kisi gelenKisi)
    {
        System.out.println("\n\n*** Kimlik Belgesi ***");
        System.out.println("Adı = " + gelenKisi.ad);
        System.out.println("Soyadi = " + gelenKisi.soyad);
        System.out.println("Görevi = " + gelenKisi.gorevi);

        if (gelenKisi instanceof Ogrenci)
            System.out.println("Şubesi = " +
                    ((Ogrenci)gelenKisi).getSubesi());

        if (gelenKisi instanceof Calisan)
            System.out.println("Departmani = " +
                    ((Calisan)gelenKisi).getDepartman());

    }

    public void KimlikYaz2()
    {
        System.out.println("\n\n*** Kimlik Belgesi ***");
        System.out.println("Adı = " + this.ad);
        System.out.println("Soyadi = " + this.soyad);
        System.out.println("Görevi = " + this.gorevi);

        if (this instanceof Ogrenci)
            System.out.println("Şubesi = " + ((Ogrenci)this).getSubesi());

        if (this instanceof Calisan)
            System.out.println("Departmani = " +
                    ((Calisan)this).getDepartman());
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }
}
