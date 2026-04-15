class BroccoliStore {

    Broccoli[] broccolis = new Broccoli[20];
    int index = 0;

    void save(Broccoli broccoli) {

        if (broccoli != null) {

            if (index < broccolis.length) {
                broccolis[index] = broccoli;
                System.out.println("Saved at index: " + index);
                index++;
            } 
		}			
		else {
            System.out.println("Broccoli is null");
        }
    }

    void displayAll() {

        for (Broccoli b : broccolis) {
            if (b != null) {
                b.display();
            }
        }
    }
}