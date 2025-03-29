package Gun28._03_Protected.bir;

public class Doktor {
    public String hastaneAdi; // herkes erişebilir
    String adi; // aynı pokettekiler
    private String sicilNo; //sadece classın içinden erişilebilir
    protected String bolum; //default gibi

    Doktor(){  // kendi paketindekier
    }

    public Doktor(String adi){ //herkes
        this.adi=adi;
    }

}
