import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab2 {
    // https://pokemondb.net/pokedex/drampa
    // https://pokemondb.net/pokedex/cubone
    // https://pokemondb.net/pokedex/marowak
    // https://pokemondb.net/pokedex/budew
    // https://pokemondb.net/pokedex/roselia
    // https://pokemondb.net/pokedex/roserade
    public static void main(String[] args) {
        Battle arena = new Battle();
        Pokemon p1 = new Cubone("Taras", 1);
        Pokemon p2 = new Roselia("Olesya", 1);
        Pokemon p3 = new Drampa("Natasha", 1);
        Pokemon p4 = new Budew("Muhammed", 1);
        Pokemon p5 = new Roserade("Madina", 1);
        Pokemon p6 = new Marowak("Vladimir", 1);
        arena.addAlly(p1);
        arena.addAlly(p2);
        arena.addAlly(p3);
        arena.addFoe(p4);
        arena.addFoe(p5);
        arena.addFoe(p6);
        arena.go();
    }
}
