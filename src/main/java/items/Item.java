package items;

import behaviours.ISell;

public abstract class Item implements ISell {

    protected double buyingPrice;
    protected double sellingPrice;
    protected String name;
    protected String type;

    public Item(String name, String type, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calculateMarkup(){
        // Gross Profit = Selling Price – Buying Price
        return this.sellingPrice - this.buyingPrice;
    };


}
