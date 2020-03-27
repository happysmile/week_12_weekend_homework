package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    protected Materials material;
    protected Colours colour;
    protected Types type;
    protected double buyingPrice;
    protected double sellingPrice;

    public Instrument(Materials material, Colours colour, Types type, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public Materials getMaterial() {
        return this.material;
    }

    public void setMaterial(Materials material) {
        this.material = material;
    }

    public Colours getColour() {
        return this.colour;
    }

    public void setColour(Colours colour) {
        this.colour = colour;
    }

    public Types getType() {
        return this.type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String play(){
        return "Music";
    };

    public double calculateMarkup(){
        // Gross Profit = Selling Price – Buying Price
       return this.sellingPrice - this.buyingPrice;
    };


}
