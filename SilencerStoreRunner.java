class SilencerStoreRunner {

    public static void main(String[] args) {

        Silencer s1 = new Silencer("Yamaha", "Steel", 10, 2.5, "Black", 1000, "Sport", true, "Bike", "India");
        Silencer s2 = new Silencer("Honda", "Alloy", 11, 2.8, "Silver", 1200, "Standard", true, "Bike", "Japan");
        Silencer s3 = new Silencer("Suzuki", "Steel", 12, 3.0, "Black", 1300, "Sport", false, "Bike", "Japan");
        Silencer s4 = new Silencer("Bajaj", "Iron", 9, 2.2, "Gray", 900, "Standard", true, "Bike", "India");
        Silencer s5 = new Silencer("TVS", "Steel", 10.5, 2.6, "Black", 1100, "Sport", true, "Bike", "India");
        Silencer s6 = new Silencer("RoyalEnfield", "Steel", 13, 3.5, "Chrome", 2000, "Classic", false, "Bike", "India");
        Silencer s7 = new Silencer("KTM", "Alloy", 11.5, 2.9, "Orange", 1800, "Sport", true, "Bike", "Austria");
        Silencer s8 = new Silencer("Ducati", "Carbon", 12.5, 2.7, "Red", 3000, "Racing", true, "Bike", "Italy");
        Silencer s9 = new Silencer("BMW", "Steel", 13.2, 3.1, "Black", 3500, "Premium", false, "Bike", "Germany");
        Silencer s10 = new Silencer("Kawasaki", "Alloy", 12.8, 3.0, "Green", 2500, "Sport", true, "Bike", "Japan");

        Silencer s11 = new Silencer("Hero", "Iron", 9.5, 2.3, "Black", 800, "Standard", true, "Bike", "India");
        Silencer s12 = new Silencer("Mahindra", "Steel", 10.2, 2.4, "Gray", 950, "Standard", false, "Bike", "India");
        Silencer s13 = new Silencer("Aprilia", "Alloy", 11.7, 2.8, "Red", 2200, "Sport", true, "Bike", "Italy");
        Silencer s14 = new Silencer("Benelli", "Steel", 12.3, 3.2, "Black", 2700, "Sport", true, "Bike", "Italy");
        Silencer s15 = new Silencer("Harley", "Chrome", 14, 4.0, "Silver", 5000, "Cruiser", false, "Bike", "USA");
        Silencer s16 = new Silencer("Triumph", "Steel", 13.5, 3.6, "Black", 4200, "Classic", true, "Bike", "UK");
        Silencer s17 = new Silencer("Norton", "Alloy", 12.9, 3.1, "Gray", 3800, "Premium", true, "Bike", "UK");
        Silencer s18 = new Silencer("MVAgusta", "Carbon", 13.1, 2.9, "Red", 4500, "Racing", true, "Bike", "Italy");
        Silencer s19 = new Silencer("Yezdi", "Steel", 10.8, 2.7, "Black", 1500, "Classic", false, "Bike", "India");
        Silencer s20 = new Silencer("Jawa", "Iron", 10.6, 2.6, "Black", 1400, "Classic", true, "Bike", "India");

        SilencerStore silencerStore = new SilencerStore();

        silencerStore.save(s1);
        silencerStore.save(s2);
        silencerStore.save(s3);
        silencerStore.save(s4);
        silencerStore.save(s5);
        silencerStore.save(s6);
        silencerStore.save(s7);
        silencerStore.save(s8);
        silencerStore.save(s9);
        silencerStore.save(s10);
        silencerStore.save(s11);
        silencerStore.save(s12);
        silencerStore.save(s13);
        silencerStore.save(s14);
        silencerStore.save(s15);
        silencerStore.save(s16);
        silencerStore.save(s17);
        silencerStore.save(s18);
        silencerStore.save(s19);
        silencerStore.save(s20);

        silencerStore.displayAll();
    }
}