package moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    int spec_attack = 0;
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.7) {
            if (spec_attack < 6) {
                p.setMod(Stat.ATTACK, +1);
                spec_attack++;
            }
        }
    }

//    @Override
//    protected void applyOppDamage(Pokemon p, double damage) {
//        p.setMod(Stat.HP, (int) Math.round(damage));
//    }

    @Override
    protected String describe() {
        return "is using Charge BeaM O_O";
    }
}
