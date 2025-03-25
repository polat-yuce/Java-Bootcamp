package Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Girilen bir cümlede a harfinin geçip geçmediğini
        // bulunuz geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Cumle giriniz= ");
        String cumle=oku.nextLine();

        boolean varMI= cumle.contains("a");

        if (varMI == true)
            System.out.println("EVET");

        if (varMI == false)
            System.out.println("HAYIR");
    }
}
