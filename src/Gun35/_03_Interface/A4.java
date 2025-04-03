package Gun35._03_Interface;

public class A4 implements IYazdirir,IGosterir{

    @Override
    public void goster() {
        System.out.println("gösterildi");
    }

    @Override
    public void yazdir() {
        System.out.println("yazdırıldı");
    }
}
