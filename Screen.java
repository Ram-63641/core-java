class Screen {

    String brand;
    double size;
    String type;
    double price;
    String resolution;
    boolean isSmart;
    int refreshRate;
    String color;
    String warranty;
    String origin;

    Screen(String brand, double size, String type, double price, String resolution,
           boolean isSmart, int refreshRate, String color, String warranty, String origin) {

        this.brand = brand;
        this.size = size;
        this.type = type;
        this.price = price;
        this.resolution = resolution;
        this.isSmart = isSmart;
        this.refreshRate = refreshRate;
        this.color = color;
        this.warranty = warranty;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Resolution: " + resolution);
        System.out.println("Smart: " + isSmart);
        System.out.println("RefreshRate: " + refreshRate);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        
    }

} 