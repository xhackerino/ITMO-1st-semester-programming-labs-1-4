package moves;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY, 80, 100);
    }
//    private final static String MESSAGE = "Покемон потерял сознание";

//    @Override
//    protected void applyOppDamage(Pokemon p, double damage) { // - метод на def - обороняющегося   покемона
//        p.setMod(Stat.HP, (int) Math.round(damage));
//    }

//    @Override
//    protected void applyOppEffects(Pokemon p) {
//        boolean a = p.isAlive();
//        if (!p.isAlive()) {
//            System.out.println(a);
//        }
//    }
@Override
protected String describe() {
    return "is using DAZZLING GLEAM!!!";
}
}