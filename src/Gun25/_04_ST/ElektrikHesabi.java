package Gun25._04_ST;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=20;

     void TüketimEkle(int tüketim){
        this.toplamTuketim+=tüketim;
    }

     void ToplamTuketimYaz(){
        System.out.println("Toplam tüketim :"+this.toplamTuketim);
    }
     void faturaYaz(){
        System.out.println("***   Faturanız   ***");
        System.out.println("Toplam Ücret:"+(this.toplamTuketim*this.birimFiyat)+"₺");
    }
}
