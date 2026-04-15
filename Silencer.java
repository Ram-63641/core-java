class Silencer {

    String brand;
    String material;
    double length;
    double weight;
    String color;
    double price;
    String type;
    boolean isRemovable;
    String vehicleType;
    String origin;

    Silencer(String brand, String material, double length, double weight,
             String color, double price, String type,
             boolean isRemovable, String vehicleType, String origin) {

        this.brand = brand;
        this.material = material;
        this.length = length;
        this.weight = weight;
        this.color = color;
        this.price = price;
        this.type = type;
        this.isRemovable = isRemovable;
        this.vehicleType = vehicleType;
        this.origin = origin;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Removable: " + isRemovable);
        System.out.println("Vehicle: " + vehicleType);
        System.out.println("Origin: " + origin);
       
    }
}