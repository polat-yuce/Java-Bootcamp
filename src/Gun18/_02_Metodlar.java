package Gun18;

public class _02_Metodlar {
    public static void main(String[] args) {
        // () metod veya fonksiyon : çalışan bir kod bloğu
        // () içindeki değerlere parametre denir

        double randomSayi= Math.random(); // parametre almıyor, geriye değer döndürüyor
        int max= Math.max(45,67); // parametre alıyor, geriye değer döndürüyor
        System.out.println(); // parametre almıyor, geriye de değer döndürmüyor

        System.out.println("Merhaba Dünya"); // parametre alıyor, geriye değer döndürmüyor

        int rndSayi=(int)(Math.random()*10); // Metodlarim.RndSayiVer(100);
        // daha anlaşılır, daha az ve tekrar yazmaktan kurtaran yöntem

        _03_Metodlar.merhabaYaz();// metodu her yerden çağırıp kullanabilirim
    }
}
