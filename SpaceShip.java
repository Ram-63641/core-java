class SpaceShip {

    String name;
    String country;
    double speed;
    int capacity;
    String fuelType;
    boolean isReusable;
    double weight;
    String missionType;
    int launchYear;
    String destination;

    SpaceShip(String name, String country, double speed, int capacity,
              String fuelType, boolean isReusable, double weight,
              String missionType, int launchYear, String destination) {

        this.name = name;
        this.country = country;
        this.speed = speed;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.isReusable = isReusable;
        this.weight = weight;
        this.missionType = missionType;
        this.launchYear = launchYear;
        this.destination = destination;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Speed: " + speed);
        System.out.println("Capacity: " + capacity);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Reusable: " + isReusable);
        System.out.println("Weight: " + weight);
        System.out.println("Mission: " + missionType);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Destination: " + destination);
        
    }
}