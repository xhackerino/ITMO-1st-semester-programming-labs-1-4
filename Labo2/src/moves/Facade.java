package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100); // or 1.0
    }
    @Override
    protected void applyOppDamage(Pokemon def, double v) {
        if (def.getCondition() == Status.BURN || def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE) {
            def.setMod(Stat.HP, (int)v*2);
        }
    }
    @Override
    protected String describe() {
        return "hitting with double power using Facade!";
    }
}
//    @Override
//    protected void applyOppDamage(Pokemon p, double v) {
//        super.applyOppDamage(p, v);
//        if (!p.isAlive()) {
//            System.out.println("Илюшка хуйлан");
//        }
//    }
