public class Ponchik extends Debily implements ThingActiony {
    public Ponchik(String name, double a, double b, SkinColor skinColor, String orientation, int age, int weight, int height) {
        super(name, a, b, skinColor, orientation, age, weight, height);
    }

    @Override
    public String ThingAction(Debily k, Thing s) {
        return s.temp.getTemp() + " " +  s.getName() + " начинает прожигать лицо бедного " + k.getName() + "a";
    }
}
