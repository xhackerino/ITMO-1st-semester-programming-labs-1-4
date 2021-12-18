package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
        if (!pokemon.isAlive()) {
            System.out.println("Покемон теряет сознание");
        }
    }
//    @Override
//    protected void applyOppDamage(Pokemon def, double damage) {
//        Status opp = def.getCondition();
//        if (opp.equals(Status.PARALYZE) || opp.equals(Status.BURN)) {
//
//        }
//    }
    @Override
    protected String describe(){
        return "using Aerial Ace!";
    }
}
