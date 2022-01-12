import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Pan pan = new Pan("кастрюля с кашей", Temperature.HOT);
        Room room = new Room("комната", Temperature.COLD);
        Porridge porridge = new Porridge("Манная каша",Temperature.HOT);
        Neznaika neznaika = new Neznaika("Незнайка",15,30,SkinColor.ALBO,"Натурал",48,94,190);
        Shpuntik shpuntik = new Shpuntik("Шпунтик", 138947,180,SkinColor.BLACK, "Гомосексуал ", 13, 45, 152);
        Ponchik ponchik = new Ponchik("Пончик", 9250, 9250, SkinColor.CHINESE, "Гетеросексуал", 75, 66, 180);
        Debily.Crazy crazy = new Debily.Crazy(0);
        PersonAmount personAmount = new PersonAmount();
        personAmount.personas();
        Talker talker = new Talker();
        talker.personTalk();
        talker.pickNeznaika();
        Drink deadponchik = new Drink() {
            @Override
            public void drink() {
                System.out.println("Пончик уже не может выпить молока");
            }
        };
        try {
            talker.talk();
            shpuntik.cry();
//            shpuntik.blowNose();
            System.out.println(neznaika.Moving(neznaika, shpuntik));
            System.out.println(shpuntik.ThingAction(shpuntik,room));
            System.out.println(pan.ThingAction(pan));
            System.out.println(porridge.ThingMoving(pan, porridge));
            System.out.println(neznaika.ThingAction(neznaika, pan));
            System.out.println(shpuntik.GetPunched(neznaika, shpuntik));
            System.out.println(porridge.toFace(pan,porridge,neznaika,ponchik));
            System.out.println(ponchik.ThingAction(ponchik,porridge));
            deadponchik.drink();
        } catch (TalkerException n) {
            System.out.println(n.getMessage());
            n.printStackTrace();
        }
////        else {
////            System.out.println(neznaika.Moving(neznaika, shpuntik));
////            System.out.println(neznaika.Dead(neznaika));
////        }
        System.out.println("The End.");
    }
}
