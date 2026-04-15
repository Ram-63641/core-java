class CricketStore {

    Cricket[] crickets = new Cricket[20];
    int index = 0;

    void save(Cricket cricket) {

        if (cricket != null) {

            if (index < crickets.length) {
                crickets[index] = cricket;
                System.out.println("Saved at index: " + index);
                index++;
            } 
			else {
                System.out.println("Array is full");
            }

        } 
		else {
            System.out.println("Cricket is null");
        }
    }

    void displayAll() {

        for (Cricket c : crickets) {
            if (c != null) {
                c.display();
            }
        }
    }
}