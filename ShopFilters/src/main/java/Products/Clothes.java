package Products;

import Products.Tradeable;

public class Clothes extends Tradeable {
    private String size;


    public Clothes(String name, double price, double weight, String country, String deliveryDate, String size) {
        super(name, price, weight, country, deliveryDate);
        this.size = size;
    }

    public Clothes() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}



