class LaserStore {

    Laser[] lasers = new Laser[20];
    int index = 0;

    void save(Laser laser) {

        if (laser != null) {

            if (index < lasers.length) {
                lasers[index] = laser;
                System.out.println("Saved at index: " + index);
                index++;
            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Laser is null");
        }
    }

    void displayAll() {

        for (Laser l : lasers) {
            if (l != null) {
                l.display();
            }
        }
    }
}