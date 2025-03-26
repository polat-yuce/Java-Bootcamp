package Gun15;

public class _05_Soru {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz. trt, kanald,atv,fox,habertürk
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

//        String[] tvler={"trt","kanald","fox","habertürk","ntv"};
//
//        int randomIndex= (int)(Math.random()*5);  // 0,1,2,3,4
//
//        System.out.println("Seçilen Kanal= "+tvler[randomIndex]);

        String[] tv={"trt", "kanald","atv","fox","habertürk"};
        int random=(int) (Math.random()*5);
        System.out.println("Random tv: "+tv[random]);
    }
}
//String tvler=new String[5];  önce satırları seç sonra  ctrl+/
//tvler[0]="trt";
//tvler[1]="fox";
//tvler[2]="habertürk";
//tvler[3]="ntv";
//tvler[4]="kanald";

