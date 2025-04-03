package Gun35._04_Interface;

public class A7 implements IGosterir,IYazdirir{

    @Override
    public void goster() {
        System.out.println("gösterildi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırıldı");
    }

    @Override
    public void yazdir(String mesaj) {
        System.out.println(mesaj);
    }
}
