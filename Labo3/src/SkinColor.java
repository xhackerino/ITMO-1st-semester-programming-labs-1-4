public enum SkinColor {
    BLACK("чернокожий "),
    WHITE("белокожий "),
    ALBO("альбинос"),
    CHINESE("желтый");

    private final String skinColor;
    SkinColor(String skinColor){
        this.skinColor=skinColor;
    }
    public String getSkinColor(){
        return skinColor;
    }
}
