package instruments;

public enum Types {

    STRING("String"),
    WOODWIND("Woodwind"),
    BRASS("Brass"),
    PERCUSSION("Percussion"),
    KEYBOARD("Keyboard"),
    GUITAR("Guitar");

    private final String value;

    // constructor
    Types(String value) {
        this.value = value;
    }

    // getter
    public String getValue() {
        return this.value;
    }
}
