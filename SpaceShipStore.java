class SpaceShipStore {

    SpaceShip[] spaceShips = new SpaceShip[20];
    int index = 0;

    void save(SpaceShip spaceShip) {

        if (spaceShip != null) {

            if (index < spaceShips.length) {
                spaceShips[index] = spaceShip;
                System.out.println("Saved at index: " + index);
                index++;
            } 
			else {
                System.out.println("Array is full");
            }

        } 
		else {
            System.out.println("SpaceShip is null");
        }
    }

    void displayAll() {

        for (SpaceShip s : spaceShips) {
            if (s != null) {
                s.display();
            }
        }
    }
}