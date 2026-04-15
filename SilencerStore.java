class SilencerStore {

    Silencer[] silencers = new Silencer[20];
    int index = 0;

    void save(Silencer silencer) {
        if (silencer != null) {
            if (index < silencers.length) {
                silencers[index] = silencer;
                index++;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Silencer is null");
        }
    }

    void displayAll() {
        for (Silencer s : silencers) {
            if (s != null) {
                s.display();
            }
        }
    }
}