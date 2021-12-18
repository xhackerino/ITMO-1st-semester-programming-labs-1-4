package pokemons;

import moves.Facade;
import moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(40, 30, 35, 50, 70, 55);
        setMove(new Rest(), new Facade());
    }
}

