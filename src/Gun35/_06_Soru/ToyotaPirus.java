package Gun35._06_Soru;

public class ToyotaPirus extends Vehicle implements IElektrik,IGas{
    public ToyotaPirus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("10 bin de bir battery değiştir");
    }

    @Override
    public void changeOil() {
        System.out.println("her 500km de benzin al");
    }

    @Override
    public String drive() {
        return "istediğin gibi sür";
    }
}
