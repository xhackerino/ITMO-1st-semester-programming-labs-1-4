public class Thing {
    private final String name;
    protected Temperature temp;

    public Thing(String name, Temperature temp){
        this.name = name;
        this.temp = temp;
    }
    public String getName(){
        return name;
    }
//    public Temperature getTemp(){
//        return temp;
//    }
    public String ThingAction(Thing o){
        return "";
    }
}