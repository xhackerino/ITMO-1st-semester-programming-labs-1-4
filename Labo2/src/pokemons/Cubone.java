package pokemons;

import moves.AerialAce;
import moves.MudBomb;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cubone extends Pokemon {
    public Cubone(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(50,50,95,40,50,35);
        setMove(new AerialAce(), new MudBomb(), new Rest());
    }
}
