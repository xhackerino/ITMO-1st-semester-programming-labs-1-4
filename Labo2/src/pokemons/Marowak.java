package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Marowak extends Pokemon {
    public Marowak(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(60,80,110,50,80,45);
        setMove(new AerialAce(), new MudBomb(),new Rest(), new IceBeam());
    }
}
