package Gun28._03_Protected.bir;

public class SaglikBakMain {
    public static void main(String[] args) {
        //burası kendi paketi
        Doktor d1=new Doktor();
        d1.adi="İsmet";
        d1.bolum="Dahiliye";
        d1.hastaneAdi="Ankara Hastanesi";

        Doktor d2=new Doktor("mehmet");
    }
}
