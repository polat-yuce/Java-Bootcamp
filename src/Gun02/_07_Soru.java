package Gun02;

public class _07_Soru {
    public static void main(String[] args) {

        int kenar = 5;  // Şeklinde verilen KARE bir tarlanın çevresini uzunluğunu bulup yazdırınız

        //Benim çözümüm
        System.out.println("KARE bir tarlanın çevresini : "+4*kenar);

        // Hocanın çözümleri
        int cevre= kenar+kenar+kenar+kenar;  // 4*kenar;

        System.out.println("Çevre="+cevre);

        //2.Yol
        System.out.println("Çevre="+  (4*kenar) );   // Çevre= (4*kenar)

        //3.yol
        System.out.println("Çevre="+ (kenar+kenar+kenar+kenar));

        //4.yol
        System.out.println(4*kenar);
    } // Dur
}


/*
1-Başla
2-kenar oku
3-cevre=kenar+kenar+kenar+kenar
4-cevre yaz
5-dur
*/
