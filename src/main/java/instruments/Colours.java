package instruments;

public enum Colours {
    RED("Red"),
    BLUE("Blue"),
    YELLOW("Yellow"),
    GREEN("Green"),
    ORANGE("Orange"),
    PINK("Pink"),
    PURPLE("Purple"),
    BLACK("Black"),
    BROWN("Brown"),
    WHITE("White"),
    GREY("Grey");

    private final String value;

    // constructor
    Colours(String value){
        this.value = value;
    }

    //getter
    public String getValue(){
        return this.value;
    }

}
