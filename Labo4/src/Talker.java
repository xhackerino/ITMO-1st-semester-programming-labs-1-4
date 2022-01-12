public class Talker extends Neznaika {
//    String name;
    boolean isPersonNeznaika;
    boolean isPersonTalk;
    public Talker(){
        super("Незнайка",15,30,SkinColor.ALBO,"Натурал",48,94,190);
//        this.name=name;
    }
    public void personTalk(){
        System.out.println("Кое-кто очень хочет кое-что Вам рассказать. Cлушаем внимательно!");
        this.isPersonTalk = true;
    }
    public void pickNeznaika(){
        System.out.println("Наш рассказчик сегодня - Незнайка");
        this.isPersonNeznaika = true;
    }
    public void talk() throws TalkerException {
        if(isPersonNeznaika && isPersonTalk) {
            System.out.println("Начало рассказа..." + '\n' + "А" + " " + name + " " + "сказал:" + " ");
        } else {
            throw new TalkerException("Рассказчик" + " " + name + " " + "передумал говорить" + "." + " "
                    + "Истории не будет." + " " + "Повторите попытку позднее.");
        }
    }
}

