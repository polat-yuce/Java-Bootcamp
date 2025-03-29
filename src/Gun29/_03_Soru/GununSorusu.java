package Gun29._03_Soru;

public class GununSorusu {
    int a;
    
    static int b=0;  // sen bitanesin
    
    void artir()
    {
        a++; // her nesne kendi a sını artırıyor
        b++; // tek bi tane kim artırısa kaldığı yerden devam ediyor sayac gibi
    }

    public static void main(String[] args) {
        GununSorusu gs1=new GununSorusu();
        gs1.a=5;
        
        GununSorusu gs2=new GununSorusu();
        gs2.a=7;
        
        //Soru 1:  a nın en son değeri kaçtır ?
        // HOCAM HANGİ a yı soruyorsun
        System.out.println("gs1.a = " + gs1.a);  //5
        System.out.println("gs2.a = " + gs2.a);  //7

        // Soru 2: b nin değeri şu an kaçtır ?
        System.out.println("b = " + b);  // 0

        //Soru 3:
        gs1.artir(); // gs1.a:6,   b:1
        gs2.artir(); // gs2.a:8    b:2
        // Şu an da a ve b nin değerleri kaçtır
        System.out.println("gs1.a = " + gs1.a); //6
        System.out.println("gs2.a = " + gs2.a); //8
        System.out.println("b = " + b);  //2
        
    }
    
    
    
}
