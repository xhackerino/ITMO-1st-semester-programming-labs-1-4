public class Pan extends Thing{
    public Pan(String name, Temperature temp) {
        super(name, temp);
    }
    @Override
    public String ThingAction(Thing p){
        return "На плите стояла " + p.getName();
    }
}
