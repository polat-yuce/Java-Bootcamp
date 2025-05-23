package Gun33._02_Soru;

public class Ogrenci {
    private final int id;
    private String isim;
    private OgrTip tipi;

    private static int sayac=1;

    public Ogrenci(String isim, OgrTip tipi) {
        this.id= sayac++;
        setIsim(isim);
        setTipi(tipi);
    }

    @Override
    public String toString() {
        return "Ogrenci " +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi
                ;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }


}
