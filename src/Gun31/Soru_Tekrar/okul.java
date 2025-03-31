package Gun31.Soru_Tekrar;

import java.util.ArrayList;
import java.util.Set;

public class okul {
    private String okulAd;
    private int kontenjan;
    ArrayList<Ogrenci> öğrencileri=new ArrayList<>();

    public okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public ArrayList<Ogrenci> getÖğrencileri() {
        return öğrencileri;
    }

    public void setÖğrencileri(ArrayList<Ogrenci> öğrencileri) {
        this.öğrencileri = öğrencileri;
    }

    @Override
    public String toString() {
        return "okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan=" + kontenjan +
                ", öğrencileri=" + öğrencileri +
                '}';
    }
}
