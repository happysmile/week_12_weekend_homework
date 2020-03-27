package instruments;

public enum Materials {
    WOOD("Wood"),
    STEEL("Steel"),
    BRASS("Brass"),
    BRONZE("Bronze"),
    NICKEL_SILVER("Nickel-Silver"),
    ALUMINUM("Aluminum"),
    PLASTIC("Plastic");

    private final String value;

    // constructor
    Materials(String value){
        this.value = value;
    }

    //getter
    public String getValue(){
        return this.value;
    }

}
