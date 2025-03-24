package Gun04;

public class _05_Ornek2 {
    public static void main(String[] args) {
        String bagis1="700";  // String, kelime
        String bagis2="500";  // String, kelime

        System.out.println(bagis1+bagis2);  // 700500

        // Ama ben bunları sayı olarak toplamak istiyorum
        // bu durumda String -> int e dönüştürmem lazım.
        int rakamBagis1= Integer.parseInt(bagis1);  // Int.donusturInt("700")
        int rakamBagis2= Integer.parseInt(bagis2); // Parse : düzenleyip, dönüştürmek demektir

        int toplamBagis= rakamBagis1+rakamBagis2;
        System.out.println("toplamBagis = " + toplamBagis);

        //2.yol
        System.out.println(Integer.parseInt(bagis1)+Integer.parseInt(bagis2));
    }
}

//(int)"700"  -> 700
//        Int.donusturInt("700")
//   Double.donusturDouble("700")

