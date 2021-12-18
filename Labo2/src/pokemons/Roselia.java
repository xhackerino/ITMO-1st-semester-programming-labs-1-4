package pokemons;

import moves.CottonSpore;
import moves.Facade;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Pokemon {
    public Roselia(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(50, 60,45,100,80,65);
        setMove(new Rest(), new Facade(), new CottonSpore());
    }
}
