class Laser {

    String brand;
    String type;
    double power;
    String color;
    double wavelength;
    boolean isPortable;
    double price;
    String usage;
    String origin;
    int warranty;

    Laser(String brand, String type, double power, String color,
          double wavelength, boolean isPortable, double price,
          String usage, String origin, int warranty) {

        this.brand = brand;
        this.type = type;
        this.power = power;
        this.color = color;
        this.wavelength = wavelength;
        this.isPortable = isPortable;
        this.price = price;
        this.usage = usage;
        this.origin = origin;
        this.warranty = warranty;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Power: " + power);
        System.out.println("Color: " + color);
        System.out.println("Wavelength: " + wavelength);
        System.out.println("Portable: " + isPortable);
        System.out.println("Price: " + price);
        System.out.println("Usage: " + usage);
        System.out.println("Origin: " + origin);
        System.out.println("Warranty: " + warranty + " years");
       
    }
}