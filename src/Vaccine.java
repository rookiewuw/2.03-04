public class Vaccine{
    private double price;
    private String type;
    Vaccine(String type,double price){
        this.price=price;
        this.type=type;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
}
