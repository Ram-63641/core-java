class Broccoli {

    String type;
    String color;
    double weight;
    double price;
    boolean isFresh;
    String origin;
    String quality;
    int quantity;
    String expiryDate;
    String shape;

    Broccoli(String type, String color, double weight, double price,
             boolean isFresh, String origin, String quality,
             int quantity, String expiryDate, String shape) {

        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.isFresh = isFresh;
        this.origin = origin;
        this.quality = quality;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.shape = shape;
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Fresh: " + isFresh);
        System.out.println("Origin: " + origin);
        System.out.println("Quality: " + quality);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry: " + expiryDate);
        System.out.println("Shape: " + shape);
        
    }
}