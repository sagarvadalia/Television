public class Television {
    private String brand;
    private double price;
    public Television(){
        this.brand = "undefined brand";
        this.price = 0.0;
    }
    public Television(String brand, double price){
        this.brand = brand;
        this.setPrice(price);
    }
    double getPrice(){
        return this.price;
    }
    void setPrice(double price){
        if(price > 0.0){
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String toString(){
        return "the brand is: " + this.brand + " and the price is: " + this.price;
    }
    public boolean equals(Television otherTelevision){
        if(this.brand == otherTelevision.brand && this.price == otherTelevision.price){
            return true;
        }
        return false;
    }
}
