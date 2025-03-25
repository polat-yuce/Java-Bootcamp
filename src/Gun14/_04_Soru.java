package Gun14;

public class _04_Soru {
    public static void main(String[] args) {
        // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        //  *****
        //  *****
        //  *****
        //  *****
        //  *****

        // sout("*")
        // iç içe 1 den fazla döngüye : NestedLoop
//        for(int satir=0;satir<5;satir++) { //5 kez çalışır
//
//            for (int i = 0; i < 5; i++)
//                System.out.print("*");  //5 tane yan yana yaz
//
//            System.out.println(); //yazdıktan sonra satır atla
//        }


        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
