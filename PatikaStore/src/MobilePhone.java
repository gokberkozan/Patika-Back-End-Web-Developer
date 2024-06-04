class MobilePhone extends Product {
    int storage;
    double screen;
    int camera;
    double battery;
    int ram;
    String color;

    public MobilePhone(int id, String productName, double price, String brand, int storage, double screen, int camera, double battery, int ram, String color) {
        super(id, productName, price, brand);
        this.storage = storage;
        this.screen = screen;
        this.camera = camera;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public String toString() {
        return super.toString() +
                " | " + storage + " GB" +
                " | " + screen + "\"" +
                " | " + camera +
                " | " + battery +
                " | " + ram + " GB" +
                " | " + color;
    }
}