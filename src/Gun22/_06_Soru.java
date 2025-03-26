package Gun22;

import Utility.MyFunc;
import apple.laf.JRSUIUtils;

import java.util.*;

public class _06_Soru {
    public static void main(String[] args) {
        // 10 elamanlı bir diziyi random(10(dahil) a kadar olan sayılarla
        // doldurduktan, tekrarlı değerleri almayacak şekilde yeni bir
        // diziye atınız.

//        Integer[] dizi=new Integer[10];
//
//        for (int i = 0; i < 10; i++)
//           dizi[i]= MyFunc.RndSayiVer(11);
//
//        System.out.println("dizi = " + Arrays.toString(dizi));
//
//        TreeSet<Integer> ts=new TreeSet<>();
//        //1 yöntem
//        for(Integer e : dizi)
//            ts.add(e);
//
//        System.out.println("ts = " + ts);
//
//        //2.Yöntem
//        TreeSet<Integer> ts2=new TreeSet<>( Arrays.asList(dizi) );
//        System.out.println("ts2 = " + ts2);
//
//        //3.Yöntem
//        TreeSet<Integer> ts3=new TreeSet<>();
//        Collections.addAll(ts3, dizi);
//        System.out.println("ts3 = " + ts3);


        Integer[] dizi=new Integer[10];
        for (int i = 0; i < dizi.length ; i++) {
            dizi[i]=(int)(Math.random()*11);
        }
        System.out.println("Dizi :"+Arrays.toString(dizi));

        Set<Integer> ts1=new HashSet<>(Arrays.asList(dizi));
        System.out.println("ts1 = " + ts1);

        Set<Integer> ts3=new TreeSet<>();
        Collections.addAll(ts3,dizi);
        System.out.println("ts3 = " + ts3);

        Set<Integer> ts4=new TreeSet<>();
        for (Integer  a:dizi)
            ts4.add(a);
        System.out.println("ts4 = " + ts4);

    }
}
