class Glove {

    String brand;
    String material;
    String size;
    String color;
    double price;
    boolean isWaterproof;
    String type;
    String usage;
    String origin;
    int warranty;

    Glove(String brand, String material, String size, String color,
          double price, boolean isWaterproof, String type,
          String usage, String origin, int warranty) {

        this.brand = brand;
        this.material = material;
        this.size = size;
        this.color = color;
        this.price = price;
        this.isWaterproof = isWaterproof;
        this.type = type;
        this.usage = usage;
        this.origin = origin;
        this.warranty = warranty;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Type: " + type);
        System.out.println("Usage: " + usage);
        System.out.println("Origin: " + origin);
        System.out.println("Warranty: " + warranty + " months");
        
    }
}