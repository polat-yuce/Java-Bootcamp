package Gun22;

import java.util.ArrayList;
import java.util.HashSet;

public class _02_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hs1=new HashSet<>();

        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);

        System.out.println("hs1 = " + hs1);

        //bakalım tekrar ekleyecek mi
        boolean eklediMi=hs1.add(4);
        hs1.add(2);

        System.out.println("hs1 = " + hs1);

    }
}
