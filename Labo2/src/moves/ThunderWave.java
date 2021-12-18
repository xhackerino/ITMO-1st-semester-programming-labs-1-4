package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.ELECTRIC)) { // проверка типа покемона (с электр не работает)
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return "paralyzes the opponent using Thunder Wave!";
    }
}
