package Gun03;

public class _06_Ornek {
    public static void main(String[] args) {
        // kişinin kilosunu(kg) ve boyunu(m) kendiniz veriniz.
        // kilo ve boy küsüratlı mesala 65.4 kilo, 1.65 m gibi
        // ekrana kilonuz : ....  ve boyunuz= .... yazdıktan sonra
        // vücut kitle indeksini bulunuz : kilo / (boy*boy)

        double boy=1.65;      // ondalıklı,kusuratlı,kesirli    float veya double
        double kilo=75.4;

        double kitleIndex= kilo / (boy*boy);

        System.out.println("kilonuz = " + kilo + "  boyunuz = " + boy);
        System.out.println("kitleIndex = " + kitleIndex);

        //2.Yol
        System.out.println("kitleIndex = " +  (kilo / (boy*boy))  );

        // ctrl+c   kopayalama,    ctrl+v  yapıştır
        
        
    }
}
