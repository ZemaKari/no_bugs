package practice_2v;

public class Product {
    String name;
    double price;

    Product(double somePrice){
        this.price = somePrice;

    }

    double getPrice(){
        return this.price;
    }
    void setPrice(double newPrice){
        this.price = newPrice;

    }

    double applyDiscount(int discount){
        return this.price -= ((this.price * discount)/100);
    }

    void printInfo(){
        System.out.println(this.name +"стоят "+ this.price);

    }


}
