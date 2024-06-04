class Laptop extends Product {
    int storage;
    double screen;
    int ram;

    public Laptop(int id, String productName, double price, String brand, int storage, double screen, int ram) {
        super(id, productName, price, brand);
        this.storage = storage;
        this.screen = screen;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | " + storage + " GB" +
                " | " + screen + "\"" +
                " | " + ram + " GB";
    }
}