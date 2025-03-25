package Gun08;

public class _01_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) :  regex olarak neler yazılabiliyor google dan araştırılacak
        String s1="Merhaba12 Dünya23";

        System.out.println("s1 = " + s1);
        System.out.println("n,a,b -> _ = "       + s1.replaceAll("[nab]","_"));
        System.out.println("1,2,3 -> sil = "     + s1.replaceAll("[123]",""));
        System.out.println("rakamları -> sil = " + s1.replaceAll("[0-9]",""));
        System.out.println("rakamların dışındakileri -> sil = " + s1.replaceAll("[^0-9]","")); // ^ : dışındakiler demek
        System.out.println("a-z aralığını -> sil = " + s1.replaceAll("[a-z]",""));
        System.out.println("A-Z aralığını -> sil = " + s1.replaceAll("[A-Z]",""));

        System.out.println("harfleri -> sil = " + s1.replaceAll("[A-Z]","").replaceAll("[a-z]",""));


    }
}

//s1 = Merhaba12 Dünya23
//n,a,b -> _ = Merh___12 Dü_y_23
//1,2,3 -> sil = Merhaba Dünya
//rakamları -> sil = Merhaba Dünya
//rakamların dışındakileri -> sil = 1223
//a-z aralığını -> sil = M12 Dü23
//A-Z aralığını -> sil = erhaba12 ünya23
//harfleri -> sil = 12 ü23