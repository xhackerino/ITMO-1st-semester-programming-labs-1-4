public enum Temperature {
    HOT("горячая"), COLD("холодная");

    private final String temp;
    Temperature(String temp){
        this.temp=temp;
    }
    public String getTemp(){
        return temp;
    }
}

