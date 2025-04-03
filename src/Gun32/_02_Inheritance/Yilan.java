package Gun32._02_Inheritance;

public class Yilan extends Hayvan{
    private String ZehirTuru;

    public Yilan(String renk, double kilo, int no, int yas, String zehirTuru) {
        super(renk, kilo, no, yas);
        setZehirTuru(zehirTuru);
    }

    @Override
    public void konustu() {
        System.out.println("Tısss ladı");
    }

    @Override
    public String toString() {
        return super.toString()+", zü="+getZehirTuru();
    }

    public String getZehirTuru() {
        return ZehirTuru;
    }

    public void setZehirTuru(String zehirTuru) {
        ZehirTuru = zehirTuru;
    }
}
