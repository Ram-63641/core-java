class GloveStore {

    Glove[] gloves = new Glove[20];
    int index = 0;

    void save(Glove glove) {

        if (glove != null) {

            if (index < gloves.length) {
                gloves[index] = glove;
                System.out.println("Saved at index: " + index);
                index++;
            } 
			else {
                System.out.println("Array is full");
            }

        } 
		else {
            System.out.println("Glove is null");
        }
    }

    void displayAll() {

        for (Glove g : gloves) {
            if (g != null) {
                g.display();
            }
        }
    }
}