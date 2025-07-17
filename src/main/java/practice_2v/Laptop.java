package practice_2v;

public class Laptop {
    String brand;
    double price;

    Laptop(String someBrand, double somePrice){
        this.brand = someBrand;
        this.price = somePrice;

    }

    String getBrand(){
        return this.brand;

    }
    double getPrice(){
        return this.price;

    }
    void setPrice(double newPrice){
        this.price = newPrice;
    }
    void setBrand(String newBrand){
        this.brand = newBrand;

    }
    void printInfo(){
        System.out.println("Laptop brand " + this.brand + " price " + this.price);
    }

}
