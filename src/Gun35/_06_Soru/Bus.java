package Gun35._06_Soru;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeDiesel() {
        System.out.println("Diesel al her 700km de");
    }

    @Override
    public String drive() {
        return "yavaş sür";
    }
}
