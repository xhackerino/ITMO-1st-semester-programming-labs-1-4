package moves;
import ru.ifmo.se.pokemon.*;
import pokemons.Drampa;

public class Rest extends StatusMove { // rest наследует status move
    public Rest(){
        super(Type.PSYCHIC, 0,0); // физический тип атаки
    }
    @Override // аннотация переопределения методом ниже своего родителя
    protected void applySelfEffects(Pokemon p) { // метод на p - атакующего покемона
        int hpRestored = (int) p.getHP() + (int) p.getHP()/2; // значение здоровья
        Effect ef = new Effect().stat(Stat.HP, hpRestored); // устанавливает значение хар-ки здоровья
        Effect ef1 = new Effect().turns(2).condition(Status.SLEEP); // эффект сна продолжительность 2 хода
        p.addEffect(ef); // добавляет эффект ef (healed)
        p.setCondition(ef1); // устанавливает состояние ef1 (sleep)
    }

    @Override
    protected String describe() {
        return "got Full HP. Sleeping 2 turns";
    }
}
