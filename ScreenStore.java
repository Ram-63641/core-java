class ScreenStore {

    Screen[] screens = new Screen[20];
    int index = 0;

    void save(Screen screen) {

        if (screen != null) {
            if (index < screens.length) {
                screens[index] = screen;
                System.out.println("Saved at index: " + index);
                index++;
            } 
			else 
			{
                System.out.println("Array is full");
            }
        } 
		else 
		{
            System.out.println("Object is null");
        }
    }

    void displayAll() {

        for (Screen s : screens) {
            if (s != null) {
                s.display();
            }
        }
    }
}