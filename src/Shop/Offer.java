package Shop;

public class Offer {
    public Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    void printInfo(){
        System.out.println(product.name + " " + product.producer + " " + price + " " + " oferta specjalna: " + special);
    }

    Product product;
    double price;
    boolean special;
}

