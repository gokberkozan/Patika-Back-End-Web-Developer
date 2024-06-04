class Product {
    int id;
    String productName;
    double price;
    String brand;

    public Product(int id, String productName, double price, String brand) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
    }

    public String toString() {
        return "| " + id +
                " | " + productName +
                " | " + price + " TL" +
                " | " + brand;
    }
}