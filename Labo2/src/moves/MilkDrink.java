package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class MilkDrink extends StatusMove {
    int hpRestore = 0;
    double random = Math.random();
    public MilkDrink() {
        super(Type.NORMAL, 0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if (random <= 0.5) {
            hpRestore = ((int) random) * 10;
            p.setMod(Stat.HP, -hpRestore);
        }
    }
}
