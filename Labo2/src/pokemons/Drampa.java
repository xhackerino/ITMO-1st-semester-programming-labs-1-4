package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Drampa extends Pokemon {
    public Drampa(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.DRAGON);
        setStats(78,60,85,135,91,36);
        setMove(new Rest(), new DazzlingGleam(), new ChargeBeam(), new ThunderWave());
    }
}
