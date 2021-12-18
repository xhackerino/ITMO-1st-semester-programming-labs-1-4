package moves;

import ru.ifmo.se.pokemon.*;

public class CottonSpore extends StatusMove {
    public CottonSpore() {
        super(Type.GRASS, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect ef1 = new Effect().stat(Stat.SPEED, -2);
        p.addEffect(ef1);
    }
    @Override
    protected String describe() {
        return "uses Cotton Spore...";
    }
}