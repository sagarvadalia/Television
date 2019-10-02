//Sagar Vadalia, Saud Millwala, Mack Derly Fonrose, Steven Salmon
public class Television {
    //data values
    private String brand;
    private double price;
    //default constructor
    public Television(){
        this.brand = "undefined brand";
        this.price = 0.0;
    }
    //overloaded constructor
    public Television(String brand, double price){
        this.brand = brand;
        this.setPrice(price);
    }
    //price accessor
    double getPrice(){
        return this.price;
    }
    //price mutator
    void setPrice(double price){
        if(price > 0.0){
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }
    //brand accessor
    public String getBrand(){
        return this.brand;
    }
    //brand mutator
    public void setBrand(String brand){
        this.brand = brand;
    }
    //to string: returns brand and price
    public String toString(){
        return "the brand is: " + this.brand + " and the price is: " + this.price;
    }
    //equals: compares brand and price for equality. returns true or false
    public boolean equals(Television otherTelevision){
        if(this.brand == otherTelevision.brand && this.price == otherTelevision.price){
            return true;
        }
        return false;
    }
}
