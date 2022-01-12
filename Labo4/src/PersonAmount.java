public class PersonAmount {
    int amount = 3;
    public PersonAmount(){ // int amount
//        this.amount=amount;
    }
    public void personas() throws PersonAmountException {
        if(amount == 5) {
            System.out.println("В ролях: Незнайка, Шпунтик, Пончик");
        } else {
            throw new PersonAmountException("В этой истории не учавствует такое количество героев :(");
        }
    }
}
