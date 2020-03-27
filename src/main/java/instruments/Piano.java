package instruments;

public class Piano extends Instrument {

    public Piano(Materials material, Colours colour, Types type, double buyingPrice, double sellingPrice) {
        super(material, colour, type, buyingPrice, sellingPrice);
    }

    public String play(){
        return "Moonlight Sonata";
    };

}
