package Gun34._01_Polymorphism;

import java.util.*;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabaş");
        kopek1.ses(); // havladı
        kopek1.kokladi(); //kokladı

        Kedi kedi1=new Kedi("köpük");
        kedi1.ses(); // miyavladı
        kedi1.tirmaladi(); // tırmaladı

        System.out.println("----------");
        kopekSesi(kopek1); //havladı
        kediSesi(kedi1); // miyavladı


        System.out.println("---------");
        hayvanSesi(kopek1); // havladı
        hayvanSesi(kedi1); // miyavladı
        // hem kendi türünde hem de extend olduğu tür
        // de de olabilmesine çok biçimlilik yani
        // Polymorphism denir

        // eşitliğin solundaki genel adı, sağındaki özel adı
        //Referans Tipi   // Nesne Tipi
        Hayvan hay1=new Hayvan("kurbağa");
        Hayvan kopek2=new Kopek("kangal"); // Hayvan kılığında köpek
        Hayvan kedi2=new Kedi("boncuk"); // Hayvan kılığında kedi
        kopek2.ses(); // sadece bulunduğu kılığındaki metodları geçerli
        kedi2.ses(); // sadece bulunduğu kılığındaki metodları geçerli
        ((Kopek)kopek2).kokladi();

        HashMap<String,String> hm1=new HashMap<>();
        HashSet<String> hs1=new HashSet<>();
        ArrayList<String> list1=new ArrayList<>();

        Map<String,String> hm2=new HashMap<>(); // Maplerden HasMap
        List<String> list2=new ArrayList<>(); // Listlerden ArrayList
        Set<String> hs2=new HashSet<>(); // Setlerden HashSet
    }

    // kılık değiştirmeye : Polymorphism : şizofren
    public static void hayvanSesi(Hayvan h1)
    {
        h1.ses(); //yani nesnenin metodu değil türün ortak metodunu kullanıyoruz

        //h1 aslında sen kopeksen , köpeğe dönüş ve kokla
        if (h1 instanceof  Kopek) //kopekten geldiysen
            ((Kopek)h1).kokladi();

        if (h1 instanceof Kedi) // Kedi den geldiysen
            ((Kedi)h1).tirmaladi();
    }// faydası: ortak yerden miras alnlara ORTAK METDOLAR yazılabilir.

    public static void kopekSesi(Kopek k1)
    {
        k1.ses();
    }

    public static void kediSesi(Kedi k1)
    {
        k1.ses();
    }


}
