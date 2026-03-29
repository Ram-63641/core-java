class CabinetRunner {
    public static void main(String[] args) {

        Cabinet c1 = new Cabinet();

        c1.weight = 50;
        c1.brand = "Godrej";
        c1.type = "Office";
        c1.doors = 2;
        c1.width = 3.2;
        c1.location = "Room1";
        c1.shelves = 5;
        c1.lock = true;
        c1.owner = "Ram";
        c1.code = 101;

        System.out.println(c1.price);
        System.out.println(c1.brand);
    }
}