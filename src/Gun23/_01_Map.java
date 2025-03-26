package Gun23;

import java.util.HashMap;

public class _01_Map {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMAn

        // Map -> Anahtar + Set -> Anaharlı Set
        // Anahtar + Değer -> Key + Value

        // anahtarın ve valuenin tipini biz vereceğiz
        HashMap<Integer, String> hm=new HashMap<>();

        hm.put(1001, "İsmet Temur");
        hm.put(2001, "Engin");
        hm.put(2, "Ummuhan");
        hm.put(1003, "Merve");
        hm.put(1001, "Kübranur"); // aynı key e PUT yaptığınızda değeri günceller

        System.out.println("hm = " + hm);

        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.get(1003) = " + hm.get(1003));

        System.out.println("hm.containsKey(1003) = " + hm.containsKey(1003));
        System.out.println("hm.containsValue(Merve) = " + hm.containsValue("Merve"));

        System.out.println("hm.keySet() = " + hm.keySet()); // keyleri verir
        System.out.println("hm.values() = " + hm.values()); // değerleri verir

        hm.remove(2001);
        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);

    }
}
