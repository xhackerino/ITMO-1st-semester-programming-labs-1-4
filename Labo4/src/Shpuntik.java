public class Shpuntik extends Debily {
    public Shpuntik(String name, double a, double b, SkinColor skinColor, String orientation, int age, int weight, int height) {
        super(name, a,b, skinColor, orientation, age, weight, height);
    }
    public String ThingAction(Debily k, Thing x){
        return "Получив по щам, " + k.skinColor.getSkinColor() + k.getOrientation() + k.getName() + " завертелся волчком и полетел через всю " + x.getName();
    }
    public String GetPunched(Debily x, Debily n){
        return "Оклемавшись от удара нанесенного " + x.getName() + ", " + n.getName() + " прокричал: Что ты делаешь? Мне всего " + n.getAge() + " лет";
    }
    // вложенный нестатический класс
    private class RunnyNose {
        public void blowNose(){
            System.out.println("У" + " " + name + " " + "текут сопли");
        }
    }
}
//    public void cry(){
//        System.out.println(name + " "+ "заплакал");
//    }