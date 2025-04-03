package Gun32._02_Inheritance;

public class Ordek extends Hayvan{
    private int kanatUzunlugu;

    public Ordek(String renk, double kilo, int no, int yas, int kanatUzunlugu) {
        super(renk, kilo, no, yas);
        setKanatUzunlugu(kanatUzunlugu);
    }

    @Override
    public String toString() {
        return super.toString()+",ku"+this.kanatUzunlugu;
    }

    @Override
    public void konustu() {
        System.out.println("Vak vakladı");
    }

    public int getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }
}
