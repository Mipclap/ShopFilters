package Products;

public class Food extends Tradeable {
    private String expirationDate;

    public Food(String name, double price, double weight, String country, String deliveryDate, String expirationDate){

        super(name, price, weight, country, deliveryDate);
        this.expirationDate = expirationDate;

    }

    public Food(){}

    public String getExpirationDate(){
        return expirationDate;
    }


    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }
}
