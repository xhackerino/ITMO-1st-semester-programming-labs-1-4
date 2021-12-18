public class Main {
    public static void main(String[] args) {
        Pan pan = new Pan("кастрюля с кашей", Temperature.HOT);
        Room room = new Room("комната", Temperature.COLD);
        Porridge porridge = new Porridge("Манная каша",Temperature.HOT);
        Neznaika neznaika = new Neznaika("Незнайка",15,30,SkinColor.ALBO,"Натурал",48,94,190);
        Shpuntik shpuntik = new Shpuntik("Шпунтик", 138947,180,SkinColor.BLACK, "Гомосексуал ", 13, 45, 152);
        Ponchik ponchik = new Ponchik("Пончик", 9250, 9250, SkinColor.CHINESE, "натурал", 75, 66, 180);
        System.out.println(neznaika.Moving(neznaika, shpuntik));
        if (Math.random() < 0.8) {
            System.out.println(shpuntik.ThingAction(shpuntik,room));
            System.out.println(pan.ThingAction(pan));
            System.out.println(porridge.ThingMoving(pan, porridge));
            System.out.println(neznaika.ThingAction(neznaika, pan));
            System.out.println(shpuntik.GetPunched(neznaika, shpuntik));
            System.out.println(porridge.toFace(pan,porridge,neznaika,ponchik));
            System.out.println(ponchik.ThingAction(ponchik,porridge));
            
        }
        else {
            System.out.println(neznaika.Dead(neznaika));
        }
        System.out.println("THE END");
    }
}
