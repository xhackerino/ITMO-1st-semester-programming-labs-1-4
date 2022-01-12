public class Porridge extends Thing implements ThingMove {
    public Porridge(String name, Temperature temp){
        super(name,temp);
    }
    @Override
    public String ThingMoving(Thing x, Thing s){
        return "В " + x.getName() + " находится " + s.temp.getTemp() + " " + s.getName();
    }
    public String toFace(Thing k, Thing s, Debily u, Debily a){
        return "От столкновения с " + u.getName() + ", " + k.getName() + " падает и " + s.getName() +
                " выплескивается на лицо ничего не подозревающего " + a.skinColor.getSkinColor() + " "
                + a.getOrientation() + " " +  a.getAge() + "-ти лет " +  a.getName() + "a";
    }
}
