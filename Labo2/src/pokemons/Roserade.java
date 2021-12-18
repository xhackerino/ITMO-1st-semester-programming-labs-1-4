package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Pokemon {
    public Roserade(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(60,70,65,125,105, 90);
        setMove(new Rest(), new Facade(), new CottonSpore(), new DefenseCurl());
    }
}
