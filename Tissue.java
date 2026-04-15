class Tissue {

    String brand;
    String color;
    int layers;
    int quantity;
    boolean isSoft;
    double price;
    String country;
    String material;
    String packName;
    String expiryDate;

    Tissue(String brand, String color, int layers, int quantity,
           boolean isSoft, double price, String country,
           String material, String packName, String expiryDate) {

        this.brand = brand;
        this.color = color;
        this.layers = layers;
        this.quantity = quantity;
        this.isSoft = isSoft;
        this.price = price;
        this.country = country;
        this.material = material;
        this.packName = packName;
        this.expiryDate = expiryDate;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Layers: " + layers);
        System.out.println("Quantity: " + quantity);
        System.out.println("Soft: " + isSoft);
        System.out.println("Price: " + price);
        System.out.println("Country: " + country);
        System.out.println("Material: " + material);
        System.out.println("Pack: " + packName);
        System.out.println("Expiry: " + expiryDate);
        System.out.println("----------------------");
    }
}