package Gun33._02_Soru;

public class Okul {
    public static void main(String[] args) {
       OgrenciIlk io=new OgrenciIlk("ismet", OgrTip.ILK, "Satranç");
       OgrenciOrta oo=new OgrenciOrta("Ayşe", OgrTip.ORTA,"LGS");
       OgrenciLise ol=new OgrenciLise("Zeynep",OgrTip.LISE,"MF");

        System.out.println("io = " + io);
        System.out.println("oo = " + oo);
        System.out.println("ol = " + ol);

    }
}
