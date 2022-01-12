public class Neznaika extends Debily implements ThingActiony, Move, Death {
    public Neznaika(String name, double a, double b, SkinColor skinColor, String orientation, int age, int weight, int height) {
        super(name, a, b, skinColor, orientation, age, weight, height);
    }

    @Override
    public String Moving(Debily k, Debily x) {
        return k.getOrientation() + " " + k.skinColor.getSkinColor() + " " + k.getName() + " взмахнул кулаком и нанес удар " + x.getName() + "у";
    }

    @Override
    public String ThingAction(Debily k, Thing x) {
        return k.getName() + " " + "от своего же удара отлетел и ударился головой о " + x.getName();
    }

    @Override
    public String Dead(Debily m) {
        return "У " + m.getName() + " отрывается тромб и он умирает из-за слишком резкого замаха руки";
    }
}