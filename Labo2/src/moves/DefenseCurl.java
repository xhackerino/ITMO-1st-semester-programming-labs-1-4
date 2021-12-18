package moves;

import ru.ifmo.se.pokemon.*;

public class DefenseCurl extends StatusMove {
    public DefenseCurl() {
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect ef1 = new Effect().stat(Stat.DEFENSE, +1);
    }
    @Override
    protected String describe() {
        return "increasing defense using Defence Curl ^_^";
    }
}
