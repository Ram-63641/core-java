class TissueStore {

    Tissue[] tissues = new Tissue[20];
    int index = 0;

    void save(Tissue tissue) {

        if (tissue != null) {

            if (index < tissues.length) {
                tissues[index] = tissue;
                System.out.println("Saved at index: " + index);
                index++;
            } 
			else {
                System.out.println("Array is full");
            }

        } 
		else {
            System.out.println("Tissue is null");
        }
    }

    void displayAll() {

        for (Tissue t : tissues) {
            if (t != null) {
                t.display();
            }
        }
    }
}