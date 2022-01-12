import java.util.Objects;

public abstract class Debily implements Staty {
    protected double a;
    protected double b;
    protected String name;
    protected SkinColor skinColor;
    protected String orientation;
    protected int weight;
    protected int height;
    protected int age;

    Debily(String name, double a, double b, SkinColor skinColor, String orientation, int age, int weight, int height) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.skinColor = skinColor;
        this.orientation = orientation;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    @Override
    public double getA(){
        return this.a;
    }

    @Override
    public double getB(){
        return this.b;
    }

    @Override
    public double setA(double a){
        this.a = a;
        return a;
    }

    @Override
    public double setB(double b){
        this.b = b;
        return b;
    }
    @Override
    public String getName() {
        return this.name;
    }
//    @Override
//    public SkinColor getSkinColor() {
//        return this.skinColor;
//    }

    @Override
    public String getOrientation() {
        return this.orientation;
    }
    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
    @Override
    public String toString(){
        return "Debil{" + "name= '" + name + '\n' + ", skin color= '" + skinColor + '\n' + ", orientation= '"
                + orientation + '\n' + ", age= " + age + '\n' + ", weight=" + weight + '\n' + ", height=" + height + '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, a, b);
    }
    @Override
    public boolean equals(Object m) {
        if (this == m) return true;
        if (m == null || getClass() != m.getClass()) return false;
        Debily Debily = (Debily) m;
        return Objects.equals(name, Debily.name)
                && Objects.equals(a, Debily.a)
                && Objects.equals(b, Debily.b);
    }
    public void cry(){
        System.out.println(name + " "+ "заплакал");
        final int x = 1;
        class SomeClass {
            public void someMethod(){
                System.out.println(name);
                System.out.println(x);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);
    }
    private void test(Object object){

    }
    // вложенный статический класс
    public static class Crazy {
        String name;
        public Crazy(double Crazy) {
            this.Crazy = Crazy;
        }
        private final double Crazy;
        public double getCrazy(){
            return Crazy;
        }
        public String setCrazy(double Crazy) throws TalkerException{
            if(Crazy == 0) {
                return (name + " " + "не сошел с ума, все в порядке");
            } else {
                throw new TalkerException(name + " " + "сошёл с ума...");
            }
        }
    }
//    public void Blownose(double amount){
//        try {
//            if(amount == 0){
//                System.out.println("У" + " " + name + " " + "текут сопли");
//            }
//        } catch (TalkerException p){
//            Talker.talk()
//        }
//    }
}
//    @Override
//    public int hashCode(){
//        return Objects.hash(name, )
//    }

