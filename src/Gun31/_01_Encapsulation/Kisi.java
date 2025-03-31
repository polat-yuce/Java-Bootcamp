package Gun31._01_Encapsulation;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
        if (yas > 0 && yas < 150)
            this.yas = yas;
        else
            System.out.println("hatalı yas");
    }
}
