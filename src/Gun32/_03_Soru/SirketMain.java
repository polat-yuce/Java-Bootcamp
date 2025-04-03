package Gun32._03_Soru;

public class SirketMain {
    public static void main(String[] args) {
        Calisan c1=new Calisan("ismet",10000,2);
        System.out.println("c1 = " + c1);
        System.out.println("c1.maasHesapla() = " + c1.maasHesapla());
        
        GenelMudur gm=new GenelMudur("Abdulkerim", 10000, 3, 20000);
        System.out.println("gm = " + gm);
        System.out.println("gm.maasHesapla() = " + gm.maasHesapla());
    }
}
