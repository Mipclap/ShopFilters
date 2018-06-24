package Products;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Food.class, name = "food"),
        @JsonSubTypes.Type(value = Clothes.class, name = "clothes"),
        @JsonSubTypes.Type(value = Knife.class, name = "knife")
})


abstract public class Tradeable {
    private String name;
    private double price;
    private double weight;
    private String country;
    private String deliveryDate;


    public Tradeable(String name, double price, double weight, String country, String deliveryDate) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.country = country;
        this.deliveryDate = deliveryDate;
    }

        public Tradeable() {
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}